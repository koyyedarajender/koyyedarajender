package com.project.application.KT.coreJava.inheritance;

/**
 * Created by rajender.koyyeda on 25-02-2022.
 */
public class ClassB extends ClassA {

    int i = 11;
    String name = "abc";

    public void BMethod() {
        System.out.println("B class method details: " + i + " and " + name);
    }
}
