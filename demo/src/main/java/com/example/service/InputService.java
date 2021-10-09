package com.example.service;

import java.util.Scanner;

import org.springframework.stereotype.Service;

@Service
public class InputService {
    private Scanner scanner;

    public InputService(Scanner scanner){
        this.scanner = scanner;
    }

    public void testInput(){
        System.out.println("Test Input: ");
        String input = scanner.nextLine();
        System.out.println("Test Input: " + input);
    }
}
