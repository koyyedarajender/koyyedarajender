package com.org.project.practicePackage;

import java.util.Scanner;

public class swappingStrings {
    public static void main(String[] args) {
        String a = "au";
        String b = "test";
        String s = a + b; // autotest
        b =s.substring(0, s.length() - b.length());
        a = s.substring(b.length());
        System.out.println("a:" + a );
        System.out.println("b:" + b );



    }
}
