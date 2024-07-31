package com.mohamedhedi1.whatsappclonebackend.wire.postgres.infrastructure;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = {"com.mohamedhedi1.whatsappclonebackend"})
@EnableJpaAuditing
public class DatabaseConfiguration {
}
