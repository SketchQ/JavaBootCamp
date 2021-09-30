/** @author Erim Serdonmez -
 *  ScrapBook.java -- ScrapBook for Classes
 * Can be used if one wants to try the code from .md Files
 */
package com;

import java.util.Scanner;

public class MainScrapBook {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = 0, num2 = 0, point = 0;
        while (num1 != -1 || num2 != -1) {
            System.out.println("Please Number 1: ");
            num1 = in.nextInt();
            System.out.println("Please Number 2: ");
            num2 = in.nextInt();
            

            int result = num1 * num2;

            if (result >= 10 && result <= 100) {
                point += 5;
                System.out.println("Result: " + result + " Puan:" + 5 + " Total Puan: " + point);
            } else if (result > 100) {
                point += 10;
                System.out.println("Result: " + result + " Puan:" + 10 + " Total Puan: " + point);
            } else {
                System.out.println("Result: " + result + " Puan:" + 0 + " Total Puan: " + point);
            }
        }
        in.close();
    }
}
