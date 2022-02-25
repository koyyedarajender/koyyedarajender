package com.org.project.practiesPackage;

import java.util.Scanner;

public class OddEven {
    public static void main(String args[]) {
        //variable initialization
        for(int i=1;i<=100;i++){
            int number;
            //Run time number
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your number");
            number = sc.nextInt();
            if (number % 2 == 0) {
                System.out.println("\n You have entered EVEN Number");
                 } else {
                System.out.println("\n You have entered odd Number");


            }
        }


    }


}

