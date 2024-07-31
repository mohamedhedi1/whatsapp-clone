package com.mohamedhedi1.whatsappclonebackend.infrastructure.primary.conversation;


import com.mohamedhedi1.whatsappclonebackend.messaging.domain.message.aggregate.ConversationToCreate;
import com.mohamedhedi1.whatsappclonebackend.messaging.domain.message.vo.ConversationName;
import com.mohamedhedi1.whatsappclonebackend.messaging.domain.user.vo.UserPublicId;
import com.mohamedhedi1.whatsappclonebackend.messaging.domain.message.aggregate.ConversationToCreateBuilder;
import org.jilt.Builder;

import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

@Builder
public record RestConversationToCreate(Set<UUID> members, String name) {

    public static ConversationToCreate toDomain(RestConversationToCreate restConversationToCreate) {
        RestConversationToCreateBuilder restConversationToCreateBuilder = RestConversationToCreateBuilder.restConversationToCreate();

        Set<UserPublicId> userUUIDs = restConversationToCreate.members
                .stream()
                .map(UserPublicId::new)
                .collect(Collectors.toSet());

        return ConversationToCreateBuilder.conversationToCreate()
                .name(new ConversationName(restConversationToCreate.name()))
                .members(userUUIDs)
                .build();
    }
}
