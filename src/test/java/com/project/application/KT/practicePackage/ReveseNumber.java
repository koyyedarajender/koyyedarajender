package com.project.application.KT.practicePackage;

import java.util.Scanner;

public class ReveseNumber {
    public static void main(String[] args) {
        int num;
        int r = 0;
        System.out.println("enter the number:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        while (num != 0) {
            r = r * 10;
            r = r + num % 10;
            num = num / 10;
        }
        System.out.println("reverse of given number is :" + r);
    }
}
