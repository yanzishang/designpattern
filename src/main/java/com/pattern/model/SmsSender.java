package com.pattern.model;

/**
 * SmsSender
 */
public class SmsSender implements Sender {

    @Override
    public void send() {
        System.out.println("sms send...");
    }
}
