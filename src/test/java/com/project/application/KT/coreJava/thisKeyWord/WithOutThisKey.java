package com.project.application.KT.coreJava.thisKeyWord;

/**
 * Created by rajender.koyyeda on 24-02-2022.
 */
public class WithOutThisKey {
    int rollno;

    public WithOutThisKey(int rollno) { //1st
        this.rollno = rollno;                      //2nd
    }

    public void method1() {
        System.out.println(rollno);          //3rd
    }

}

class TestMain {
    public static void main(String args[]) {
        WithOutThisKey withOutThisKey = new WithOutThisKey(11);
        withOutThisKey.method1();

    }

}
