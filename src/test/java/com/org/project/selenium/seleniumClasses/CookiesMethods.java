package com.org.project.selenium.seleniumClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

/**
 * Created by rajender.koyyeda on 28-04-2022.
 */
public class CookiesMethods {
    public static void main(String args[]) throws InterruptedException, IOException {
        String path = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", path + "\\src\\test\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        System.out.println("Before website launch cookies are "+driver.manage().getCookies());
        System.out.println("Before website launch cookies count are "+driver.manage().getCookies().size());
        driver.manage().deleteAllCookies();
        if(driver.manage().getCookies().size()==0){
            System.out.println("No cookies found");
        }else{
            System.out.println("cookies found");
        }

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        String password = "secret_sauce";
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(2000);


        System.out.println("After website launch cookies are "+driver.manage().getCookies());
        System.out.println("After website launch cookies count are "+driver.manage().getCookies().size());
        if(driver.manage().getCookies().size()==0){
            System.out.println("No cookies found");
        }else{
            System.out.println("cookies found");
        }



        System.out.println("Before/A website launch cookies are "+driver.manage().getCookies());
        System.out.println("Before/A website launch cookies count are "+driver.manage().getCookies().size());
        driver.manage().deleteAllCookies();
        if(driver.manage().getCookies().size()==0){
            System.out.println("No cookies found");
        }else{
            System.out.println("cookies found");
        }


        driver.close();
    }
}
