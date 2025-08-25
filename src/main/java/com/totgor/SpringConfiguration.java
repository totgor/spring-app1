package com.totgor;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.totgor")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfiguration {
    
}
