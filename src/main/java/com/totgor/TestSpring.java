package com.totgor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Computer computer = applicationContext.getBean("computer", Computer.class);
        System.out.println(computer);

        ClassicalMusic classicalMusic = applicationContext.getBean("classicalMusic", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());

        applicationContext.close();
    }
}
