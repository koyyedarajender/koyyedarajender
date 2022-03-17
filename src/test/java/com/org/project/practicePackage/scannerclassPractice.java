package com.org.project.practicePackage;

import java.util.Scanner;

public class scannerclassPractice {

    public static void main(String[] agrs) {
        Scanner sc= new Scanner(System.in);
        System.out.println("1 :: entered the student marks ");
        float marks=sc.nextFloat();
        System.out.println(" 2. entered the student marks " +marks);
        System.out.println("enter float :> ");

        Boolean marks1 =sc.hasNextFloat();
        System.out.println("entered the marks float?" +marks1);
    }
}


