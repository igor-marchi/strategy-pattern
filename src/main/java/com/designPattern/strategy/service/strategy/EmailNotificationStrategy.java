package com.designPattern.strategy.service.strategy;

import com.designPattern.strategy.service.NotificationStrategy;
import com.designPattern.strategy.service.NotificationStrategyType;
import org.slf4j.Logger;

public class EmailNotificationStrategy implements NotificationStrategy {

    private final Logger logger;
    private final NotificationStrategyType type = NotificationStrategyType.EMAIL;


    public EmailNotificationStrategy(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void send(String destination, String message) {
        logger.info("Notificação [{}] enviada para o [{}] [{}]", message, this.type, destination);
    }
}
