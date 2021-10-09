package com.example.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Scanner;

@Configuration

public class DemoConfig {
    @Scope
    @Bean
    public Scanner inScanner(){
        return new Scanner(System.in);
    }

    @Bean
    public Scanner outScanner(){
        return new Scanner(System.in);
    }
}
