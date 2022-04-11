package com.org.project.coreJava.inheritance;

/**
 * Created by rajender.koyyeda on 25-02-2022.
 */
public class ClassC extends ClassA{
    int j = 20;
    String name3 = "xyz";

    public void CMethod() {
        System.out.println("C class method details: " + j + " and " + name3);
    }
}
