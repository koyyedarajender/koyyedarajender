package com.project.application.KT.coreJava;

import java.util.Scanner;

/**
 * Created by rajender.koyyeda on 14-02-2022.
 */
public class SwitchExample {

    public static void main(String args[]) {

        Scanner scc = new Scanner(System.in);
        String stateName = scc.nextLine();


        switch (stateName) {
            case "telangana":
                System.out.println("Captiatal city of given state :" + stateName + " is a Hyderabad");
                break;
            case "tamilnadu":
                System.out.println("Captiatal city of given state :" + stateName + " is a Channai");
                break;
            case "Dehli":
                System.out.println("Captiatal city of given state :" + stateName + " is a dehli");
                break;

            default:
                System.out.println("provided none of mentioned state :" + stateName + " is a null");
                break;
        }

    }
}
