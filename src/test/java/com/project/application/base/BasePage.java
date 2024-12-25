package com.project.application.base;

import static com.project.application.utills.ConfigFile.applicationUrl;
import static com.project.application.utills.ConfigFile.instanceName;
import static com.project.application.utills.ConfigFile.projectDirectory;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.IOUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import com.project.application.utills.Browser;
import com.project.application.utills.LoggerClass;
import com.project.application.utills.Repeater;
import com.project.application.utills.ThrowException;
import io.cucumber.java.Scenario;


/**
 * Created by rajender.koyyeda on 06-10-2023.
 */
public class BasePage extends Browser implements LoggerClass {



  public BasePage() {
    PageFactory.initElements(new AjaxElementLocatorFactory(getBrowser(), 20), this);
  }



  public static void moveToElement(WebElement element) {
    Actions actions = new Actions(getBrowser());
    actions.moveToElement(element);
    Repeater.sleep(1000);
  }


  public static void switchToDefaultContent() {
    getBrowser().switchTo().defaultContent();
  }


  public static void takeScreenshot(Scenario scenario) {
    try {
      TakesScreenshot takesScreenshot = (TakesScreenshot) getBrowser();
      final byte[] screenshot = takesScreenshot.getScreenshotAs(OutputType.BYTES);
      scenario.attach(screenshot, "image/png", scenario.getName());
    } catch (Exception e) {
      throw new ThrowException("take screenshot failed", e);
    }
  }

  public static Boolean checkElementIsInvisible(By locator) {
    try {
      getBrowser().findElement(locator).isDisplayed();
      return false;
    } catch (NoSuchElementException e) {
      return true;
    }
  }

  public static void waitForElementToBeVisible(By locator) {
    getWebDriverWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
  }

  public static void waitImplicitly() {
    getBrowser().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
  }

  public static void waitForElementToBeVisible(WebElement element) {
    getWebDriverWait().until(ExpectedConditions.visibilityOf(element));
  }

  public static void openBrowser() {
    delete_all_cookies();
    getBrowser().get(applicationUrl);
    System.out.println("Browser size is: " + getBrowser().manage().window().getSize());
  }

  public static void delete_all_cookies() {
    getBrowser().manage().deleteAllCookies();
  }



  public void dragAndDrop(WebElement fromEle, WebElement toEle) {
    Actions act = new Actions(getBrowser());
    act.dragAndDrop(fromEle, toEle).build().perform();
    System.out.println("drag and dropped the element successfully");
    Repeater.sleep(2000);
  }



  public void scrollTo(WebElement element) {
    getJsExecutor().executeScript("arguments[0].scrollIntoView(true);", element);
    log().info("Scrolled till element");
  }

  public void clickThroughJavaScript(WebElement element) {

    getJsExecutor().executeScript("arguments[0].click();", element);
    log().info("clicked on element : " + element.getText());

  }

  public String getCurrentDate(String format) {
    Calendar calendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
    DateFormat formatter = new SimpleDateFormat(format);
    formatter.setTimeZone(TimeZone.getTimeZone("UTC"));
    String t1 = formatter.format(calendar.getTime());
    Calendar calendar1 = new GregorianCalendar(TimeZone.getTimeZone("IST"));
    formatter.setTimeZone(TimeZone.getTimeZone("IST"));
    String t2 = formatter.format(calendar1.getTime());
    log().info(" UTC time with format " + t1);
    log().info("Retrieving IST date is : " + t2);
    return (t2);
  }

  public String getDateAfter(int days, String format) {
    LocalDateTime today = LocalDateTime.now();
    log().info("Provided date is : " + today.plusDays(days).format(DateTimeFormatter.ofPattern(format)));
    return (today.plusDays(days).format(DateTimeFormatter.ofPattern(format)));

  }

  public String getDateAfter(int days, String formatInput, String dateInput) throws ParseException {
    final SimpleDateFormat format = new SimpleDateFormat(formatInput);
    final Date date = format.parse(dateInput);
    final Calendar calendar = Calendar.getInstance();
    calendar.setTime(date);
    calendar.add(Calendar.DAY_OF_YEAR, days);
    log().info(" The after date is finally - " + days + " days of- " + dateInput + " is : " + format.format(calendar.getTime()));
    return format.format(calendar.getTime());

  }

  public String generateRandomNumberSize(int num) {
    Date date = new Date();
    Timestamp ts = new Timestamp(date.getTime());
    SimpleDateFormat formatter1 = null;
    switch (num) {
      case 4:
        formatter1 = new SimpleDateFormat("mmss");
        return (formatter1.format(ts));
      case 6:
        formatter1 = new SimpleDateFormat("HHmmss");
        return (formatter1.format(ts));
      case 10:
        formatter1 = new SimpleDateFormat("MMddHHmmss");
        return (formatter1.format(ts));

      default:
        log().info("no size mentioned for random number");
    }

    return (formatter1.format(ts));
  }

