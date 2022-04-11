package com.org.project.coreJava.inheritance;

/**
 * Created by rajender.koyyeda on 04-04-2022.
 */
public class InheritanceExampleChild extends InheritanceExampleParent{

    public void method3(){
        System.out.println("child class method3");
    }

    public static void main(String args[]){
        InheritanceExampleChild inheritanceExampleChild = new InheritanceExampleChild();
        inheritanceExampleChild.method1();
        inheritanceExampleChild.method2();
        System.out.println(inheritanceExampleChild.age);
        inheritanceExampleChild.method3();
    }
}
