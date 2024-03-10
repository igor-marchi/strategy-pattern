package com.designPattern.strategy.controller;

import com.designPattern.strategy.service.NotificationService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/notifications")
public class NotificationController {

    private final NotificationService notificationService;


    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @PostMapping
    public ResponseEntity<Void> send(@Valid @RequestBody NotificationInputDto notificationInputDto) {
        try {
            notificationService.notify(
                    notificationInputDto.channel(),
                    notificationInputDto.destination(),
                    notificationInputDto.message()
            );

            return ResponseEntity.accepted().build();
        } catch (Exception exception) {
            return ResponseEntity.internalServerError().build();
        }


    }
}
