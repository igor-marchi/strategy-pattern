package com.designPattern.strategy.service;

public enum NotificationStrategyType {
    DISCORD,
    EMAIL,
    TWITTER,
    INSTAGRAM,
    WHATSAPP;

    public static NotificationStrategyType convert(String notificationStrategyType) {
        try {
            return NotificationStrategyType.valueOf(notificationStrategyType.toUpperCase());
        } catch (IllegalArgumentException e) {
            return null;
        }
    }
}
