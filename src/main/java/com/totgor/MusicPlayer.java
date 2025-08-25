package com.totgor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {    
    
    private Music rockMusic;
    private Music classicalMusic;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music rockMusic, @Qualifier("classicalMusic") Music classicalMusic) {
        this.rockMusic = rockMusic;
        this.classicalMusic = classicalMusic;
    }    

    public String playMusic(Genre genre) {

        switch (genre) {
            case CLASSICAL:
                return "Playing: " + classicalMusic.getSong();                
            case ROCK:
                return "Playing: " + rockMusic.getSong();                
            default:
                return null;                
        }

        
    }
}
