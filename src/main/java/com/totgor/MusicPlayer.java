package com.totgor;

public class MusicPlayer {
    private Music music;
    
    MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing:" + music.getSong());
    }
}
