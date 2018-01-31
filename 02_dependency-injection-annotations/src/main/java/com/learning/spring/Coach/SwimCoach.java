package com.learning.spring.Coach;

import com.learning.spring.Services.FortuneService;
import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach
{
    private FortuneService fortuneService;

    @Value("${swim.coach.email}")
    private String email;

    @Value("${swim.coach.team}")
    private String team;

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "Your team is " + this.team +
                "\nContact coach:" + this.email +
                "\nSwim for 500 meters for warm up.";
    }

    public String getDailyFortune() {
        return fortuneService.getDailyFortune();
    }
}
