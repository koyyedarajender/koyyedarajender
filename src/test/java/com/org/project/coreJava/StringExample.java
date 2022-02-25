package com.org.project.coreJava;

/**
 * Created by rajender.koyyeda on 14-02-2022.
 */
public class StringExample {

    public static void main(String args[]){
        //www.javaTpoint.com

        /* String x="Rajender is boy";
        String y="rajEnder";

       System.out.println(x);
        System.out.println(x+y);
        System.out.println(x.trim());
        System.out.println(x.charAt(4));
        System.out.println(x.concat(y));


        String x="Rajender";
        String y="rajEnder";


        System.out.println(x.equals(y));
        System.out.println(x.equalsIgnoreCase(y));

        System.out.println(x.substring(5));
        System.out.println(x.substring(5,7));

       System.out.println(x.replace('e','Z')); */


        String x="Rajender is boy bad";
        String[] x1=x.split("is");
        String y="rajEnder";

        System.out.println(x1.length);  //2

        System.out.println(x1[0]);         //Rajender


        String[] x2=x.split("\\s+"); //space
        System.out.println(x.length()); //15
        System.out.println(x2.length); //3
        System.out.println(x2[1]);   //is
        System.out.println(x==y); //false

    }
}

