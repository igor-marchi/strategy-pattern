package com.designPattern.strategy.service;

import com.designPattern.strategy.service.strategy.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class NotificationService {

    private final Logger discordLogger = LoggerFactory.getLogger(DiscordNotificationStrategy.class);
    private final Logger emailLogger = LoggerFactory.getLogger(EmailNotificationStrategy.class);
    private final Logger twitterLogger = LoggerFactory.getLogger(TwitterNotificationStrategy.class);
    private final Map<NotificationStrategyType, NotificationStrategy> mapStrategy = Map.of(
            NotificationStrategyType.EMAIL, new EmailNotificationStrategy(emailLogger),
            NotificationStrategyType.DISCORD, new DiscordNotificationStrategy(discordLogger),
            NotificationStrategyType.TWITTER, new TwitterNotificationStrategy(twitterLogger),
            NotificationStrategyType.INSTAGRAM, new InstagramNotificationStrategy(),
            NotificationStrategyType.WHATSAPP, new WhatsappNotificationStrategy()

    );

    public NotificationService() {
    }

    public void notify(String channel, String destination, String message) {
        mapStrategy.get(NotificationStrategyType.convert(channel)).send(destination, message);
    }
}
