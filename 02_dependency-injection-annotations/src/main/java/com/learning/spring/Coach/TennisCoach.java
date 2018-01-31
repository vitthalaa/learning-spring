package com.learning.spring.Coach;

import com.learning.spring.Services.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @Component annotation will read bean while component scan
 */
@Component
public class TennisCoach implements Coach {

    /**
     * @Autowired annotation will auto resolve dependency
     * @Qualifier is used to avoid bean conflicts of same type.
     * As there are 3 implementations for FortuneService,
     * RandomFortuneService component bean will be injected using naming conventions.
     * RandomFortuneService => randomFortuneService
     */
    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    public String getDailyWorkout() {
        return "Warm up for 10 minuets";
    }

    public String getDailyFortune() {
        return this.fortuneService.getDailyFortune();
    }
}
