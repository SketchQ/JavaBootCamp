package com;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MainExceptionHandling {
    public static void main(String[] args) {
        // print("test");
        
        try {
            FileInputStream inputStream = new FileInputStream("input.txt");
            System.out.println(inputStream);
            
        } catch (FileNotFoundException ignored ) {
            //TODO: handle exception
            System.out.println("File not Found");
        }
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen sayı giriniz: ");
        int num = -1;
        try {
            num = scanner.nextInt();

        } catch(Exception e ){
            System.out.println("Input Hatalı");
        }finally{
            System.out.println("Her Zaman Çalışır");
        }

        if(num != -1){
            System.out.println("Input is : " + num);    
        }

        scanner.close();

    }

    public static void print(String name){
        print(name);
    }
}
