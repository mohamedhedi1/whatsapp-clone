package com.mohamedhedi1.whatsappclonebackend.messaging.domain.user.vo;

import com.mohamedhedi1.whatsappclonebackend.shared.error.domain.Assert;

public record UserEmail(String value) {

    public UserEmail {
        Assert.field(value, value).maxLength(255);
    }
}
