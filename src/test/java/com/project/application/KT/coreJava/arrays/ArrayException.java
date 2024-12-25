package com.project.application.KT.coreJava.arrays;

/**
 * Created by rajender.koyyeda on 04-02-2022.
 */
public class ArrayException {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Before thread sleep ");
        Thread.sleep(3000);
        System.out.println("After thread sleep ");
        try {
            int a[] = {9, 8, 7};
            System.out.println(a[4] / 1);
            System.out.println("Success:: try code");
        } catch (Exception es) {
            System.out.println("failed :: array calling with size- catch code");
            es.printStackTrace();
            //es.getMessage();
        } finally {
            System.out.println("Finally code");
        }

        System.out.println("main method code");

        int age = 15;

        if (age < 18) {
            //throw Arithmetic exception if not eligible to vote
            throw new ArithmeticException("Person is not eligible to vote");
        } else {
            System.out.println("Person is eligible to vote!!");
        }
    }
}
