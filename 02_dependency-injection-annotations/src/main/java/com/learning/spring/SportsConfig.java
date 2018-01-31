package com.learning.spring;

import com.learning.spring.Coach.Coach;
import com.learning.spring.Coach.SwimCoach;
import com.learning.spring.Services.DangerFortuneService;
import com.learning.spring.Services.FortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
public class SportsConfig
{
    @Bean
    public FortuneService dangerFortuneService()
    {
        return new DangerFortuneService();
    }

    @Bean
    public Coach swimCoach()
    {
        return new SwimCoach(this.dangerFortuneService());
    }
}
