package com.mattfred.androidai.models;

/**
 * Message Object
 */

public class Message {

    private boolean user;
    private String content;

    public Message(boolean user, String content) {
        this.user = user;
        this.content = content;
    }

    public boolean isUser() {
        return user;
    }

    public String getContent() {
        return content;
    }
}
