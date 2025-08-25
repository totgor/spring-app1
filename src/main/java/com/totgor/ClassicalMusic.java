package com.totgor;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;


public class ClassicalMusic implements Music {

    @PostConstruct
    private void initClassicalMusic() {
        System.out.println("Init ClassicalMusic Bean.");
    }

    @PreDestroy
    private void destroyClassicalMusic() {
        System.out.println("Destroy ClassicalMusic Bean.");
    }


    @Override
    public String getSong() {
        return "Классическая композиция 1";
    }   
}
