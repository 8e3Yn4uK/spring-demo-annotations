package com.springdemo;

public class GuardiolaCoach implements Coach {

    private FortuneService fortuneService;

    public GuardiolaCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Make 14 pases per second";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
