package com.project.application.KT.selenium.seleniumClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

/**
 * Created by rajender.koyyeda on 27-04-2022.
 */
public class JavaScriptExcutorClass {

    public static void main(String args[]) throws InterruptedException, IOException {
        String path = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", path + "\\src\\test\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);


        WebElement user = driver.findElement(By.id("user-name"));
        WebElement pass = driver.findElement(By.name("password"));
        WebElement login = driver.findElement(By.id("login-button"));


        JavascriptExecutor js = (JavascriptExecutor) driver;

        /*way-1
        way-2
        */

        //click
        // js.executeScript("arguments[0].click()",user); // if we have webelement

        // js.executeScript("document.getElementById('user-name').click();");  // click on element along with taking xpath
        // System.out.println("clicked");
        // Thread.sleep(2000);

        //sendkeys
        js.executeScript("arguments[0].value='standard_user'", user); // if we have webelement
        // js.executeScript("document.getElementById('user-name').value='standard_user';");  // click on element along with taking xpath
        Thread.sleep(2000);
        js.executeScript("arguments[0].value='secret_sauce'", pass);
        Thread.sleep(2000);
        // js.executeScript("document.getElementById('login-button').click();");
       /* System.out.println("clicked");
        Thread.sleep(4000);*/


        js.executeScript("arguments[0].scrollIntoView(true);", login);
        Thread.sleep(4000);
        driver.close();
    }
}
