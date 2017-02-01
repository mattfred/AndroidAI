package com.mattfred.androidai;

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

    boolean isUser() {
        return user;
    }

    String getContent() {
        return content;
    }
}
