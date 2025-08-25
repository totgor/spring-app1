package com.totgor;

import org.springframework.beans.factory.annotation.Value;

public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;
    
    private Music music1;
    private Music music2;

    public MusicPlayer(Music music1, Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }    

    public String playMusic() {
        return "Music player name: " + name + " Volume: " + volume + " Playing: " + music1.getSong() + " and " + music2.getSong() ;
    }
}
