package com.org.project.selenium.seleniumClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by rajender.koyyeda on 18-04-2022.
 */
public class WebDriverBasicMethods {

    public static void main(String args[]) throws InterruptedException {

        String path = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", path + "\\src\\test\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.get("https://www.saucedemo.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        //driver.close();
        System.out.println("the title of website is "+ driver.getTitle());

        System.out.println("the page source of website is "+ driver.getPageSource());


        String Curl= driver.getCurrentUrl();

        System.out.println("the current URL  of website is "+ Curl);

        if(Curl.contains("https")){
            System.out.println("the current URL is secure");
        }else{
            System.out.println("the current URL is not secure");
        }



        String password = "secret_sauce";

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(2000);
        driver.findElement(By.id("user-name")).clear();
        Thread.sleep(2000);
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(2000);



        driver.findElement(By.name("password")).sendKeys(password);
        Thread.sleep(2000);
        System.out.println("the getattribute value for login button is "+driver.findElement(By.id("login-button")).getAttribute("type"));

        System.out.println("the getcss color value for login button is "+driver.findElement(By.id("login-button")).getCssValue("border"));


        driver.findElement(By.id("login-button")).click();
        System.out.println("the login success");
        Thread.sleep(3000);

        String p1= driver.findElement(By.xpath("(//div[@class='inventory_item_name'])[1]")).getText();
        System.out.println("the 1st product name is "+ p1);
        driver.quit();

    }
}
