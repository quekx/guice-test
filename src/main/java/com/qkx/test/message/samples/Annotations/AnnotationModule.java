package com.qkx.test.message.samples.Annotations;

import com.google.inject.AbstractModule;
import com.qkx.test.message.sender.MessageEmailSender;
import com.qkx.test.message.sender.MessageSender;
import com.qkx.test.message.service.MessageService;

/**
 * Created by qkx on 17/4/22.
 */
public class AnnotationModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(MessageSender.class)
                .annotatedWith(AnnotationEmail.class)
                .to(MessageEmailSender.class);
        bind(MessageService.class)
                .to(AnnotationMessageService.class);
    }
}
