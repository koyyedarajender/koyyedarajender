package com.project.application.KT.coreJava;

/**
 * Created by rajender.koyyeda on 14-02-2022.
 */
public class OperatorsMainClass {
    public static void main(String args[]) {

        //Unary=========

        /*int x=10;
        int y=-x;

        System.out.println(y);
        System.out.println(x);*/

        /*int x=10;
        int y=++x; //pre increment
        System.out.println(x);  //11
        System.out.println(y);  //11*/

        /*int x=10;
        int y=x++; //post increment
        System.out.println(x);  //11
        System.out.println(y); //10*/


        /*int x=10;
        int y=--x; //pre decrement
        System.out.println(x); //9
        System.out.println(y);  //9*/

        /*int x=10;
        int y=x--; //post decrement
        System.out.println(x); //9
        System.out.println(y);  //10*/

        /* Binary=========
        +-/*
        <.>,<=,==
        &&,||,!
        =  */


        //Ternery
        int x = 5;
        int y = 6;
        int z = x < y ? x : y;   //true x and false y
        System.out.println(z);

    }
}
