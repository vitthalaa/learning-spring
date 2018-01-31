package com.learning.spring.Coach;

import com.learning.spring.Services.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach
{
    private FortuneService fortuneService;

    /**
     * Constructor dependency injection
     *
     * @Qualifier annotation can not be used on constructor
     * We have to place it inside the constructor arguments
     * @param fortuneService
     */
    @Autowired
    public CricketCoach(@Qualifier("happyFortuneService") FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyFortune() {
        return this.fortuneService.getDailyFortune();
    }

    public String getDailyWorkout() {
        return "Practice pull shot for 30 minutes.";
    }
}
