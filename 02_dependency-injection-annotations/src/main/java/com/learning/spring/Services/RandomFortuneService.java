package com.learning.spring.Services;

import org.springframework.stereotype.Component;
import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService
{
    private String[] data = {
            "Beware of the wolf in sheep's clothing",
            "Diligence is the mother of good luck",
            "The journey is the reward"
    };

    private Random myRandom = new Random();

    public String getDailyFortune() {
        int index = myRandom.nextInt(data.length);

        return  data[index];
    }
}
