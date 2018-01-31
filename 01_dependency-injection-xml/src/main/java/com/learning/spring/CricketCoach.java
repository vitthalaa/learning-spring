package com.learning.spring;

public class CricketCoach implements Coach {

    public FortuneService fortuneService;

    /**
     * This dependency will be injected by spring container using config xml file
     *
     * @param fortuneService
     */
    public CricketCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    /**
     * Interface method implementation
     *
     * @return
     */
    public String getCoachingLesson() {
        return "Getting cricket lesson!";
    }

    public String getFortune() {
        return "Your fortune in cricket: " + this.fortuneService.getFortune();
    }
}
