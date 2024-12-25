package com.project.application.KT.practicePackage;

import java.util.Scanner;

public class EvenOddPractice {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to check: ");
        a = sc.nextInt();

        if (a % 2 == 0) {

            System.out.println("number is even ");

        } else {

            System.out.println("number is odd ");
        }


    }
}
