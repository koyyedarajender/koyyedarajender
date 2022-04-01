package com.org.project.coreJava;

/**
 * Created by rajender.koyyeda on 02-02-2022.
 */
public class Constructor_Class {
    int a;
    String b;
    char c;

    public Constructor_Class(String y){
        System.out.println(" Parameter constructor of ClassObject_Class " +y);
    }
    public Constructor_Class(int a, String b, char c) {
        System.out.println(" 3 -p constructor of ClassObject_Class ");
        this.a = a;
        this.b = b;
        this.c = c;
    }



    public void method1() {

        System.out.println(" ClassObject_Class method1 " + a + b + c);
    }

    public void method2() {

        System.out.println(" ClassObject_Class method2 : " + a + b + c);
    }

    public static void main(String args[]) {

        Constructor_Class object = new Constructor_Class(12, "rajender", 'R');
        Constructor_Class object2 = new Constructor_Class("testing");

        object.method1();


    }

}


