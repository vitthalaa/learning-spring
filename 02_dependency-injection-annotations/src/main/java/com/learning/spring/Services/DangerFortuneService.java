package com.learning.spring.Services;

import org.springframework.stereotype.Component;

@Component
public class DangerFortuneService implements FortuneService {
    public String getDailyFortune() {
        return "You are in danger today!";
    }
}