  public void scrollTotalUp() {
    getJsExecutor().executeScript("window.scrollBy(0,-250)");
    log().info("Scrolled till up");
  }

  public void scrollTotalDown() {
    Actions actions = new Actions(getBrowser());
    getJsExecutor().executeScript("window.scrollTo(0, document.body.scrollHeight)");
    log().info("Scrolled till down");
  }


  public void waitForElementToBeClickable(WebElement element) {
    getWebDriverWait().ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(element));
    log().info("waited for element clickable : " + element.getText());
  }

  public void waitForElementToBeClickable(By locator) {
    getWebDriverWait().ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
    log().info("waited for element clickable : " + locator);
  }


  public void waitForElementToBeAvailable(WebElement element) {
    if (!element.isEnabled()) {
      getWebDriverWait().until(ExpectedConditions.visibilityOf(element));
    }
    log().info("waited for element availability : " + element.getText());
  }

  public void navigateToUrl(String url) {
    getBrowser().navigate().to(url);
  }

  public void refreshPage() throws InterruptedException {
    getBrowser().navigate().refresh();
    Repeater.sleep(9000);
  }


  public void performESCP() {
    Actions action = new Actions(getBrowser());
    action.sendKeys(Keys.ESCAPE).build().perform();
    Repeater.sleep(1000);
    log().info("ESCP performed to close filter popup");
  }


  public String get_current_page_url() {
    return getBrowser().getCurrentUrl();
  }

  public void acceptAlert() throws AWTException, InterruptedException {
    getBrowser().switchTo().alert().accept();
    Repeater.sleep(1000);
    log().info("alert accepted");
  }


  public void writeDataIntoFile(String data, String path) throws FileNotFoundException, UnsupportedEncodingException {
    PrintWriter writer = new PrintWriter(path, "UTF-8");
    writer.print(data);
    writer.close();
    log().info("written the data as :" + data + " into file");
  }

  public String readDataFromFile(String path) {
    String everything = null;
    try {
      FileInputStream inputStream = new FileInputStream(path);
      everything = IOUtils.toString(inputStream);
      log().info("Read the data from file is  :" + everything + " from file");
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      return everything;
    }
  }

  public void switchToWindowIndex(int index) {
    Repeater.sleep(1000);
    Set<String> windows = getBrowser().getWindowHandles();
    int totalWin = windows.size();
    log().info("total Windows are: " + totalWin);
    String winTitle = windows.toArray()[index].toString();
    log().info("Going to switch Window is : " + winTitle);
    getBrowser().switchTo().window(winTitle);
    Repeater.sleep(1000);
    log().info("Switched to " + getBrowser().getTitle());
  }

  public void closeOtherWindows() {
    String parent = getBrowser().getWindowHandle();
    Set<String> s = getBrowser().getWindowHandles();
    // Now iterate using Iterator
    Iterator<String> I1 = s.iterator();
    while (I1.hasNext()) {
      String child_window = I1.next();
      if (!parent.equals(child_window)) {
        getBrowser().switchTo().window(child_window);
        System.out.println(getBrowser().switchTo().window(child_window).getTitle());
        getBrowser().close();
      }
    }
    //switch to the parent window
    getBrowser().switchTo().window(parent);
  }

  public void selectValueFromDropDown(WebElement e1, String value) {
    Repeater.sleep(2000);
    waitForElementToBeClickable(e1);
    e1.click();
    Repeater.sleep(2000);
    if (value.equalsIgnoreCase("Any")) {
      Repeater.sleep(1000);
      List<WebElement> options = getBrowser().findElements(By.xpath("//label[@for='ui-multiselect-Category-option-0']"));
      options.get(0).click();
    } else {
      List<WebElement> valueSize = getBrowser().findElements(By.xpath("//span[contains(text(),'" + value + "')]"));
      for (int i = 0; i < valueSize.size(); i++) {
        if (valueSize.get(i).getText().trim().equalsIgnoreCase(value)) {
          valueSize.get(i).click();
          break;
        }
      }

      Repeater.sleep(1000);
      log().info("The value from Dropdown is available : " + value);
    }
    log().info("Dropdown value selected as " + value);
  }

  public void selectValueFromDropDownOfSelectOptions(WebElement e1, List<WebElement> e2, String value) {
    waitForElementToBeClickable(e1);
    e1.click();
    Repeater.sleep(1000);
    if (value.equalsIgnoreCase("Any")) {
      if (e2.size() > 0) {
        for (int j = 0; j < e2.size(); j++) {
          if (!e2.get(j).getText().isEmpty()) {
            e2.get(j).click();
            break;
          } else {
            log().info("empty value shown in the dropdown");
          }
        }
      } else {
        log().info("No values to select in the dropdown");
      }
    } else {
      List<WebElement> valueSize = getBrowser().findElements(By.xpath("//*[contains(text(),'" + value + "')]"));
      for (int i = 0; i < valueSize.size(); i++) {
        if (valueSize.get(i).getText().trim().equalsIgnoreCase(value)) {
          valueSize.get(i).click();
          break;
        }
      }
      Repeater.sleep(1000);
      log().info("The value from Dropdown is available : " + value);
    }
    performESCP();
    log().info("Dropdown value selected as " + value);
    Repeater.sleep(2000);
  }

  public void checkElementIsVisible(WebElement e1) {
    try {
      e1.isDisplayed();
      log().info("Element is visible");
    } catch (NoSuchElementException e) {
      log().error("Element is not visible");
    }
  }

  public void checkElementNotVisible(WebElement e1) {
    try {
      e1.isDisplayed();
      log().error("Element is visible");
    } catch (NoSuchElementException e) {
      log().info("Element is not visible");
    }
  }


  public void openCreatedRecords(String value) {
    Repeater.sleep(2000);
    WebElement createdRecord = getBrowser().findElement(By.xpath("//*[contains(text(),'" + value + "')]"));
    actionScroll(createdRecord);
    Repeater.sleep(3000);
    createdRecord.click();
    Repeater.sleep(3000);
  }

  public void actionScroll(WebElement element) {
    Actions a = new Actions(getBrowser());
    a.moveToElement(element).build().perform();
  }



  public void assertRecordDeleted(String category, String value, String valueID) {
    if (category != null) {
      List<WebElement> categoryRecord = getBrowser().findElements(By.xpath("//*[@title='Category']"));
      for (int i = 0; i < categoryRecord.size(); i++) {
        if (categoryRecord.get(i).getText().trim().equalsIgnoreCase(value)) {
          Assert.assertFalse(categoryRecord.get(i).getText().trim().equalsIgnoreCase(value));
        }
      }
    } else {
      List<WebElement> resultedRecord = getBrowser().findElements(By.xpath("//a[@target='_blank']"));
      for (int i = 0; i < resultedRecord.size(); i++) {
        if (resultedRecord.get(i).getText().trim().equalsIgnoreCase(value)) {
          System.out.println("The Value as " + value + " found at " + i);
          Assert.assertFalse(resultedRecord.get(i).getText().trim().equalsIgnoreCase(value));
        }
        if (resultedRecord.get(i).getText().trim().equalsIgnoreCase(valueID)) {
          System.out.println("The valueID as " + valueID + " found at " + i);
          Assert.assertFalse(resultedRecord.get(i).getText().trim().equalsIgnoreCase(valueID));
        }
      }
    }

  }

  public void verifyAndAcceptMessage(String message) {
    Repeater.sleep(1000);
    try {
      String actualMessage = getBrowser().switchTo().alert().getText().trim();
      Assert.assertTrue(actualMessage.contains(message));
      Repeater.sleep(1000);
      getBrowser().switchTo().alert().accept();
      Repeater.sleep(1000);
      log().info("Message verified and alert accepted. Actual: " + actualMessage + " Expected: " + message);
    } catch (NoAlertPresentException e) {
      e.printStackTrace();
    }
  }

  public void performENTER() {
    Actions action = new Actions(getBrowser());
    action.sendKeys(Keys.ENTER).build().perform();
    Repeater.sleep(1000);
    log().info("ENTER performed ");
  }

  public void performTAB() {
    Actions action = new Actions(getBrowser());
    action.sendKeys(Keys.TAB).build().perform();
    Repeater.sleep(1000);
    log().info("TAB performed to close filter popup");
  }

  public void copyValue(String value) {
    StringSelection stringSelection = new StringSelection(value);
    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    clipboard.setContents(stringSelection, null);
  }

  public void pasteValue() throws AWTException, InterruptedException {
    Robot robot = new Robot();
    robot.keyPress(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_V);
    robot.keyRelease(KeyEvent.VK_V);
    robot.keyRelease(KeyEvent.VK_CONTROL);
    Repeater.sleep(1000);
  }

  public void uploadFile(String fileName) throws InterruptedException, AWTException {
    String filePath = "";
    switch (fileName.trim()) {
      case "lookUpTable":
        filePath = projectDirectory + "\\src\\test\\resources\\com.integrum\\application\\dataUtils\\LookupTableData.csv";
        log().info("The filePath for lookUpTable is " + filePath);
        break;
      case "formTemplateSection":
        filePath = projectDirectory + "\\src\\test\\resources\\com.integrum\\application\\dataUtils\\formTemplateSection.csv";
        log().info("The filePath for formTemplateSection is " + filePath);
        break;
      case "empPhoto":
        filePath = projectDirectory + "\\src\\test\\resources\\com.integrum\\application\\dataUtils\\empPhoto.png";
        log().info("The filePath for lookUpTable is " + filePath);
        break;
      default:
        log().info("Provided invalid selection");
        break;
    }
    copyValue(filePath);
    log().info("copy happened");
    pasteValue();
    log().info("paste happened");
    Robot robot = new Robot();
    robot.keyPress(KeyEvent.VK_ENTER);
    robot.keyRelease(KeyEvent.VK_ENTER);
    log().info("Clicked ENTER");
    Repeater.sleep(2000);
  }

}
