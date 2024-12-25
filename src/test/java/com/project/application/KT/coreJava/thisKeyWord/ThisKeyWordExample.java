package com.project.application.KT.coreJava.thisKeyWord;

/**
 * Created by rajender.koyyeda on 21-02-2022.
 */
public class ThisKeyWordExample {

    //constructor

    ThisKeyWordExample() {  //2nd
        this(5);
        System.out.println("empty constructor - hello a");
    }

    ThisKeyWordExample(int x) {  ///1st
        // this();
        System.out.println("one parameter constructor  " + x);
    }


    //var
    int rollno;
    String name;
    float fee;

    ThisKeyWordExample(int rollno, String name, float fee) {
        this.rollno = rollno;
        this.name = name;
        this.fee = fee;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + fee);
    }

    //methods
    void m() {
        System.out.println("hello m");
    }

    void n() {
        System.out.println("hello n");
//m();//same as this.m()
        this.m();
    }


}


class TestThis2 {
    public static void main(String args[]) {


        ThisKeyWordExample s3 = new ThisKeyWordExample();  //cons

        ThisKeyWordExample s1 = new ThisKeyWordExample(111, "ankit", 5000f);   //var
        ThisKeyWordExample s2 = new ThisKeyWordExample(112, "sumit", 6000f);  //var
        s1.display();
        s2.display();


        s1.n();  //methods
    }
}
