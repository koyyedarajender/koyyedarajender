package com.org.project.coreJava;

/**
 * Created by rajender.koyyeda on 21-02-2022.
 */
class Student{
    {
        System.out.println("normal block");
    }
    static {

        System.out.println("Static block");
    }
    int rollno;//instance variable
    String name;
    static String college ="XYZ";//static variable

    static void change(){
        college = "ABC";
    }

    //constructor
    Student(int r, String n){
        rollno = r;
        name = n;
    }
    //method to display the values
    void display (){System.out.println(rollno+" "+name+" "+college);}

    void display1 (){System.out.println(rollno+" "+name+" "+college);}
}
public class StaticKeyWordExample {
    public static void main(String args[]){

        Student.change();//calling change method

        //create obj
        Student s1 = new Student(111,"Karan");
        Student s2 = new Student(222,"Aryan");
        //we can change the college of all objects by the single line of code
        //Student.college="BBDIT";
        s1.display();
        s2.display();
        s2.display1();
    }
}
