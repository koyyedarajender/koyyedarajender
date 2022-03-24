package com.org.project.coreJava;

import java.util.Scanner;

/**
 * Created by rajender.koyyeda on 24-03-2022.
 */
public class PrimeNumber {
    public static void main(String args[]){

        System.out.println("enter the number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int flag=0;

        for(int i=2;i<num;i++) {

            if (num % i == 0) {
                flag = 1;
            }

        }
            if (flag == 0) {
                System.out.println("Given number is Prime: " + num);
            } else {
                System.out.println("Given number is not Prime: " + num);
            }


        }

    }

