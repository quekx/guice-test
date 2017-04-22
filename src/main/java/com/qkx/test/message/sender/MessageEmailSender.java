package com.qkx.test.message.sender;

/**
 * Created by qkx on 17/4/22.
 */
public class MessageEmailSender implements MessageSender {
    public void sendMessage(String message) {
        System.out.println("message send by email sender: " + message);
    }
}
