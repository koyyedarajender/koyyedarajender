package com.org.project.practicePackage;

import java.util.Scanner;

public class SwitchCasePractice {
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        String companyname=sc.nextLine();
        switch(companyname){
            case"Infosys":
                System.out.println("CEO is Narayanmurthy");
                break;
            case"Wipro":
                System.out.println("CEO is Ajim premji");
                break;
            case"Google":
                System.out.println("CEO is sundar pichai");
                break;
            default:
                System.out.println("provided none of mentioned company:" +companyname+" is a null");
                break;




        }

    }

}
