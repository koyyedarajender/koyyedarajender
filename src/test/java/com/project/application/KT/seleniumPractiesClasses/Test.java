package com.project.application.KT.seleniumPractiesClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Created by rajender.koyyeda on 19-04-2022.
 */
public class Test {


    public static void main(String args[]) throws InterruptedException {


        String path = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", path + "\\src\\test\\resources\\drivers\\chromedriver.exe");


        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("disable-infobars");
        chromeOptions.addArguments("--enable-automation");
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("--disable-dev-shm-usage");
        chromeOptions.addArguments("use-fake-device-for-media-stream");
        chromeOptions.addArguments("use-fake-ui-for-media-stream");
        chromeOptions.addArguments("--window-size=1936,1056");
        chromeOptions.addArguments("start-maximized");
        chromeOptions.addArguments("--remote-allow-origins=*");
        chromeOptions.setHeadless(Boolean.parseBoolean("false"));

        WebDriver driver = new ChromeDriver(chromeOptions);



        driver.get("https://www.saucedemo.com/");
        Thread.sleep(1000);



        driver.findElement(By.id("user-name")).click();


       /* System.out.println("clicked on user name");
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[1]/input")).click();
        System.out.println("clicked on user name2");
        driver.findElement(By.xpath("//input[@id='user-name']")).click();
        System.out.println("clicked on user name3");*/



        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        Thread.sleep(1000);

        String username= driver.findElement(By.xpath("//input[@id='user-name']")).getAttribute("value");
        System.out.println("My logged in user is: "+username);

        String logo= driver.findElement(By.xpath("//div[@class=\"login_logo\"]")).getText();
        System.out.println("My logo: "+logo);

        String usercolor= driver.findElement(By.xpath("//input[@id='user-name']")).getCssValue("color");
        System.out.println("My logged in user color  is: "+usercolor);


        String title= driver.getTitle();
        System.out.println("My title is: "+title);

        String cURL= driver.getCurrentUrl();
        System.out.println("My cURL is: "+cURL);

        String pageSource= driver.getPageSource();
        System.out.println("My pageSource is: "+pageSource);

        driver.findElement(By.xpath("//input[@id='user-name']")).clear();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        Thread.sleep(1000);

        //input[@id='user-name']


        // driver.close();
        System.out.println("closed");
        driver.quit();
        System.out.println("quit in the browser");


    }

}
