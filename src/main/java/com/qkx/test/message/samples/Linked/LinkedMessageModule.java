package com.qkx.test.message.samples.Linked;

import com.google.inject.AbstractModule;
import com.qkx.test.message.service.MessageService;
import com.qkx.test.message.sender.MessagePhoneSender;
import com.qkx.test.message.sender.MessageSender;

/**
 * Created by qkx on 17/4/22.
 */
public class LinkedMessageModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(MessageSender.class).to(MessagePhoneSender.class);
        bind(MessageService.class).to(LinkedMessageService.class);
    }
}
