package com.mattfred.androidai.apache;

import android.content.Context;
import android.os.AsyncTask;
import android.support.annotation.Nullable;

import opennlp.tools.util.Span;
import timber.log.Timber;

/**
 * Apache Analyzer Async Task. This will allow the Apache library to analyze input in a
 * background thread
 */

public class ApacheAnalyzer extends AsyncTask<String, Void, String> {

    /**
     * Activity context
     */
    private Context context;

    /**
     * Analyzer completed listener
     */
    private AnalyzerListener listener;

    /**
     * Constructor
     *
     * @param context  activity context
     * @param listener analyzer completed listnener
     */
    public ApacheAnalyzer(Context context, AnalyzerListener listener) {
        this.context = context;
        this.listener = listener;
    }

    /**
     * Logic to be run in background
     *
     * @param strings user input
     * @return User's name
     */
    @Override
    protected String doInBackground(String... strings) {

        String text = strings[0];

//        Parse[] parses = NLP.getParse(context, text);
//        StringBuffer sb = new StringBuffer();
//        if (parses != null) {
//            for (Parse parse : parses) {
//                parse.show(sb);
//            }
//        }

        // get tokens
        String[] results = NLP.getTokens(context, text);

//        String[] partsOfSpeech = NLP.getPartsOfSpeech(context, results);
//        if (partsOfSpeech != null) {
//            for (String string : partsOfSpeech) {
//                Timber.e(string);
//            }
//        }

        Span[] names = NLP.getNames(context, results);
        if (names != null && names.length > 0) {
            Timber.e("Size: %d", names.length);
            for (Span name : names) {
                Timber.e(name.getType());
                if (name.getType().equalsIgnoreCase("person")) {
                    Timber.e("Start: %d, End: %d", name.getStart(), name.getEnd());
                    String fullName = "";
                    for (int i = name.getStart(); i < name.getEnd(); i++) {
                        if (results != null) {
                            fullName += results[i] + " ";
                        }
                    }
                    return fullName;
                }
            }
        } else {
            Timber.e("names is null");
        }

        return null;
    }

    /**
     * Called once background logic has been completed
     *
     * @param string response
     */
    @Override
    protected void onPostExecute(@Nullable String string) {
        super.onPostExecute(string);
        if (listener != null) {
            listener.onResults(string);
        }

    }

    /**
     * Listener interface
     */
    public interface AnalyzerListener {
        void onResults(String response);
    }
}
