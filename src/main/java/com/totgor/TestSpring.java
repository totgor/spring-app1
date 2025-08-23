package com.totgor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        ClassicalMusic classicalMusic = applicationContext.getBean("musicBean", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());

        ClassicalMusic classicalMusic2 = applicationContext.getBean("musicBean", ClassicalMusic.class);
        System.out.println(classicalMusic2.getSong());
        
        // ClassicalMusic myClassicalMusic = new ClassicalMusic();

        // MusicPlayer musicPlayer = applicationContext.getBean("musicPlayer", MusicPlayer.class);
        // MusicPlayer musicPlayer2 = applicationContext.getBean("musicPlayer", MusicPlayer.class);

        // musicPlayer.playMusic();
        // System.out.println("Имя плеера: " + musicPlayer.getName());
        // System.out.println("Громкость: " + musicPlayer.getVolume());
        
        // System.out.println();

        // musicPlayer2.playMusic();
        // System.out.println("Имя плеера: " + musicPlayer2.getName());
        // System.out.println("Громкость: " + musicPlayer2.getVolume());

        // System.out.println();

        // //Сравнение адресов объектов
        // boolean comparision = musicPlayer == musicPlayer2;        
        // System.out.println("musicPlayer == musicPlayer2: " + comparision);
        // //Выведем адреса объектов, т.к. toString() метод по умолчанию выводит hash объекта
        // System.out.println(musicPlayer);
        // System.out.println(musicPlayer2);

        // musicPlayer.setVolume(10); //Меняем Volume у musicPLayer объекта
        // //Выводим volume-поле объектов и видимо что оба поменялись, т.к. musicPlayer и musicPlayer2 ссылаются на один и тот же объект
        // System.out.println("musicPlayer.volume = " + musicPlayer.getVolume());
        // System.out.println("musicPlayer2.volume = " + musicPlayer2.getVolume());
        
        applicationContext.close();
    }
}
