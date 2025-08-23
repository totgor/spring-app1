package com.totgor;

import org.springframework.stereotype.Component;

public class ClassicalMusic implements Music {

    @Override
    public String getSong() {
        return "Классическая композиция 1";
    }   
}
