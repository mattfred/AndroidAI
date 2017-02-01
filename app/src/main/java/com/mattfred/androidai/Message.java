package com.mattfred.androidai;

/**
 * Created by matthewfrederick on 1/31/17.
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

    public void setUser(boolean user) {
        this.user = user;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
