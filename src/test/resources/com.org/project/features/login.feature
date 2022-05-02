#Author:
# Description:
  #Jira ID:

@smoke @regression @sanity
Feature: test login

@rajender
Scenario Outline: Verify login success on sauce website
  Given Open the browser
  And launch the website "https://www.saucedemo.com/"
  When login into application with below details
    | username   | password   |
    | <user_name> | <password> |
  Then logout from application
  And close the browser
  Examples:
    | user_name      | password     |
    | standard_user | secret_sauce |



