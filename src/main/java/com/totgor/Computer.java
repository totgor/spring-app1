package com.totgor;

public class Computer {
    
    private int id;
    private MusicPlayer musicPlayer;

    public Computer(MusicPlayer musicPlayer) {
        id = 1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "Computer " + id + " " + musicPlayer.playMusic();
    }
    
    
}
