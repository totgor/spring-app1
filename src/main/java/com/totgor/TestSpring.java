package com.totgor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer musicPlayer = applicationContext.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.playMusic();
        System.out.println("Имя плеера: " + musicPlayer.getName());
        System.out.println("Громкость: " + musicPlayer.getVolume());
        
        applicationContext.close();
    }
}
