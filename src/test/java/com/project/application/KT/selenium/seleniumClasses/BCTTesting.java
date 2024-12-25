package com.project.application.KT.selenium.seleniumClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

/**
 * Created by rajender.koyyeda on 28-04-2022.
 */
public class BCTTesting {

    public static void main(String args[]) throws InterruptedException, IOException {
        String path = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", path + "\\src\\test\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

       /*
        String path="path + "\\src\\test\\resources\\drivers\\geckodriver.exe";

        System.setProperty("webdriver.gecko.driver", );
        WebDriver driver = new FirefoxDriver();

        System.property("webdriver.IE.driver","path");
        WebDriver driver=new InternetExplorerDriver();


        System.property("webdriver.opera.driver","path");
        WebDriver driver=new operaDriver();

        WebDriver driver=new safariDriver();

        */


        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        String password = "secret_sauce";
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        System.out.println("Username entered");
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys(password);
        System.out.println("password entered");
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(2000);
        System.out.println("login succesfull");
        driver.close();

    }
}
