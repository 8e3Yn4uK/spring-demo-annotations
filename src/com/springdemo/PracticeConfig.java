package com.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PracticeConfig {

    @Bean
    public FortuneService dataBaseFortuneService(){
        return new DatabaseFortuneService();
    }
    @Bean
    public Coach guardiolaCoach(){
        return new GuardiolaCoach(dataBaseFortuneService());
    }
}
