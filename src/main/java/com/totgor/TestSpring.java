package com.totgor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Computer computer = applicationContext.getBean("computer", Computer.class);
        System.out.println(computer);

        applicationContext.close();
    }
}
