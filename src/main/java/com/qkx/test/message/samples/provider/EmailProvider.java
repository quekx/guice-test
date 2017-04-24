package com.qkx.test.message.samples.provider;

import com.google.inject.Provider;
import com.qkx.test.message.sender.MessageEmailSender;

/**
 * Created by qkx on 17/4/24.
 */
public class EmailProvider implements Provider<MessageEmailSender> {
    public MessageEmailSender get() {
        return new MessageEmailSender();
    }
}
