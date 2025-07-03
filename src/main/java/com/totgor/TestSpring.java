package com.totgor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music music = applicationContext.getBean("musicBean", Music.class);
        
        MusicPlayer musicPlayer = new MusicPlayer(music);

        musicPlayer.playMusic();
        

        applicationContext.close();
    }
}
