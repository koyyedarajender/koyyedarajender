package com.org.project.coreJava.abstraction;

/**
 * Created by rajender.koyyeda on 05-04-2022.
 */
public class interfaceChildClass implements printInterface{
    public void print(){
        System.out.println("interfaceChildClass class print method ");
    }
    public static void main(String args[]){
        interfaceChildClass interfaceChildClass = new interfaceChildClass();
        interfaceChildClass.print();
    }
}
