package com.project.application.KT.coreJava.inheritance;


public class SingleInheritanceExample {
    public static void main(String args[]) {
        /*single

        child c = new child();

        System.out.println(c.i);
        System.out.println(c.j);
        System.out.println(c.name);
        System.out.println(c.name2);
        c.childMethod();
        c.parentMethod();*/

        //multiLevvel
        Child2 child2 = new Child2();
        child2.childMethod();
        child2.parentMethod();


    }
}
