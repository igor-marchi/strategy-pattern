package com.designPattern.strategy.service.strategy;

import com.designPattern.strategy.service.NotificationService;
import com.designPattern.strategy.service.NotificationStrategy;
import com.designPattern.strategy.service.NotificationStrategyType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DiscordNotificationStrategy implements NotificationStrategy {

    private final Logger logger = LoggerFactory.getLogger(NotificationService.class);

    private final NotificationStrategyType type = NotificationStrategyType.DISCORD;

    @Override
    public void send(String destination, String message) {
        logger.info("Notificação [{}] enviada para o [{}] [{}]", message, type, destination);
    }
}
