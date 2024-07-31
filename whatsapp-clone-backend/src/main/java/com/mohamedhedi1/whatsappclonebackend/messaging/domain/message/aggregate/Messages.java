package com.mohamedhedi1.whatsappclonebackend.messaging.domain.message.aggregate;

import com.mohamedhedi1.whatsappclonebackend.shared.error.domain.Assert;

import java.util.List;

public record Messages(List<Messages> messages) {
    public Messages {
        Assert.field("messages", messages).notNull().noNullElement();
    }
}
