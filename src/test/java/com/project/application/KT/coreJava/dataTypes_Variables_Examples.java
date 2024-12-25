package com.project.application.KT.coreJava;

/**
 * Created by rajender.koyyeda on 15-03-2022.
 */
public class dataTypes_Variables_Examples {

    public void add() {
        System.out.println("this is from add method");
    }

    public static void main(String args[]) {

        int a = 10;
        char b = 'A';
        float c = 12;
        String d = "Testing";

        String e = new String("Automation");

        System.out.println("Data type-int values are : " + a);
        System.out.println("Data type-char values are : " + b);
        System.out.println("Data type-float values are : " + c);
        System.out.println("Data type-string values are : " + d);

        System.out.println("Data type-string derived values are : " + e);


        dataTypes_Variables_Examples dataTypes_variables_examples_object = new dataTypes_Variables_Examples();

        dataTypes_variables_examples_object.add();

    }
}
