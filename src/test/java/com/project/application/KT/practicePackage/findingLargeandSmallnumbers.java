package com.project.application.KT.practicePackage;

public class findingLargeandSmallnumbers {
    public static void main(String[] agrs) {
        int[] marks = {35, 12, 45, 15, 42};
        int smallest = marks[0];
        int largest = marks[0];
        for (int i = 1; i < marks.length; i++) {
            if (marks[i] > largest)
                largest = marks[i];
            else if (marks[i] < smallest)
                smallest = marks[i];
        }
        System.out.println("smallest number is:" + smallest);
        System.out.println("largest number is:" + largest);
    }
}
