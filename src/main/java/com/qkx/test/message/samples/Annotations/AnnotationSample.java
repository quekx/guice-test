package com.qkx.test.message.samples.Annotations;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.qkx.test.message.service.MessageService;

/**
 * Created by qkx on 17/4/22.
 */
public class AnnotationSample {
    public static void main() {
        Injector injector = Guice.createInjector(new AnnotationModule());
        MessageService messageService = injector.getInstance(MessageService.class);
        messageService.sendMessage("This is annotation sample!");
    }
}
