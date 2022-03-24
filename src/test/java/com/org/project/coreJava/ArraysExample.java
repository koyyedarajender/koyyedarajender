package com.org.project.coreJava;

/**
 * Created by rajender.koyyeda on 10-02-2022.
 */
public class ArraysExample {
    public static void main(String[] agrs) {

     /*int[] scores = { 215, 234, 218, 189, 221, 290}; //initiation

     System.out.println(scores.length);
     *//*for(int i = 0; i < scores.length; i++)
     {
      int score = scores[i];
      System.out.print(score + "  ");

     }System.out.println();*//*

     for(int j :scores)
     {
      System.out.print(j+ "  ");

     }*/


       /* int []b; //declare
        b= new int[4]; //instantiation
        b[0]=12;  ////initiation
        b[1]=13;
        b[2]=14;
        b[3]=15;
       // b[4]=15; exception

     for(int i = 0; i < b.length; i++)
     {
     // int s = ;
      System.out.print(b[i] + "  ");

     }*/



        /*int[][] raj={{1,2,3},{4,5,6}};  //2*3
        for(int i=0;i<raj.length;i++){

            for(int j=0;j<3;j++){

                System.out.println(raj[i][j]);

            }

        }*/

        //copy array and clone array

        char[] source={'r','a','j','e','n','d','e','r'};

        System.out.println("source array elements: "+String.valueOf(source));  //array to string


        char[] raj=new char[5];

        System.arraycopy(source,0,raj,0,5);


        System.out.println("copied destination array elements: "+String.valueOf(raj));  //copy

        char a[]=source.clone();

        System.out.println("cloned a array elements: "+String.valueOf(a));  //clone


    }


}
