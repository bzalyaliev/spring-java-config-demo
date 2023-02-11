package com.github.bzalyaliev;

public class MessageRendererErrorImpl implements MessageRenderer {

    private final Message message;

    public MessageRendererErrorImpl(Message message) {
        this.message = message;
    }

    public void printMessage() {
        System.err.println(message.getText());
    }
}
