package com.designPattern.strategy.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NotificationStrategyTypeTest {

    @Test
    public void convertValidType() {
        String type = "email";
        NotificationStrategyType result = NotificationStrategyType.convert(type);
        Assertions.assertEquals(NotificationStrategyType.EMAIL, result);
    }

    @Test
    public void convertInvalidType() {
        String type = "invalid-type";
        NotificationStrategyType result = NotificationStrategyType.convert(type);
        Assertions.assertNull(result);
    }
}