package com.project.application.KT.coreJava.encapsulation;

/**
 * Created by rajender.koyyeda on 11-04-2022.
 */
public class TestEncapsulation {
    public static void main(String[] args) {
        Student s = new Student();

//setting value in the name member
        s.setName("Rajender");
//getting value of the name member
        System.out.println(s.getName());
    }
}
