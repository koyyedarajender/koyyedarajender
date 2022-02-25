package com.org.project.coreJava;

/**
 * Created by rajender.koyyeda on 14-02-2022.
 */
public class LoopsExample {

    public static void main(String args[]){

      /*  char[] alpbhts = { 'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        int[] num = {9,8,7};
        System.out.println(alpbhts.length);

       for(char i = 0; i < alpbhts.length; i++) {
            char alpbht = alpbhts[i];
            System.out.print(alpbht + " ");

        }

        System.out.println();
        for(int i = alpbhts.length-1; i >= 0  ; i--) {
            char alpbht = alpbhts[i];
            System.out.print(alpbht + " ");

        }


         System.out.println();
        for(char alphbt : alpbhts)
        {
            System.out.print(alphbt + " ");
        }

        System.out.println();
        for(int a : num)
        {
            System.out.print(a + " ");
        }

        int a= 10,b=15;
        while(a<b){
            System.out.println("true code");
            a=a+1;
        }
        System.out.print("false code");*/



        int a= 10,b=12;
        do{
            System.out.println("true code");
            a=a+1;
        }
        while(a<b);
        System.out.print("false code");


    }
}
