package com.qkx.test.message.samples.provider;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.qkx.test.message.sender.MessageSender;

/**
 * Created by qkx on 17/4/24.
 */
public class ProviderSample {
    public static void main() {
        Injector injector = Guice.createInjector(new ProviderModule());
        MessageSender messageSender = injector.getInstance(MessageSender.class);
        messageSender.sendMessage("This is provider sample!");
    }
}
