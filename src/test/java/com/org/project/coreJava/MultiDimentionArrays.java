package com.org.project.coreJava;

/**
 * Created by rajender.koyyeda on 29-03-2022.
 */
public class MultiDimentionArrays {


    public static void main(String args[]) {
        int[][] arr={{1,2},{4,5},{4,5}};  //3*2



        for(int i=0;i<arr.length;i++){

            for(int j=0;j<2;j++){

                System.out.print(" "+arr[i][j]);  //00,01---10,11----20,21

            }
            System.out.println( );

        }
    }

}
