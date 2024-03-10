package com.designPattern.strategy.service;

import com.designPattern.strategy.service.strategy.*;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class NotificationService {

    private final Map<NotificationStrategyType, NotificationStrategy> mapStrategy = Map.of(
            NotificationStrategyType.EMAIL, new EmailNotificationStrategy(),
            NotificationStrategyType.DISCORD, new DiscordNotificationStrategy(),
            NotificationStrategyType.TWITTER, new TwitterNotificationStrategy(),
            NotificationStrategyType.INSTAGRAM, new InstagramNotificationStrategy(),
            NotificationStrategyType.WHATSAPP, new WhatsappNotificationStrategy()

    );

    public void notify(String channel, String destination, String message) {
        mapStrategy.get(NotificationStrategyType.convert(channel)).send(destination, message);
    }
}
