package com.mohamedhedi1.whatsappclonebackend.infrastructure.secondary.message;



import com.mohamedhedi1.whatsappclonebackend.messaging.domain.message.aggregate.Message;
import com.mohamedhedi1.whatsappclonebackend.messaging.domain.user.vo.UserPublicId;

import java.util.List;

public record MessageWithUsers(Message message, List<UserPublicId> userToNotify) {
}
