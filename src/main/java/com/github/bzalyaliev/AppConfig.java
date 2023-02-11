package com.github.bzalyaliev;

import jdk.jfr.Category;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan(basePackages = "com.github.bzalyaliev")
public class AppConfig {

    @Bean
    public MessageRenderer messageRenderer() {
        return new MessageRendererErrorImpl(message());
    }

    @Bean
    public Message message() {
        return new HelloMessage("Bulat");
    }
}
