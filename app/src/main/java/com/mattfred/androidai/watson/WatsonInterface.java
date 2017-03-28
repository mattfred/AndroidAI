package com.mattfred.androidai.watson;

import com.mattfred.androidai.models.WatsonResponse;
import com.mattfred.androidai.models.WatsonText;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Watson API interface
 */

public interface WatsonInterface {

    /**
     * Get watson results from tone analyzer
     *
     * @param version watson api version to be used
     * @param text    text to be analyzed
     * @return watson document tone
     */
    @Headers({
            "Content-Type: application/json",
            "Accept: application/json"
    })
    @POST("v3/tone")
    Call<WatsonResponse> getDocumentTone(@Query("version") String version, @Body WatsonText text);
}
