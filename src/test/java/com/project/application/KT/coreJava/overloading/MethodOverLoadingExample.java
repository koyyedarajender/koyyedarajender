package com.project.application.KT.coreJava.overloading;

/**
 * Created by rajender.koyyeda on 05-04-2022.
 */
public class MethodOverLoadingExample {

    static int add(int a, int b) {

        return a + b;
    }

    static int add(int a, int b, int c) {

        return a + b + c;
    }

    public void add1(int a, int b) {
        int x = a + b;
        System.out.println("add from void method add1: " + x);
    }

    public void add1(int a, int b, int c) {
        int x = a + b + c;
        System.out.println("add from void method add1: " + x);
    }

    public static void main(String args[]) {

        MethodOverLoadingExample objName = new MethodOverLoadingExample();
        objName.add1(1, 2);
        objName.add1(1, 2, 3);
    }


}
