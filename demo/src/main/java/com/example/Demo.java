package com.example;



import java.util.Scanner;

import com.example.service.InputService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


/** >@Service
 *  @Component
 *  @Bean
 */
 @Component
public class Demo implements CommandLineRunner {
    @Autowired
    private Scanner scanner;
    
    @Autowired
    private InputService service;


    @Override
    public void run(String... args) throws Exception{

        System.out.println("Lütfen input Giriniz: ");
        String input = scanner.nextLine();
        System.out.println("Input: " + input);

        inputTaker();
        service.testInput();

    }

    private void inputTaker(){
        System.out.println("Input 2: " );
        String input = scanner.nextLine();
        System.out.println("Input 2: " + input);
    }
}
