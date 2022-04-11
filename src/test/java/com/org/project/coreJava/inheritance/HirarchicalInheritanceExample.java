package com.org.project.coreJava.inheritance;

import com.org.project.coreJava.inheritance.ClassC;

/**
 * Created by rajender.koyyeda on 25-02-2022.
 */
public class HirarchicalInheritanceExample {
    public static void main(String args[]){

        /*ClassB classB = new ClassB();
        classB.BMethod();
        classB.AMethod();*/

        ClassC classC= new ClassC();
        classC.CMethod();
        classC.AMethod();



    }
}
