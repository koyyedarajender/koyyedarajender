package com.org.project.coreJava;

import java.io.File;

/**
 * Created by rajender.koyyeda on 21-04-2022.
 */
public class Test {

    public static void main(String[] args) {
        File dir = new File("D:\\Test\\New folder");
        File[] fileList = dir.listFiles();
        System.out.println("Files count is " + fileList.length);
        for (int i = 0; i < fileList.length; i++) {
            File x = fileList[i];
            System.out.println("File name is " + x);

            if (x.getName().contains("(") && x.getName().contains(")")) {
                System.out.println(x.getName() + " Has duplicated so deleting");
                x.deleteOnExit();

            }

        }
    }

}
