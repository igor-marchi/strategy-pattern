package com.designPattern.strategy.controller;

public record NotificationInputDto (
    String channel,
    String destination,
    String message
) {}
