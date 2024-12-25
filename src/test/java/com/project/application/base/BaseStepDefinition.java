package com.project.application.base;



import static com.project.application.utills.ConfigFile.EmployeeFirstName;
import static com.project.application.utills.ConfigFile.HomepageTemplateIDValue;
import static com.project.application.utills.ConfigFile.customLibraryTitleValue;
import static com.project.application.utills.ConfigFile.fieldCategoryName;
import static com.project.application.utills.ConfigFile.fieldCategoryNameFilePath;
import static com.project.application.utills.ConfigFile.fieldID;
import static com.project.application.utills.ConfigFile.fieldName;
import static com.project.application.utills.ConfigFile.formTemplateCategoryName;
import static com.project.application.utills.ConfigFile.formTemplateCategoryNameFilePath;
import static com.project.application.utills.ConfigFile.formTemplateID;
import static com.project.application.utills.ConfigFile.formTemplateTitleName;
import static com.project.application.utills.ConfigFile.groupTitleValue;
import static com.project.application.utills.ConfigFile.headingValue;
import static com.project.application.utills.ConfigFile.hotspotLibraryTitleValue;
import static com.project.application.utills.ConfigFile.imageLibraryTitleValue;
import static com.project.application.utills.ConfigFile.keywordName;
import static com.project.application.utills.ConfigFile.keywordTypeValue;
import static com.project.application.utills.ConfigFile.librarySettingsTitleValue;
import static com.project.application.utills.ConfigFile.lookUpTableName;
import static com.project.application.utills.ConfigFile.sectionCategoryName;
import static com.project.application.utills.ConfigFile.sectionCategoryNameFilePath;
import static com.project.application.utills.ConfigFile.sectionID;
import static com.project.application.utills.ConfigFile.sectionTitleName;
import static com.project.application.utills.ConfigFile.viewID;
import static com.project.application.utills.ConfigFile.viewTitleName;
import java.awt.AWTException;
import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.project.application.utills.Repeater;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class BaseStepDefinition extends BasePage {



   @And("close the browser")
  public void closeTheBrowser() {
    closeBrowser();
    log().info("Closed the browser");
  }

  @And("wait for some time")
  public void waitForSomeTime() {
    Repeater.sleep(9000);
  }

  @And("scroll total down")
  public void scrollTotalDown() {
    scrollTotalDown();
  }

  @And("refresh the page")
  public void refreshThePage() throws InterruptedException {
    refreshPage();
  }


  @And("perform the escape")
  public void performTheEscape() {
    performESCP();
  }
  @And("wait for some more time")
  public void waitForSomeMoreTime() {
    Repeater.sleep(120000);
  }
}

