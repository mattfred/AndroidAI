package com.mattfred.androidai.watson;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Watson Service
 */

public class WatsonService {

    /**
     * Create retrofit watson api client. This object is used for making the http calls.
     *
     * @return watson api client
     */
    public static WatsonInterface getWatsonService() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://watson-api-explorer.mybluemix.net/tone-analyzer/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();

        return retrofit.create(WatsonInterface.class);
    }
}
