package com.github.bzalyaliev;

public class ByeMessage implements Message {

    private final String text;

    public ByeMessage(String text) {
        this.text = "Bye " + text;
    }

    @Override
    public String getText() {
        return text;
    }
}
