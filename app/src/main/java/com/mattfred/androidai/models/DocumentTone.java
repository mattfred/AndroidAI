package com.mattfred.androidai.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Document Tone
 */

public class DocumentTone {

    @SerializedName("tone_categories")
    @Expose
    private List<Tone> tone_categories;

    public List<Tone> getTone_categories() {
        return tone_categories;
    }

    public void setTone_categories(List<Tone> tone_categories) {
        this.tone_categories = tone_categories;
    }

    @Override
    public String toString() {
        return "DocumentTone{" +
                "tone_categories=" + tone_categories +
                '}';
    }
}
