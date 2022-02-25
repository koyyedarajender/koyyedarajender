package com.org.project.base;

import com.org.project.sauceHome.sauceHomePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Map;
import java.util.Scanner;

import static com.org.project.sauceHome.sauceHomePage.price;
import static com.org.project.sauceHome.sauceHomePage.productName;

public class baseStepDefinition {

    WebDriver driver;
    basePage basePage = new basePage(driver);
    sauceHomePage sauceHomePage;

    @Given("Open the browser")
    public void open_the_browser() {

        String path = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", path + "\\src\\test\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        // basePage.start();
    }

    @Given("launch the website {string}")
    public void launch_the_website(String url) throws InterruptedException {
        //  basePage.launchWebSite(string);
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    /*@And("login into application with below details")
    public void loginIntoApplicationWithBelowDetails(DataTable testData) {
        Map<String, String> data = testData.asMap(String.class, String.class);
        saucePage =new saucePage(driver);
        saucePage.enterUser(data.get("username"));
        saucePage.enterPassword(data.get("password"));
        saucePage.clickLogin();
    }*/


    /*@And("login into application with below details")
    public void loginIntoApplicationWithBelowDetails(DataTable testData) {
        List<String> details = testData.asList(String.class);
        saucePage =new saucePage(driver);
        saucePage.enterUser(details.get(0));
        saucePage.enterPassword(details.get(1));
        saucePage.clickLogin();
    }*/


    @And("log in with {string} and {string}")
    public void logInWithAnd(String user, String pwd) {
        sauceHomePage = new sauceHomePage(driver);
        sauceHomePage.enterUser(user);
        sauceHomePage.enterPassword(pwd);
        sauceHomePage.clickLogin();
        System.out.println("Login successfully");
    }

    /*@And("login into application with below details")
    public void loginIntoApplicationWithBelowDetails(String user, String pwd) {
        saucePage = new saucePage(driver);
        saucePage.enterUser(user);
        saucePage.enterPassword(pwd);
        saucePage.clickLogin();
        System.out.println("Login successfully");
    }*/

    @And("close the browser")
    public void closeTheBrowser() {
        driver.close();
    }

    @And("logout from application")
    public void logoutFromApplication() throws InterruptedException {
        sauceHomePage = new sauceHomePage(driver);
        sauceHomePage.clickMenu();
        Thread.sleep(2000);
        sauceHomePage.clickLogout();
        System.out.println("Logout successfully");
    }


    @And("verify {string} error message")
    public void verifyErrorMessage(String expectedError) {
        sauceHomePage = new sauceHomePage(driver);
        Assert.assertEquals(expectedError, sauceHomePage.getErrorMessage());

    }


    @And("add item to cart")
    public void addItemToCart() throws InterruptedException {
        sauceHomePage = new sauceHomePage(driver);
        sauceHomePage.clickaddtocart();
        sauceHomePage.getNameOfFirstProduct();
        sauceHomePage.getPriceOfFirstProduct();
        Thread.sleep(3000);
        System.out.println("item added successfully");

    }

    @And("go to cart")
    public void goToCart() throws InterruptedException {
        sauceHomePage = new sauceHomePage(driver);
        sauceHomePage.clickgotocart();
        Thread.sleep(3000);

    }

    @And("verify price {string} on cart")
    public void verifyPriceOnCart(String expectedPrice) throws InterruptedException {
        sauceHomePage = new sauceHomePage(driver);
        Assert.assertEquals(expectedPrice, sauceHomePage.getitemPrice());
        Thread.sleep(2000);
        System.out.println("Item price verified successfully");
    }


    @And("click on checkout")
    public void clickOnCheckout() {
        sauceHomePage = new sauceHomePage(driver);
        sauceHomePage.clickCheckout();

    }

    @And("Pass below data")
    public void passBelowData(DataTable shipDetails) {
        for (Map<String, String> data : shipDetails.asMaps(String.class, String.class)) {
            sauceHomePage = new sauceHomePage(driver);
            sauceHomePage.enterFirstname(data.get("fname"));
            sauceHomePage.enterLastname(data.get("lname"));
            sauceHomePage.enterPostalcode(data.get("zipcode"));
        }


    }

    @And("click on continue")
    public void clickOnContinue() {
        sauceHomePage = new sauceHomePage(driver);
        sauceHomePage.clickcontinue();
    }

    @And("verify details")
    public void verifyDetails() {
        sauceHomePage = new sauceHomePage(driver);
        Assert.assertTrue(sauceHomePage.getPNameAtCheckOut().contains(productName));
        Assert.assertTrue(sauceHomePage.getPriceOfCheckoutPage().contains(price));
    }

    @And("click on finish")
    public void clickOnFinish() {
        sauceHomePage = new sauceHomePage(driver);
        sauceHomePage.clickFinish();
    }

    @And("verify success message {string}")
    public void verifySuccessMessage(String expectedMessage) {
        sauceHomePage = new sauceHomePage(driver);
        Assert.assertEquals(expectedMessage, sauceHomePage.getsuccessMessage());

    }


    @Then("log in with below data")
    public void logInWithBelowData(DataTable usercredentials) throws AWTException {
        for (Map<String, String> data : usercredentials.asMaps(String.class, String.class)) {
            sauceHomePage = new sauceHomePage(driver);
            sauceHomePage.enterUser(data.get("Username"));
            sauceHomePage.enterPassword(data.get("Password"));
            //saucePage.clickLogin();
            Robot r = new Robot();
            r.keyPress(KeyEvent.VK_ENTER);
            r.keyRelease(KeyEvent.VK_ENTER);
            System.out.println("*********Login successfully**************");

        }
    }

    @And("login into application with below details")
    public void loginIntoApplicationWithBelowDetails(DataTable logindetails) {
        for (Map<String, String> data: logindetails.asMaps(String.class, String.class)) {
            sauceHomePage = new sauceHomePage(driver);
            sauceHomePage.enterUser(data.get("username"));
            sauceHomePage.enterPassword(data.get("password"));
            sauceHomePage.clickLogin();

        }
    }

    @And("enter the username using robot class")
    public void enterTheUsernameUsingRobotClass() throws AWTException {
        sauceHomePage = new sauceHomePage(driver);
        Robot r = new Robot();
        sauceHomePage.clickUser();
        r.keyPress(KeyEvent.VK_S);
        r.keyRelease(KeyEvent.VK_S);
        r.keyPress(KeyEvent.VK_T);
        r.keyRelease(KeyEvent.VK_T);
        r.keyPress(KeyEvent.VK_A);
        r.keyRelease(KeyEvent.VK_A);
        r.keyPress(KeyEvent.VK_N);
        r.keyRelease(KeyEvent.VK_N);
        r.keyPress(KeyEvent.VK_D);
        r.keyRelease(KeyEvent.VK_D);
        r.keyPress(KeyEvent.VK_A);
        r.keyRelease(KeyEvent.VK_A);
        r.keyPress(KeyEvent.VK_R);
        r.keyRelease(KeyEvent.VK_R);
        r.keyPress(KeyEvent.VK_D);
        r.keyRelease(KeyEvent.VK_D);
        r.keyPress(KeyEvent.VK_SHIFT);
        r.keyPress(KeyEvent.VK_MINUS);
        r.keyRelease(KeyEvent.VK_MINUS);
        r.keyRelease(KeyEvent.VK_SHIFT);
        r.keyPress(KeyEvent.VK_U);
        r.keyRelease(KeyEvent.VK_U);
        r.keyPress(KeyEvent.VK_S);
        r.keyRelease(KeyEvent.VK_S);
        r.keyPress(KeyEvent.VK_E);
        r.keyRelease(KeyEvent.VK_E);
        r.keyPress(KeyEvent.VK_R);
        r.keyRelease(KeyEvent.VK_R);

    }

    @And("enter the {string} and login into the application")
    public void enterTheAndLoginIntoTheApplication(String pwd) {
        sauceHomePage = new sauceHomePage(driver);
        sauceHomePage.enterPassword(pwd);
        sauceHomePage.clickLogin();
        System.out.println("************Login Successfully************");
    }

    @And("enter the username using scanner class")
    public void enterTheUsernameUsingScannerClass() {
        sauceHomePage = new sauceHomePage(driver);
        System.out.println("enter user name:");
        Scanner sc = new Scanner(System.in);
        String user = sc.nextLine();
        sauceHomePage.enterUser(user);
        System.out.println("username is:"+user);


    }

    @And("Add all products to the cart")
    public void addAllProductsToTheCart() throws InterruptedException {
    sauceHomePage = new sauceHomePage(driver);
    sauceHomePage.clickaddtocart();
    sauceHomePage.clickBikeLight();
    sauceHomePage.clickTShirt();
    sauceHomePage.clickJacket();
    sauceHomePage.clickOneSie();
    sauceHomePage.clickRedTShirt();
    Thread.sleep(2000);
    }
}

