package com.project.application.KT.selenium.seleniumClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

/**
 * Created by rajender.koyyeda on 28-04-2022.
 */
public class RobotClass {

    public static void main(String args[]) throws InterruptedException, IOException, AWTException {
        String path = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", path + "\\src\\test\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        String localPath = path + "\\src\\test\\resources\\drivers\\Capture.PNG";
        StringSelection input = new StringSelection(localPath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(input, null);

        System.out.println("Pasted path is  " + localPath);


        driver.get("https://www.monsterindia.com/seeker/registration");
        System.out.println("launched website ");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class='browse-text']")).click();
        Thread.sleep(2000);

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        driver.close();


    }
}
