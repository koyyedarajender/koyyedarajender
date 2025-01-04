package com.project.application.KT.selenium.seleniumPractiesClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static com.project.application.utills.ConfigFile.projectDirectory;

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




        driver.findElement(By.id("user-name")).click();
        System.out.println("clicked on user name");

        driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[1]/input")).click();
        System.out.println("clicked on user name2");
        driver.findElement(By.xpath("//input[@id='user-name']")).click();
        System.out.println("clicked on user name3");
        //input[@id='user-name']
        Thread.sleep(2000);

        driver.close();
        System.out.println("closed");
        driver.quit();


    }

}
