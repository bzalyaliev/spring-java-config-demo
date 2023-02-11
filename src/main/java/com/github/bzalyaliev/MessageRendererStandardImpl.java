package com.github.bzalyaliev;

public class MessageRendererStandardImpl implements MessageRenderer {

    private final Message message;

    public MessageRendererStandardImpl(Message message) {
        this.message = message;
    }

    public void printMessage() {
        System.out.println(message.getText());
    }
}
