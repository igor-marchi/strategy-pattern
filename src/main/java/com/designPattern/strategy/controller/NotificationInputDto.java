package com.designPattern.strategy.controller;

import jakarta.validation.constraints.NotBlank;

public record NotificationInputDto(
        @NotBlank(message = "channel is mandatory")
        String channel,
        @NotBlank(message = "destination is mandatory")
        String destination,
        @NotBlank(message = "message is mandatory")
        String message
) {
}
