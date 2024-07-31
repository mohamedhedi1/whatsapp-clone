package com.mohamedhedi1.whatsappclonebackend.messaging.domain.user.aggregate;

import com.mohamedhedi1.whatsappclonebackend.messaging.domain.user.vo.AuthorityName;
import com.mohamedhedi1.whatsappclonebackend.shared.error.domain.Assert;
import org.jilt.Builder;

@Builder
public class Authority {

    private AuthorityName name;

    public Authority(AuthorityName name) {
        Assert.notNull("name", name);
        this.name = name;
    }

    public AuthorityName getName() {
        return name;
    }
}
