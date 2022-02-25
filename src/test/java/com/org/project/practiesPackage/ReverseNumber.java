package com.org.project.practiesPackage;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String arg[]) {
        //variable initialization
        //public int number;
        int remainder;
        int reverse = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = sc.nextInt();
        while (number>0)
        {

            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;

        }
        System.out.format("\n Reverse of entered number is = %d\n", reverse);
    }
}