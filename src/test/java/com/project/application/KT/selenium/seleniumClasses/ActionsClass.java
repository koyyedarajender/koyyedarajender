package com.project.application.KT.selenium.seleniumClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

/**
 * Created by rajender.koyyeda on 27-04-2022.
 */
public class ActionsClass {

    public static void main(String args[]) throws InterruptedException, IOException {
        String path = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", path + "\\src\\test\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        Actions actions = new Actions(driver);


        WebElement user = driver.findElement(By.id("user-name"));
        WebElement pass = driver.findElement(By.name("password"));
        WebElement login = driver.findElement(By.id("login-button"));

        actions.click(user).build().perform();
        Thread.sleep(2000);
        actions.contextClick(user).build().perform();
        Thread.sleep(2000);
        actions.click(user).build().perform();
        Thread.sleep(2000);
        actions.sendKeys(user, "standard_user").build().perform();
        Thread.sleep(2000);

        actions.keyDown(Keys.CONTROL).build().perform();
        actions.sendKeys("a").build().perform();
        actions.keyUp(Keys.CONTROL).build().perform();

        actions.sendKeys(Keys.TAB).build().perform();
        Thread.sleep(2000);
        actions.sendKeys(pass, "secret_sauce").build().perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(2000);
        System.out.println("the login success");
        driver.close();


    }
}
