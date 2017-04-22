package com.qkx.test.message.samples.Annotations;

import com.google.inject.Inject;
import com.qkx.test.message.sender.MessageSender;
import com.qkx.test.message.service.AbsMessageService;

/**
 * Created by qkx on 17/4/22.
 */
public class AnnotationMessageService extends AbsMessageService {
    @Inject
    public AnnotationMessageService(@AnnotationEmail MessageSender sender) {
        this.sender = sender;
    }
}
