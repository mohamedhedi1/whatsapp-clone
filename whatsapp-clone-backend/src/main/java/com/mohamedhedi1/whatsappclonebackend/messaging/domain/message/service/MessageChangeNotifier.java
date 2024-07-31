package com.mohamedhedi1.whatsappclonebackend.messaging.domain.message.service;

import com.mohamedhedi1.whatsappclonebackend.infrastructure.secondary.message.ConversationViewedForNotification;
import com.mohamedhedi1.whatsappclonebackend.messaging.domain.message.aggregate.Message;
import com.mohamedhedi1.whatsappclonebackend.messaging.domain.message.vo.ConversationPublicId;
import com.mohamedhedi1.whatsappclonebackend.messaging.domain.user.vo.UserPublicId;
import com.mohamedhedi1.whatsappclonebackend.shared.service.State;

import java.util.List;

public interface MessageChangeNotifier {

    State<Void, String> send(Message message, List<UserPublicId> userToNotify);

    State<Void, String> delete(ConversationPublicId conversationPublicId, List<UserPublicId> userToNotify);

    State<Void, String> view(ConversationViewedForNotification conversationViewedForNotification, List<UserPublicId> usersToNotify);
}
