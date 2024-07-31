package com.mohamedhedi1.whatsappclonebackend.messaging.domain.user.vo;

import com.mohamedhedi1.whatsappclonebackend.shared.error.domain.Assert;

public record UserFirstname(String value) {

    public UserFirstname {
        Assert.field(value, value).maxLength(255);
    }
}
