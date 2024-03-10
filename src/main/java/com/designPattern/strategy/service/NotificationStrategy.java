package com.designPattern.strategy.service;

public interface NotificationStrategy {

    void send(String destination, String message);
}