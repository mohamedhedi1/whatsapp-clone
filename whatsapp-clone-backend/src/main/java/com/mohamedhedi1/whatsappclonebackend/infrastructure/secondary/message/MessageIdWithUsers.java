package com.mohamedhedi1.whatsappclonebackend.infrastructure.secondary.message;


import com.mohamedhedi1.whatsappclonebackend.messaging.domain.user.vo.UserPublicId;

import java.util.List;

public record MessageIdWithUsers(ConversationViewedForNotification conversationViewedForNotification,
                                 List<UserPublicId> usersToNotify) {
}
