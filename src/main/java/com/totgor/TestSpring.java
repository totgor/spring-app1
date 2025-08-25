package com.totgor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        // Computer computer = applicationContext.getBean("computer", Computer.class);
        // System.out.println(computer);

        ClassicalMusic classicalMusic = applicationContext.getBean("classicalMusic", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());

        applicationContext.close();
    }
}
