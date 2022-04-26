package com.org.project.selenium.seleniumClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;


/**
 * Created by rajender.koyyeda on 26-04-2022.
 */
public class Sync {
    public static void main(String args[]) throws InterruptedException, IOException {
        String path = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", path + "\\src\\test\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        String password = "secret_sauce";

        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        driver.findElement(By.name("password")).sendKeys(password);

        WebDriverWait wait = new WebDriverWait(driver,20);

        WebElement login = driver.findElement(By.id("login-button"));
        wait.until(ExpectedConditions.elementToBeClickable(login));
        login.click();

       // Wait w= new FluentWait(driver).withTimeout(10,TimeUnit.MINUTES).pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);

        System.out.println("the login success");
        driver.close();

    }
}
