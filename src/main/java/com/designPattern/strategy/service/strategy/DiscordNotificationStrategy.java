package com.designPattern.strategy.service.strategy;

import com.designPattern.strategy.service.NotificationStrategy;
import com.designPattern.strategy.service.NotificationStrategyType;
import org.slf4j.Logger;

public class DiscordNotificationStrategy implements NotificationStrategy {

    private final Logger logger;
    private final NotificationStrategyType type = NotificationStrategyType.DISCORD;

    public DiscordNotificationStrategy(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void send(String destination, String message) {
        logger.info("Notificação [{}] enviada para o [{}] [{}]", message, type, destination);
    }
}
