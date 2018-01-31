package com.learning.spring;

public class HockeyCoach implements Coach {

    private FortuneService fortuneService;

    private String emailAddress;

    private String teamName;

    /**
     * You must have setters if you are setting from config file
     *
     * @param fortuneService
     */
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    /**
     * Interface method implementation
     *
     * @return
     */
    public String getCoachingLesson() {
        return "Getting hockey lesson for team " + this.teamName + "\n" +
                "Contact: " + this.emailAddress;
    }

    /**
     * Interface method implementation
     *
     * @return
     */
    public String getFortune() {
        return "Your fortune in hockey: " + this.fortuneService.getFortune();
    }
}
