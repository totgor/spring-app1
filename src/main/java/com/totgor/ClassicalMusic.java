package com.totgor;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;


@Component
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
