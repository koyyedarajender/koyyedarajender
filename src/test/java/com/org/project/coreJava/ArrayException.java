package com.org.project.coreJava;

/**
 * Created by rajender.koyyeda on 04-02-2022.
 */
public class ArrayException {
    public static void main(String[] args) throws InterruptedException {

        Thread.sleep(1000);
        try{
            int a[]={9,8,7};
            System.out.println(a[2]/1);
            System.out.println("Success:: try code");
        }catch (Exception es){
            System.out.println("failed :: array calling with size- catch code");
           es.printStackTrace();
         //  es.getMessage();
        }finally {
            System.out.println("Finally code");
        }

        System.out.println("main method coce");
    }
}
