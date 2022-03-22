package com.org.project.practicePackage;

import java.util.Scanner;

public class SwappingNumbers {
    public static void main(String[] args) {
        System.out.println("enter the values of a and b");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("before swapping numbers:"+ a +" "+ b);
                b=b-a;
                a=a+b;
                b=a-b;
        System.out.println("After swapping numbers:"+ a +" "+ b);

    }


    }

