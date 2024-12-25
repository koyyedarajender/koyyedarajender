package com.project.application.KT.selenium.seleniumClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;

/**
 * Created by rajender.koyyeda on 28-04-2022.
 */
public class HeadlessExe {
    public static void main(String args[]) throws InterruptedException, IOException {
        String path = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", path + "\\src\\test\\resources\\drivers\\chromedriver.exe");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        WebDriver driver = new ChromeDriver(chromeOptions);

        // WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");
        System.out.println("launched website ");
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
