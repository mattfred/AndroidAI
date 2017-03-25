package com.mattfred.androidai.controllers;

import android.content.Context;

import com.mattfred.androidai.ai.Ari;
import com.mattfred.androidai.apache.ApacheAnalyzer;
import com.mattfred.androidai.models.DocumentTone;
import com.mattfred.androidai.models.Tone;
import com.mattfred.androidai.models.ToneDetails;
import com.mattfred.androidai.models.WatsonResponse;
import com.mattfred.androidai.models.WatsonText;
import com.mattfred.androidai.utils.Preferences;
import com.mattfred.androidai.watson.WatsonInterface;
import com.mattfred.androidai.watson.WatsonService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import timber.log.Timber;

/**
 * Main Activity Controller
 */

public class MainActivityController implements ApacheAnalyzer.AnalyzerListener {

    private AIResponse listener;
    private Ari ari;
    private String userName;
    private boolean userInput = false;

    public MainActivityController(AIResponse listener) {
        this.listener = listener;
        this.ari = new Ari();
        userName = Preferences.getName((Context) listener);
        onResults(ari.signon(!userName.equals(""), userName));
    }

    public void analyzeText(String text) {
        Timber.e("User name is: " + userName);
        userInput = true;
        if (userName.equals("")) {
            ApacheAnalyzer apacheAnalyzer = new ApacheAnalyzer((Context) listener, this);
            apacheAnalyzer.execute(text);
        } else {
            tryAri(text);
        }

        WatsonText watsonText = new WatsonText(text);
        WatsonInterface watsonInterface = WatsonService.getWatsonService();
        Call<WatsonResponse> call = watsonInterface.getDocumentTone("2016-05-19", watsonText);
        call.enqueue(new Callback<WatsonResponse>() {
            @Override
            public void onResponse(Call<WatsonResponse> call, Response<WatsonResponse> response) {
                analyzeResults(response.body().getDocument_tone());
            }

            @Override
            public void onFailure(Call<WatsonResponse> call, Throwable t) {

            }
        });
    }

    private void tryAri(String text) {
        if (listener != null) listener.sendResponse(ari.preprocessInput(text));
    }

    private void analyzeResults(DocumentTone documentTone) {

        Timber.d(documentTone.toString());

        for (Tone tone : documentTone.getTone_categories()) {
            if (tone.getCategory_id().equalsIgnoreCase("emotion_tone")) {
                int red = 150;
                int green = 150;
                int blue = 150;
                double joy = 0;
                int alpha = 255;
                for (ToneDetails details : tone.getTones()) {
                    switch (details.getTone_name()) {
                        case "Anger":
                            red += colorPercent(details.getScore());
                            if (red > 255) red = 255;
                            break;
                        case "Disgust":
                            green += colorPercent(details.getScore());
                            if (green > 255) green = 255;
                            break;
                        case "Sadness":
                            blue += colorPercent(details.getScore());
                            if (blue > 255) blue = 255;
                            break;
                        case "Fear":
                            alpha -= (colorPercent(details.getScore()) / 2);
                            break;
                        case "Joy":
                            joy = details.getScore() * 100;
                            break;
                    }
                }
                if (red == 150 && blue == 150 && green == 150 && joy < 60) {
                    if (listener != null) listener.onWatsonResults(255, 255, 255); // white
                } else if (joy > 60) {
                    if (listener != null) listener.onWatsonResults(255, 255, 0); // yellow
                } else {
                    if (listener != null) listener.onWatsonResults(red, green, blue);
                }
            }
        }

    }

    private int colorPercent(double value) {
        double num = value * 100 * 2;
        return (int) num;
    }

    @Override
    public void onResults(String response) {
        Timber.e("On Results: " + response);
        if (listener != null)
            if (userName.equals("") && userInput) {
                if (!response.equals("")) {
                    userName = response;
                    Preferences.saveName((Context) listener, response);
                    listener.sendResponse("Hello, " + response);
                }
            } else {
                listener.sendResponse(response);
            }
        if (userInput) userInput = !userInput;
    }

    public interface AIResponse {
        void onWatsonResults(int red, int green, int blue);
        void sendResponse(String text);
    }
}
