package com.project.Runner;

import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
    features = {"classpath:com.project/application"},
    glue = {"com.project.application"},
    plugin = {"pretty", "html:target/cucumber-html-report", "json:target/cucumber-reports/cucumber.json",
        "junit:target/cucumber-reports/cucumber.html", "junit:target/cucumber-reports/cucumber.xml"},
    tags = "@test"
)

public class runner extends AbstractTestNGCucumberTests {
  @Override
  @DataProvider(parallel = false)
  public Object[][] scenarios() {
    return super.scenarios();
  }
}
