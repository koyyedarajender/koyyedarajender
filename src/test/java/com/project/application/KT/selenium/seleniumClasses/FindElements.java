package com.project.application.KT.selenium.seleniumClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * Created by rajender.koyyeda on 22-04-2022.
 */
public class FindElements {
    public static void main(String args[]) throws InterruptedException {
        String path = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", path + "\\src\\test\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.get("https://www.saucedemo.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement element = driver.findElement(By.id("user-name"));

        element.sendKeys("rajenderkoyyeda");

        List<WebElement> list = driver.findElements(By.xpath("//input[@class='input_error form_input']"));
        System.out.println("no of elements are " + list.size());

        list.get(0).clear();
        Thread.sleep(3000);
        list.get(0).sendKeys("standard_user");
        Thread.sleep(3000);
        list.get(1).sendKeys("secret_sauce");
        Thread.sleep(3000);
        driver.quit();


    }
}
