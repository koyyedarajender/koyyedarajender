package com.project.application.KT.selenium.seleniumClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static com.project.application.utills.BrowserFactory.setChromeOptions;
import static com.project.application.utills.ConfigFile.headless;

public class Main {
    public static void main(String[] args) {

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
        chromeOptions.setHeadless(Boolean.parseBoolean("true"));

        WebDriver driver = new ChromeDriver(chromeOptions);


        driver.get("http://www.example.com");
        System.out.println("Page title is: " + driver.getTitle());
        driver.quit();
    }
}
