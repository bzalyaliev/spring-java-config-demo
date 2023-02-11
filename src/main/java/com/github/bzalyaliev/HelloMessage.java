package com.github.bzalyaliev;

public class HelloMessage implements Message {

    private final String text;

    public HelloMessage(String text) {
        this.text = "Hello " + text;
    }

    @Override
    public String getText() {
        return text;
    }
}
