package com.mohamedhedi1.whatsappclonebackend.messaging.domain.message.vo;

import com.mohamedhedi1.whatsappclonebackend.shared.error.domain.Assert;

public record ConversationName(String name) {

    public ConversationName {
        Assert.field("name", name).minLength(3).maxLength(255);
    }
}
