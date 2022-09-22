Feature:  Login practice

  Background:   Given user go to the login page
  @wip
  Scenario: positive login test

    When  user enter  correct credentials
    And user click the login button
    Then users should be in "Login Page"
    And user should be see success massage

