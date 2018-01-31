package com.learning.spring.Services;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
    public String getDailyFortune() {
        return "You are lucky today!!";
    }
}
