package com.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PracticeDemoApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PracticeConfig.class);
        Coach theCoach = context.getBean("guardiolaCoach", Coach.class);
        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getDailyWorkout());
        context.close();
    }
}
