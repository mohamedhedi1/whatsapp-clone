package com.mohamedhedi1.whatsappclonebackend.messaging.domain.message.repository;

import com.mohamedhedi1.whatsappclonebackend.messaging.domain.message.aggregate.Conversation;
import com.mohamedhedi1.whatsappclonebackend.messaging.domain.message.aggregate.Message;
import com.mohamedhedi1.whatsappclonebackend.messaging.domain.message.vo.ConversationPublicId;
import com.mohamedhedi1.whatsappclonebackend.messaging.domain.message.vo.MessageSendState;
import com.mohamedhedi1.whatsappclonebackend.messaging.domain.user.aggregate.User;
import com.mohamedhedi1.whatsappclonebackend.messaging.domain.user.vo.UserPublicId;

import java.util.List;

public interface MessageRepository {

    Message save(Message message, User sender, Conversation conversation);

    int updateMessageSendState(ConversationPublicId conversationPublicId, UserPublicId userPublicId, MessageSendState state);

    List<Message> findMessageToUpdateSendState(ConversationPublicId conversationPublicId, UserPublicId userPublicId);

}
