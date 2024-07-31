package com.mohamedhedi1.whatsappclonebackend.messaging.domain.message.aggregate;

import com.mohamedhedi1.whatsappclonebackend.messaging.domain.message.vo.ConversationName;
import com.mohamedhedi1.whatsappclonebackend.messaging.domain.user.vo.UserPublicId;
import com.mohamedhedi1.whatsappclonebackend.shared.error.domain.Assert;
import org.jilt.Builder;

import java.util.Set;

@Builder
public class ConversationToCreate {

    private final Set<UserPublicId> members;

    private final ConversationName name;

    public ConversationToCreate(Set<UserPublicId> members, ConversationName name) {
        assertMandatoryFields(members, name);
        this.members = members;
        this.name = name;
    }

    private void assertMandatoryFields(Set<UserPublicId> members, ConversationName name) {
        Assert.notNull("name", name);
        Assert.notNull("members", members);
    }

    public Set<UserPublicId> getMembers() {
        return members;
    }

    public ConversationName getName() {
        return name;
    }
}
