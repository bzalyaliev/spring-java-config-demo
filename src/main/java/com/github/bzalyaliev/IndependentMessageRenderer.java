package com.github.bzalyaliev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IndependentMessageRenderer {

    // Spring заинжектит сюда бин MessageRenderer
    @Autowired
    private MessageRenderer renderer;

    public IndependentMessageRenderer(MessageRenderer renderer) {
        this.renderer = renderer;
    }

    public void print() {
        renderer.printMessage();

    }

}
