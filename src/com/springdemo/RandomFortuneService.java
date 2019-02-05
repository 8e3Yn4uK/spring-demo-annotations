package com.springdemo;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    private String[] arr = {
            "Beware of the wolf in sheep's clothing",
            "Diligence is the mother of good luck",
            "The journey is the reward"
    };

    private Random rnd = new Random();

    @Override
    public String getFortune() {
        int res = rnd.nextInt(arr.length);
        return arr[res];
    }
}
