package com.mohamedhedi1.whatsappclonebackend.messaging.domain.message.aggregate;

import com.mohamedhedi1.whatsappclonebackend.shared.error.domain.Assert;

import java.util.List;

public record Conversations(List<Conversation> conversations) {

    public Conversations {
        Assert.field("conversations", conversations).notNull().noNullElement();
    }
}
