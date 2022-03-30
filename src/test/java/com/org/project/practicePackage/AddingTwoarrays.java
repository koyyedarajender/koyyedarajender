package com.org.project.practicePackage;

public class AddingTwoarrays {
    public static void main(String[] agrs) {
        int[][] a={{1,3,4},{4,5,6}};
        int[][] b={{1,2,3},{2,4,3}};
        int[][] sum=new int[2][3];
        for(int i=0;i<a.length;i++){

            for(int j=0;j<3;j++){
                sum[i][j]=a[i][j]+b[i][j];

                System.out.print(sum[i][j]+" ");
            }
            System.out.println();

            }
    }


    }
