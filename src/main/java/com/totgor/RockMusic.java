package com.totgor;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {

    @Override
    public String getSong() {
        return "Рок композиция 1";
    }
    
}
