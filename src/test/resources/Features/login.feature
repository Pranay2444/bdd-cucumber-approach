#Author
#Date
#Description
@SmokeScenario
Feature: feature to test login functionality

  @smoketest
  Scenario: Check login is successful with valid credentials
    Given user is on login page
    When user enters username and passwords
    And clicks on the login button
    Then user is navigated to home page
