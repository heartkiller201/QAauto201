@smokeTest
Feature: Login to Allegro
  I want to login to Allegro site

  Background:
    Given User is on Allegro home page "https://allegro.pl/"

  @ValidCredentials
  Scenario: Login with valid credentials
    When User enters email "bawit85622@botsoko.com" and password "1Qazwsxedc"
    Then User is taken to home page and should be able to login successfully with "bawit85622@botsoko.com"

  @InvalidCredentials
  Scenario Outline: Login with invalid credentials
    When User enters email "<email>" and password "<password>"
    Then User should be able to see error message "<errorMessage>"

    Examples:
      | email                  | password   | errorMessage                      |
      | bawit85622@botsoko.com | 1Qasdfedc  | Invalid login, email, or password |
      | bawiweew22@botsoko.com | 1Qazwsxedc | Invalid login, email, or password |


  @MissingEmail
  Scenario: Login with blank email
    When User enters email "" and password "1Qazwsxedc"
    Then User should be able to see error message "Enter login or email" under the blank field
