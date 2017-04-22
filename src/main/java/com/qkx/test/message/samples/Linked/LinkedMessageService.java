package com.qkx.test.message.samples.Linked;

import com.google.inject.Inject;
import com.qkx.test.message.sender.MessageSender;
import com.qkx.test.message.service.AbsMessageService;

/**
 * Created by qkx on 17/4/22.
 */
public class LinkedMessageService extends AbsMessageService {

    @Inject
    public LinkedMessageService(MessageSender sender) {
        this.sender = sender;
    }

}
