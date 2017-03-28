package com.mattfred.androidai.models;

/**
 * Watson Text. Text portion of watson response
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
