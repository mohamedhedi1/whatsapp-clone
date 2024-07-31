package com.mohamedhedi1.whatsappclonebackend.messaging.domain.user.vo;

import com.mohamedhedi1.whatsappclonebackend.shared.error.domain.Assert;

public record UserImageUrl(String value) {

    public UserImageUrl {
        Assert.field(value, value).maxLength(255);
    }
}
