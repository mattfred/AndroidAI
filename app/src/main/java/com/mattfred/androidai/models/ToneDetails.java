package com.mattfred.androidai.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Tone Details
 */

public class ToneDetails {

    @SerializedName("score")
    @Expose
    private double score;

    @SerializedName("tone_id")
    @Expose
    private String tone_id;

    @SerializedName("tone_name")
    @Expose
    private String tone_name;

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getTone_id() {
        return tone_id;
    }

    public void setTone_id(String tone_id) {
        this.tone_id = tone_id;
    }

    public String getTone_name() {
        return tone_name;
    }

    public void setTone_name(String tone_name) {
        this.tone_name = tone_name;
    }

    @Override
    public String toString() {
        return "ToneDetails{" +
                "score=" + score +
                ", tone_id='" + tone_id + '\'' +
                ", tone_name='" + tone_name + '\'' +
                '}';
    }
}
