package com.project.application.KT.selenium.seleniumClasses;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * Created by rajender.koyyeda on 22-04-2022.
 */
public class ResizeWindows {

    public static void main(String args[]) throws InterruptedException {
        String path = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", path + "\\src\\test\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.get("https://www.saucedemo.com/");
        Thread.sleep(2000);


        /*int width = driver.manage().window().getSize().getWidth();
        int height = driver.manage().window().getSize().getHeight();
        System.out.println("the width and height of window is " + width + " , " + height);

        Dimension d = new Dimension(1900, 1020);

        driver.manage().window().setSize(d);
        Thread.sleep(2000);*/

        int X = driver.manage().window().getPosition().getX();
        int Y = driver.manage().window().getPosition().getY();
        System.out.println("the x and y of window is " + X + " , " + Y);
        Point p = new Point(2, 2);
        driver.manage().window().setPosition(p);
        Thread.sleep(3000);
        driver.quit();

    }
}
