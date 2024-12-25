package com.project.application.KT.coreJava;

/**
 * Created by rajender.koyyeda on 21-03-2022.
 */
public class conditionalStatementExample {

    public void ifMethod(int a, int b) {
        if (a < b) {
            System.out.println(" True ");
        }
    }

    public void ifElseMethod(int a, int b) {
        if (a < b) {
            System.out.println(" True ");
        } else {
            System.out.println(" False ");
        }
    }

    public void ifElseIfMethod(int a, int b) {
        if (a < b) {
            System.out.println(" True ");
        } else if (b < a) {
            System.out.println(" False--True ");
        } else {
            System.out.println(" False--False ");
        }
    }

    public void nestedIfMethod(int a, int b) {
        if (a < b) {
            if (a < b) {
                if (a < b) {
                    if (a < b) {
                        System.out.println(" Nested IF true code ");
                    }
                }

            }

        }

    }

    public static void main(String args[]) {

        conditionalStatementExample conditionalStatementExampleOBJ = new conditionalStatementExample();

        //  conditionalStatementExampleOBJ.ifMethod(20,23);

        //  conditionalStatementExampleOBJ.ifElseMethod(20,19);

        // conditionalStatementExampleOBJ.ifElseIfMethod(10, 10);

        conditionalStatementExampleOBJ.nestedIfMethod(10, 20);

    }
}
