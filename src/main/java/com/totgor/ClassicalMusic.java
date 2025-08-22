package com.totgor;

public class ClassicalMusic implements Music {

    public void initMethod() {
        System.out.println("Doing initMethod() from class ClassicalMusic");
    }

    public void destroyMethod() {
        System.out.println("Doing destroyMethod() from class ClassicalMusic()");
    }

    @Override
    public String getSong() {
        return "Классическая композиция 1";
    }   
}
