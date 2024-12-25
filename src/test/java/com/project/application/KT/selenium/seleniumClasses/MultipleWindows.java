package com.project.application.KT.selenium.seleniumClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by rajender.koyyeda on 22-04-2022.
 */
public class MultipleWindows {

    public static void main(String args[]) throws InterruptedException, AWTException {


        String path = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", path + "\\src\\test\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.get("https://www.saucedemo.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);

        String parent = driver.getWindowHandle();
        System.out.println("the current window handle name is :" + parent);


        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_T);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_T);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_T);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_T);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_T);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_T);


        Thread.sleep(3000);


        Set<String> s = driver.getWindowHandles();
        Iterator<String> it = s.iterator();
        while (it.hasNext()) {
            String childWindow = it.next();

            if (!parent.equalsIgnoreCase(childWindow)) {
                driver.switchTo().window(childWindow);
                Thread.sleep(3000);
                driver.get("http://www.gmail.com");
                Thread.sleep(3000);
                System.out.println("the new tab is : " + driver.getTitle());
                driver.close();
                Thread.sleep(3000);
            }
        }
        driver.switchTo().window(parent);
        Thread.sleep(3000);
        System.out.println("the parent tab is : " + driver.getTitle());

        /*String p1= driver.findElement(By.xpath("(//div[@class='inventory_item_name'])[1]")).getText();
        System.out.println("the 1st product name is "+ p1);*/


        driver.quit();
    }
}
