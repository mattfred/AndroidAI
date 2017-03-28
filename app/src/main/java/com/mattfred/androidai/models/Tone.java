package com.mattfred.androidai.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Object returned from watson api
 */

public class Tone {

    @SerializedName("tones")
    @Expose
    private List<ToneDetails> tones;

    @SerializedName("category_id")
    @Expose
    private String category_id;

    @SerializedName("category_name")
    @Expose
    private String category_name;

    public List<ToneDetails> getTones() {
        return tones;
    }

    public void setTones(List<ToneDetails> tones) {
        this.tones = tones;
    }

    public String getCategory_id() {
        return category_id;
    }

    public void setCategory_id(String category_id) {
        this.category_id = category_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    @Override
    public String toString() {
        return "Tone{" +
                "tones=" + tones +
                ", category_id='" + category_id + '\'' +
                ", category_name='" + category_name + '\'' +
                '}';
    }
}
