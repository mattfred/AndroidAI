package com.mattfred.androidai;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.mattfred.androidai.models.DocumentTone;
import com.mattfred.androidai.models.Tone;
import com.mattfred.androidai.models.ToneDetails;
import com.mattfred.androidai.models.WatsonResponse;
import com.mattfred.androidai.models.WatsonText;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Main Activity Controller
 */

public class MainActivityController {

    private static final String TAG = "M-A-Controller";

    private WatsonResults listener;
    private AppCompatActivity activity;

    public MainActivityController(AppCompatActivity activity) {
        this.activity = activity;
        this.listener = (WatsonResults) activity;
    }

    public void analyzeText(String text) {
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

    private void analyzeResults(DocumentTone documentTone) {
        int color = Color.WHITE;

        Log.e(TAG, documentTone.toString());

        for (Tone tone : documentTone.getTone_categories()) {
            if (tone.getCategory_id().equalsIgnoreCase("emotion_tone")) {
                int red = 0;
                int green = 0;
                int blue = 0;
                int alpha = 255;
                for (ToneDetails details : tone.getTones()) {
                    switch (details.getTone_name()) {
                        case "Anger":
                            red = colorPercent(details.getScore());
                            break;
                        case "Disgust":
                            green = colorPercent(details.getScore());
                            break;
                        case "Sadness":
                            blue = colorPercent(details.getScore());
                            break;
                        case "Fear":
                            alpha -= colorPercent(details.getScore());
                            break;
                    }
                }
                Log.e(TAG, String.format("Alpha: %d, Red: %d, Green: %d, Blue: %d", alpha, red, green, blue));
                if (red != 0 && green != 0 && blue != 0) {
                    color = Color.argb(alpha, red, green, blue);
                }
            }
        }
        if (listener != null) listener.onWatsonResults(color);
    }

    private int colorPercent(double value) {
        double num = value * 255;
        return (int) num;
    }

    public interface WatsonResults {
        void onWatsonResults(int color);
    }
}
