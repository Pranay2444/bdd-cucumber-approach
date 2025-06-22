Feature: Login feature
  		In order to perform successful login
  		As a user
  		I have to enter correct username & password

  Scenario: Login to the Facebook website as a Valid user
    Given user navigates to the facebook website
    When user validates the homepage title
    Then user enters "valid" username
    And user enters "valid" password
    And user clicks on the signin button

    
    Scenario: Login to the Facebook website as a Invalid user
    Given user navigates to the facebook website
    When user validates the homepage title
    Then user enters "invalid" username
    And user enters "invalid" password
    And user clicks on the signin button
    