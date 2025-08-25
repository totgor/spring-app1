package com.totgor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        // Computer computer = applicationContext.getBean("computer", Computer.class);
        // System.out.println(computer);

        ClassicalMusic classicalMusic1 = applicationContext.getBean("classicalMusic", ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = applicationContext.getBean("classicalMusic", ClassicalMusic.class);
        System.out.println(classicalMusic1 == classicalMusic2);

        applicationContext.close();
    }
}
