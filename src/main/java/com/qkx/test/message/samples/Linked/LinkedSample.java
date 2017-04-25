package com.qkx.test.message.samples.linked;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.qkx.test.message.service.MessageService;

/**
 * Created by qkx on 17/4/22.
 */
public class LinkedSample {
    public static void main() {
        Injector inject = Guice.createInjector(new LinkedMessageModule());
        MessageService messageService = inject.getInstance(MessageService.class);
        messageService.sendMessage("This is linked sample!");

    }
}
