package com.org.project.coreJava.abstraction;

/**
 * Created by rajender.koyyeda on 05-04-2022.
 */
public class ChildClass extends ParentClass {
    void run() {
        System.out.println("childclass run method - running");
    }

    public static void main(String args[]) {
        ParentClass obj = new ChildClass();
        obj.run();

        ChildClass obj1 = new ChildClass();
        obj1.run();

    }
}
