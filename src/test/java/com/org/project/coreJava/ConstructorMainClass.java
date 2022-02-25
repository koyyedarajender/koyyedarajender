package com.org.project.coreJava;

/**
 * Created by rajender.koyyeda on 18-02-2022.
 */
public class ConstructorMainClass {

    int a;

    public ConstructorMainClass(){
        System.out.println("default constructor");
    }

    public ConstructorMainClass(int b){
        a=b;
        System.out.println("parameter constructor");
    }
    public ConstructorMainClass(int b,int c){
        System.out.println("two parameter constructor");
    }

    public void add(){
        a=a+a;
        System.out.println("add method : "+a);
    }
    public static void main(String args[]){
        ConstructorMainClass constructorMainClass = new ConstructorMainClass(22);
       // constructorMainClass.a=10;
        constructorMainClass.add();

    }
}
