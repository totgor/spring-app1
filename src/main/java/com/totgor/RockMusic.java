package com.totgor;

import org.springframework.stereotype.Component;

@Component("musicBean") //Анотация для Spring для создания бина класса RockMusic c id musicBean
public class RockMusic implements Music {

    @Override
    public String getSong() {
        return "Рок композиция 1";
    }
    
}
