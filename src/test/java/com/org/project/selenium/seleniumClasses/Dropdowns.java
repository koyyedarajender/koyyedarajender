package com.org.project.selenium.seleniumClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import java.io.IOException;

/**
 * Created by rajender.koyyeda on 26-04-2022.
 */
public class Dropdowns {
    public static void main(String args[]) throws InterruptedException, IOException {
        String path = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", path + "\\src\\test\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement OneDropdown= driver.findElement(By.xpath("(//select[@class='col-lg-3'])[1]"));
        Select s= new Select(OneDropdown);
        s.selectByVisibleText("Yahoo");
        Thread.sleep(2000);
        s.selectByValue("Microsoft");
        Thread.sleep(2000);
        s.selectByIndex(2);
        if(s.isMultiple()){
            System.out.println("it is multi selectable dropdown");
        }else{
            System.out.println("it is not multi selectable dropdown");
        }

    }
}
