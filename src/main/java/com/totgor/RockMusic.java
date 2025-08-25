package com.totgor;

import java.util.Random;
import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {

    String[] songs = {"Рок композиция 1",
                      "Рок композиция 2", 
                      "Рок композиция 3"};

    @Override
    public String getSong() {                        
        return songs[new Random().nextInt(3)];
    }
    
}
