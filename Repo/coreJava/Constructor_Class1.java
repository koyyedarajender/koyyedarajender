package com.org.project.coreJava;

public class Constructor_Class1 extends Constructor_Class {

    public Constructor_Class1(String x){
        bb=x;
        System.out.println(" Parameter constructor of ClassObject_Class1 " +bb);
    }
    public Constructor_Class1(){
        System.out.println(" Default constructor of ClassObject_Class1 ");
    }


    int aa = 100;
    String bb = "testttt";
    char cc = 'Z';

    public void method11() {

        System.out.println(" ClassObject_Class method11 " + aa + bb + cc);
    }

    public void method22() {

        System.out.println(" ClassObject_Class method21 " + aa + bb + cc);
    }
}
