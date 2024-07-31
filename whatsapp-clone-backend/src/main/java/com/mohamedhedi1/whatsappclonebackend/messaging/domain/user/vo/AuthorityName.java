package com.mohamedhedi1.whatsappclonebackend.messaging.domain.user.vo;

import com.mohamedhedi1.whatsappclonebackend.shared.error.domain.Assert;

public record AuthorityName(String name) {

    public AuthorityName {
        Assert.field("name", name).notNull();
    }
}
