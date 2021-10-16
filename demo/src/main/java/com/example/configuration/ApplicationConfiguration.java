package com.example.configuration;

import com.example.service.InputService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.util.Scanner; 

@Configuration
public class ApplicationConfiguration {

    @Bean
    public InputService InputService(Scanner inScanner){
        return new InputService(inScanner);
    }
    
}
