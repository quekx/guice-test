package com.qkx.test.message.samples.provider;

import com.google.inject.AbstractModule;
import com.qkx.test.message.sender.MessageSender;

/**
 * Created by qkx on 17/4/24.
 */
public class ProviderModule extends AbstractModule {
    protected void configure() {
        bind(MessageSender.class).toProvider(EmailProvider.class);
    }
}
