package com.springdemo;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Throw the ball as far as you can :P";
    }
}
