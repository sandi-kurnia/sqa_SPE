@ForgotPassword-Feature
  Feature: Functional Forgot Password Testing

  Background:
    Given User go to "https://admin-tap.spesandbox.com/"

@TC_001(Negative)
  Scenario:User Forgot Password With Input Unregistered Email
    When User click forgot password button
      And User click email field
      And User input unregistered email
      And User click send button
        Then User get notification No User With This Email Address Or This User Is Inactive

@TC_002(Negative)
  Scenario:User Forgot Password With Input Blank Email
    When User click forgot password button
      And User click email field
      And User input blank email
      And User click send button
        Then User get notification Email Cannot Be Blank

