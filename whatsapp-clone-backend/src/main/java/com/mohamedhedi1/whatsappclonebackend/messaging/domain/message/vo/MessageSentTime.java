package com.mohamedhedi1.whatsappclonebackend.messaging.domain.message.vo;

import com.mohamedhedi1.whatsappclonebackend.shared.error.domain.Assert;

import java.time.Instant;

public record MessageSentTime(Instant date) {
    public MessageSentTime {
        Assert.field("date", date).notNull();
    }
}
