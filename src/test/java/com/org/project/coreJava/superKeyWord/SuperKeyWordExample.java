package com.org.project.coreJava.superKeyWord;

/**
 * Created by rajender.koyyeda on 21-02-2022.
 */
public class SuperKeyWordExample {
    String color = "Parentwhite"; //var

    void eat() {

        System.out.println("Parent eating...");
    }  //method

    SuperKeyWordExample() {
        System.out.println("Parent class constructor is created");
    }  //constructor

}


class Dog extends SuperKeyWordExample {
    String color = "Childrensblack";

    void printColor() {
        System.out.println(color);//prints color of Dog class
        System.out.println(super.color);//prints color of Animal class
    }

    void eat() {
        System.out.println("Childrens eating bread...");
    } //method

    void bark() {
        System.out.println("barking...");
    }

    void work() {
        super.eat(); //method
        bark();
        eat();
    }

    Dog() {
        super(); //paraent class constructor
        System.out.println("Childrens dog is created");
    }

}


class TestSuper1 {
    public static void main(String args[]) {
        Dog d = new Dog();
        d.printColor();
        d.work();
    }
}
