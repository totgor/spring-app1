package com.totgor;

import java.util.Random;
import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {

    String[] songs = {"Классическая композиция 1",
                      "Классическая композиция 2",
                      "Классическая композиция 3"};

    @Override
    public String getSong() {
        return songs[new Random().nextInt(3)];
    }   
}
