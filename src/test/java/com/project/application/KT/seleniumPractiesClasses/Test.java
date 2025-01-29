package com.project.application.KT.seleniumPractiesClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

/**
 * Created by rajender.koyyeda on 19-04-2022.
 */
public class Test {


    public static void main(String args[]) throws InterruptedException, IOException, AWTException {


        String path = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", path + "\\src\\test\\resources\\drivers\\chromedriver.exe");

       /* System.setProperty("webdriver.IE.driver", pathofdriver);
        System.setProperty("webdriver.opera.driver", pathofdriver);
        WebDriver driver1 = new SafariDriver();
        driver1.get("URL");
        */


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



       /*  driver.get("https://www.saucedemo.com/");
        Thread.sleep(1000);
        driver.findElement(By.id("user-name")).click();

       System.out.println("clicked on user name");
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[1]/input")).click();
        System.out.println("clicked on user name2");
        driver.findElement(By.xpath("//input[@id='user-name']")).click();
        System.out.println("clicked on user name3");
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

        //input[@id='user-name']*/


        // driver.close();




       /* driver.get("https://demo.automationtesting.in/Frames.html");
        Thread.sleep(2000);

        driver.switchTo().frame("SingleFrame");

        String text = driver.findElement(By.tagName("H5")).getText();
        System.out.println("The text is : "+ text);

        List<WebElement> ele=driver.findElements(By.xpath("//input[@type='text']"));
        ele.get(0).sendKeys("rajender");

        driver.switchTo().parentFrame();

        driver.switchTo().defaultContent();

        driver.findElement(By.xpath("(//a[@class=\"analystic\"])[2]")).click();
        Thread.sleep(2000);*/

        /*driver.get("https://demo.automationtesting.in/Windows.html");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@href=\"http://www.selenium.dev\"]")).click();
        Set<String> wins = driver.getWindowHandles();
        System.out.println("Windows handles size is: "+wins.size());  //2
        String parentHandle = driver.getWindowHandle();
        System.out.println("parentHandle window handle name is: "+parentHandle);
       for(String a :wins){
           System.out.println("1st window handle name is: "+a);
           if(!a.equalsIgnoreCase(parentHandle)) {
               driver.switchTo().window(a);
               Thread.sleep(2000);
               driver.findElement(By.xpath("//a[@href=\"/downloads\"]")).click();
        Thread.sleep(2000);
               driver.close();
           }else{
               System.out.println("parent window handle is matched hence not going to switch");
           }
       }
        driver.switchTo().window(parentHandle);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@href=\"http://www.selenium.dev\"]")).click();*/


       /* driver.get("https://demo.automationtesting.in/Alerts.html");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@href=\"#Textbox\"]")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@class=\"btn btn-info\"]")).click();
        Thread.sleep(2000);
        driver.switchTo().alert();
        String alertText = driver.switchTo().alert().getText();
        System.out.println("alertText is "+alertText);
        Thread.sleep(2000);
        driver.switchTo().alert().sendKeys("Rajender");
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@class=\"btn btn-info\"]")).click();
        Thread.sleep(2000);
        driver.switchTo().alert();
        String alertText2 = driver.switchTo().alert().getText();
        System.out.println("alertText is "+alertText2);
        Thread.sleep(2000);
        driver.switchTo().alert().sendKeys("Sravan");
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        Thread.sleep(2000);*/





        /*Dimension dim = new Dimension(400,300);
        driver.manage().window().setSize(dim);

        Thread.sleep(2000);
      //  driver.manage().window().getPosition().getX();
     //   driver.manage().window().getPosition().getY();

        Point p = new Point(400,300);

        driver.manage().window().setPosition(p);

        Thread.sleep(2000);


        List<WebElement> ele = driver.findElements(By.xpath(""));
        for(int i=0;i<=ele.size();i++){
            ele.get(i).click();
        }


        //tagName[@attribute='value']
        //button[@class="btn btn-info"]

        https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html

        //table[@id='customers']/tbody/tr[1]/th[3]

       // table-->tbody-->tr-->td/th
        int columnNumber=0;

        List<WebElement> ele2 = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th"));
        for(int i=0;i<=ele2.size();i++){
            if(ele2.get(i).getText().equalsIgnoreCase("Country")){
                columnNumber=i;
                break;
            }
        }

                int rowNum=4;
       /* String country = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+rowNum+"]/th["+columnNumber+"]")).getText();*/

        /*driver.navigate().to("https://www.tutorialspoint.com/selenium/practice/webtables.php");
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);


        File s = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File dest = new File(path + "\\src\\test\\resources\\com.project\\application\\dataUtils\\empPhoto2.png");
        FileUtils.copyFile(s,dest);

        System.out.println("Screenshot take and kept at : "+dest);

        driver.get("https://practice.expandtesting.com/dropdown");
        Thread.sleep(3000);
        Thread.sleep(3000);

        WebElement simDropDown = driver.findElement(By.id("dropdown"));
        Select sel = new Select(simDropDown);

        sel.selectByVisibleText("Option 2");
        Thread.sleep(3000);
        sel.selectByIndex(0);
        Thread.sleep(3000);
        sel.selectByValue("1");
        Thread.sleep(3000);

         Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL).click(sel.getOptions().get(2)).click(sel.getOptions().get(3)).keyUp(Keys.CONTROL).build().perform();


        */

        //AutoCompleted

       /* driver.get("https://www.google.com/");
        Thread.sleep(3000);
       // driver.findElement(By.id("APjFqb")).sendKeys("Testing");
        Actions actions = new Actions(driver);
        for (int i = 1; i <= 4; i++) {
            actions.sendKeys(Keys.DOWN).build().perform();
            Thread.sleep(1000);
        }
        actions.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(5000);*/

        //right click
        // actions.contextClick();
        //  Thread.sleep(3000);

       /* driver.get("https://www.saucedemo.com/");
        Thread.sleep(3000);
        Actions actions = new Actions(driver);*/
        //   actions.contextClick(driver.findElement(By.xpath("//a[@class=\"btn btn-sut d-lg-inline-block my-2 my-md-0 ms-md-3\"]"))).build().perform();
        //  Thread.sleep(3000);
        //   actions.contextClick().build().perform();

        // actions.doubleClick(driver.findElement(By.xpath("//h2[contains(text(),'Select your date of birth')]"))).build().perform();
        // Thread.sleep(3000);

       /* WebElement userName = driver.findElement(By.id("user-name"));
        actions.moveToElement(driver.findElement(By.id("login-button"))).build().perform();
        Thread.sleep(3000);
        userName.click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(1000);
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(3000);*/

        // https://demo.automationtesting.in/Static.html --> test for drag and drop

        /*driver.get("https://demo.automationtesting.in/Static.html");
        Thread.sleep(3000);
        Actions actions = new Actions(driver);
        WebElement source = driver.findElement(By.id("angular"));

        WebElement dest = driver.findElement(By.id("droparea"));

        actions.dragAndDrop(source,dest).build().perform();
        Thread.sleep(3000);

         Actions actions = new Actions(driver);
         actions.clickAndHold();
        actions.release();
        */


        /*driver.get("https://www.saucedemo.com/");

       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement userName = driver.findElement(By.id("user-name"));
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();


        WebDriverWait wait = new WebDriverWait(driver,30);

        wait.until(ExpectedConditions.elementToBeClickable((By.xpath("(//button[@class=\"btn btn_primary btn_small btn_inventory \"])[1]"))));


        WebElement addToCart1 = driver.findElement(By.xpath("(//button[@class=\"btn btn_primary btn_small btn_inventory \"])[1]"));
        addToCart1.click();*/

       /* if(addToCart1.isDisplayed()){
            addToCart1.click();
        }*/

        // addToCart1.click();


        //  Thread.sleep(3000);


        //   JavascriptExecutor js = (JavascriptExecutor) driver;

       /* js.executeScript("arguments[0].click();", loginButton);
        Thread.sleep(3000);*/
       /* js.executeScript("document.getElementById('login-button').click()");
        Thread.sleep(3000);*/

       /* document.getElementByName('login-button')[0].click()
        document.getElementByClassName('login-button').click()
        document.getElementByTagName('login-button').click()*/

        //   WebElement item5th = driver.findElement(By.id("item_5_title_link"));
        //scroll till given weeb element
        //  js.executeScript("arguments[0].scrollIntoView()", item5th);
        //   js.executeScript("document.getElementById('item_5_title_link').scrollIntoView()");
        //  Thread.sleep(3000);


        //scroll total down or up

        /*js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Thread.sleep(3000);

        js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
        Thread.sleep(3000);*/

        //history clear with javscript

       /* int cookiesSize = driver.manage().getCookies().size();


        System.out.println("the coockies count before clear is  : "+cookiesSize);*/

        /*js.executeScript("history.clear();");

       int cookiesSize1 = driver.manage().getCookies().size();

        System.out.println("the coockies count after clear is  : "+cookiesSize1);*/

       /* driver.manage().deleteAllCookies();
        System.out.println("the coockies count after clear is  : "+driver.manage().getCookies().size());*/

        driver.get("https://www.fileconvoy.com/");
        Thread.sleep(5000);

        WebElement fileUpload = driver.findElement(By.id("upfile_0"));
        fileUpload.click();
       /* JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", fileUpload);*/

        String path1 = "D:\new 1.txt";

        Robot rbt = new Robot();

        StringSelection x = new StringSelection(path1);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(x, null);


        rbt.keyPress(KeyEvent.VK_CONTROL);
        rbt.keyPress(KeyEvent.VK_V);

        rbt.keyRelease(KeyEvent.VK_V);
        rbt.keyRelease(KeyEvent.VK_CONTROL);


        Thread.sleep(3000);

        driver.quit();
        System.out.println("quit in the browser");


    }

}
