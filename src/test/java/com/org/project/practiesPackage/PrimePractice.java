package com.org.project.practiesPackage;

import java.util.Scanner;

/**
 * Created by rajender.koyyeda on 17-02-2022.
 */
public class PrimePractice
    {
        public static void main(String arg[])
        {
            System.out.println("Enter a number:\n");
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            primeCal(n);
        }
        static void primeCal(int num) {
            int num1 = num;
            int remainder=0;
            int flag=0;
            for (int i = 2; i < num1; i++) {
               // remainder=num1%i;
                if( num1%i==0) {
                    flag=1;
                  //  System.out.println("num is:"+num1+"\ti is:" + i + "\t Remainder is:" + remainder + " number is prime number");
                }if(flag==0){
                    System.out.println("num is prime");
                }
                else {
                    System.out.println("num is not prime");
                   // System.out.println("num is:"+num1+"\ti is:" + i + "\t Remainder is:" + remainder + " number is not a prime number");
                }
            }

        }

    }


