package com.homework.homework2solid.configurations;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {
    

    @Bean
    public Scanner scanner(){
        return new Scanner(System.in);
    }
}
