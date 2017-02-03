package com.mattfred.androidai.models;

/**
 * Watson Text
 */

public class WatsonText {

    private String text;

    public WatsonText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
