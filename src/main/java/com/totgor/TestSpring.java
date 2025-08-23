package com.totgor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        //Для класса RockMusic объявлен @Component c id musicBean
        Music music = applicationContext.getBean("musicBean", Music.class);

        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.playMusic();

        //Для класса ClassicalMusic объявлен @Component без id, поэтому Spring создаст бин по имени класса с маленькой буквы classicalMusic  
        Music music2 = applicationContext.getBean("classicalMusic", ClassicalMusic.class);

        MusicPlayer musicPlayer2 = new MusicPlayer(music2);
        musicPlayer2.playMusic();

                
        applicationContext.close();
    }
}
