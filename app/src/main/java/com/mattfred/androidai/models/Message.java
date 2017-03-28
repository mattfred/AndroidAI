package com.mattfred.androidai.models;

/**
 * Message Object
 */

public class Message {

    /**
     * boolean signifying if message is from user
     */
    private boolean user;

    /**
     * message content
     */
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
