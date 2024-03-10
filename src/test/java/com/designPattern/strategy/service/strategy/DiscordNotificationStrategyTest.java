package com.designPattern.strategy.service.strategy;

import com.designPattern.strategy.service.NotificationStrategyType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.slf4j.Logger;

class DiscordNotificationStrategyTest {
    private DiscordNotificationStrategy discordNotificationStrategy;
    private Logger logger;

    @BeforeEach
    public void setup() {
        logger = Mockito.mock(Logger.class);
        discordNotificationStrategy = new DiscordNotificationStrategy(logger);
    }


    @Test
    @DisplayName("should notify correct")
    void send() {
        String destination = "teste@teste.com";
        String message = "test message";

        discordNotificationStrategy.send(destination, message);

        Mockito.verify(logger).info("Notificação [{}] enviada para o [{}] [{}]", message, NotificationStrategyType.DISCORD, destination);
    }
}