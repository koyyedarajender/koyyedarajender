package com.project.application.login;

import static com.project.application.utills.ConfigFile.password;
import static com.project.application.utills.ConfigFile.userName;
import java.util.Map;
import com.project.application.base.BasePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class LoginStepDefinitions extends BasePage {

  LoginPage loginPage = new LoginPage();

  @Given("login to application")
  public void loginToApplication() throws InterruptedException {
    log().info("Reached to login process");
    loginPage.login(userName, password);
  }

}
