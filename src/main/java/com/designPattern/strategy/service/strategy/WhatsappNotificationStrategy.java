package com.designPattern.strategy.service.strategy;

import com.designPattern.strategy.service.NotificationService;
import com.designPattern.strategy.service.NotificationStrategy;
import com.designPattern.strategy.service.NotificationStrategyType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WhatsappNotificationStrategy implements NotificationStrategy {

    private final Logger logger = LoggerFactory.getLogger(NotificationService.class);


    private final NotificationStrategyType type = NotificationStrategyType.WHATSAPP;


    @Override
    public void send(String destination, String message) {
        logger.info("Notificação [{}] enviada para o [{}] [{}]", message, this.type, destination);
    }
}
