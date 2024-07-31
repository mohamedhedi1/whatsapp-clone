package com.mohamedhedi1.whatsappclonebackend.infrastructure.secondary.repository;

import com.mohamedhedi1.whatsappclonebackend.infrastructure.secondary.entity.MessageContentBinaryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaMessageBinaryContent extends JpaRepository<MessageContentBinaryEntity, Long> {
}
