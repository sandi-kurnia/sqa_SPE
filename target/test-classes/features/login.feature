@Login-Feature
Feature: Functional Login Testing

  Background:
    Given User go to "https://admin-tap.spesandbox.com/"

@TC_001(Positive)
  Scenario:User Login With Valid Username And Valid Password
      When User in login page
        And User click username field
        And User input valid username
        And User click password field
        And User input valid password
        And User click login button
          Then User success to login

@TC_002(Negative)
  Scenario:User Login With InValid Username And Valid Password
    When User in login page
      And User click username field
        And User input invalid username
        And User click password field
        And User input valid password
        And User click login button
          Then User get notification Incorrect Username and Password

@TC_003(Negative)
  Scenario:User Login With Valid Username And Invalid Password
    When User in login page
      And User click username field
      And User input valid username
      And User click password field
      And User input invalid password
      And User click login button
        Then User get notification Incorrect Username and Password

@TC_004(Negative)
  Scenario:User Login With Invalid Username And Invalid Password
    When User in login page
      And User click username field
      And User input invalid username
      And User click password field
      And User input invalid password
      And User click login button
        Then User get notification Incorrect Username and Password

@TC_005(Negative)
  Scenario:User Login With Blank Username And Valid Password
    When User in login page
      And User click username field
      And User input blank username
      And User click password field
      And User input valid password
      And User click login button
        Then User get notification Username Cannot Be Blank

@TC_006(Negative)
  Scenario:User Login With Valid Username And Blank Password
    When User in login page
      And User click username field
      And User input blank username
      And User click password field
      And User input blank password
      And User click login button
        Then User get notification Password Cannot Be Blank

@TC_007(Negative)
  Scenario:User Login With Invalid Username And Blank Password
    When User in login page
      And User click username field
      And User input invalid username
      And User click password field
      And User input blank password
      And User click login button
        Then User get notification Password Cannot Be Blank

@TC_008(Negative)
  Scenario:User Login With Blank Username And Invalid Password
    When User in login page
      And User click username field
      And User input blank username
      And User click password field
      And User input invalid password
      And User click login button
        Then User get notification Username Cannot Be Blank

@TC_009(Negative)
  Scenario:User Login With Blank Username And Blank Password
    When User in login page
      And User click username field
      And User input blank username
      And User click password field
      And User input blank password
      And User click login button
        Then User get notification Username & Password Cannot Be Blank
