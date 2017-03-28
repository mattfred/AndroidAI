package com.mattfred.androidai.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Watson response. Full model of all watson JSON values
 */

public class WatsonResponse {

    @SerializedName("document_tone")
    @Expose
    private DocumentTone document_tone;

    public DocumentTone getDocument_tone() {
        return document_tone;
    }

    public void setDocument_tone(DocumentTone document_tone) {
        this.document_tone = document_tone;
    }
}
