package com.project.application.KT.selenium.seleniumClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;

/**
 * Created by rajender.koyyeda on 22-04-2022.
 */
public class SwitchToAlerts {

    public static void main(String args[]) throws InterruptedException, AWTException {

        String path = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", path + "\\src\\test\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        // driver.get("https://demo.guru99.com/test/delete_customer.php");

        driver.get("https://www.facebook.com/");

        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);


        //active element code

        System.out.println("the active element  is " + driver.switchTo().activeElement().getText());
        driver.switchTo().activeElement().sendKeys("Rajender");
        driver.switchTo().activeElement().clear();
        Thread.sleep(2000);
        driver.switchTo().activeElement().sendKeys("Rajender");
        Thread.sleep(2000);
        /*driver.findElement(By.name("cusid")).sendKeys("ABCD");
        driver.findElement(By.name("submit")).click();
        Thread.sleep(2000);

        System.out.println("the alert message is "+driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();
        Thread.sleep(2000);
        driver.findElement(By.name("submit")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        System.out.println("the 2nd alert message is "+driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();*/
        driver.quit();

    }
}
