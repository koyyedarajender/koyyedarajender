package com.project.application.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import com.project.application.base.BasePage;
import com.project.application.utills.Repeater;

/**
 * Created by rajender.koyyeda on 06-10-2023 .
 */
public class LoginPage extends BasePage {

  @FindBy(id = "user-name")
  private WebElement email_text_field;
  @FindBy(id = "password")
  private WebElement password_text_field;
  @FindBy(id = "login-button")
  private WebElement login_button;




  public void login(String user, String pwd) throws InterruptedException {
    openBrowser();
    refreshPage();
    fill_email_field(user);
    fill_password_field(pwd);
    clickOnLoginButton();
    getBrowser().manage().window().maximize();
    Repeater.sleep(2000);
  }

  public void fill_email_field(String user) {
    waitForElementToBeClickable(email_text_field);
    email_text_field.clear();
    email_text_field.click();
    if (user == null) {
      log().info("Not passing the user value, as it is NULL");
    } else {
      email_text_field.sendKeys(user);
    }

    log().info("username passed");
  }

  public void fill_password_field(String pwd) {
    waitForElementToBeClickable(password_text_field);
    password_text_field.clear();
    password_text_field.click();
    if (pwd == null) {
      log().info("Not passing the pwd value, as it is NULL");
    } else {
      password_text_field.sendKeys(pwd);
    }
    email_text_field.click();
    log().info("password passed");
  }

  public void clickOnLoginButton() {
    waitForElementToBeClickable(login_button);
    login_button.click();
    log().info("login button clicked");
  }

}
