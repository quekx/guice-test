package com.qkx.test.message.service;

import com.qkx.test.message.sender.MessageSender;

/**
 * Created by qkx on 17/4/22.
 */
public abstract class AbsMessageService implements MessageService {
    protected MessageSender sender;

    public void sendMessage(String message) {
        if (sender != null) {
            sender.sendMessage(message);
        }
    }
}
