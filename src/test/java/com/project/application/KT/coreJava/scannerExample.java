package com.project.application.KT.coreJava;


import java.util.Scanner;

/**
 * Created by rajender.koyyeda on 10-02-2022.
 */
public class scannerExample {

    public static void main(String[] agrs) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Please Enter your age and space name ");
        int age = sc.nextInt();
        System.out.println(" Entered your age is: " + age);
        String Name = sc.nextLine();
        System.out.println(" Entered your name  is: " + Name);


    }
}
