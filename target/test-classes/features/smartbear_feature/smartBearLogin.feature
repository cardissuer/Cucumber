Feature: Smartbear login feature verifications

  Agile Story: When user is on the login page of SmartBear app user should
  be able to login using correct test data
  A/C:
  1- Only authenticated user should be able to login
  Link: http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
  Authenticated test data:
  Username: Test
  Password: tester
  2- User should see "Welcome, Tester!" displayed when logged in.

  Scenario: User empty password on Smart Bear login page
    When User is on Smart Bear login page
    Then User types Test username into the login box
    And User clicks on login button
    And User should see "Invalid Login or Password" words above the login box

  Scenario: User correct password on Smart Bear login page
    When User is on Smart Bear login page
    Then User types Test username into the login box
    And User enters tester password into the password box
    And User clicks on login button
    And User should see "Welcome, tester!" displayed when loggin' on

  @positiveLogin
  Scenario: As a user I should be able to login using authenticated test data
    When User is on SmartBear login page
    And User enters correct username
    And User enters correct password
    And User clicks to login button
    Then User should be logged in and be able to verify Welcome text is displayed

  @negativeLogin
  Scenario: When user enters correct username and incorrect password user should see error message
    When User is on SmartBear login page
    And User enters correct username
    And User enters incorrect password
    And User clicks to login button
    Then User should see the error message displayed on the page

#  @smartBearOrderProcess
#  Given User is logged into SmartBear Tester account and on Order page
#  When User fills out the form as followed from the table below:
#  Then User selects “product”from product dropdown
#  And User enters “quantity”to quantity
#  And User enters “customername”to customer name
#  And User enters “street”to street
#  And User enters “city”to city
#  And User enters “state”to state
#  And User enters “zip”to zip
#  And User selects “cardType”as card type
#  And User enters “card number”to card number
#  And User enters “expiration date”to expiration date
#  And User clicks process button
#  And ser verifies “customer name” is in the list