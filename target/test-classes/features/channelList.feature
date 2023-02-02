@Channel_List-Feature
Feature: Functional Channel list Testing

  Background:
    Given User already to login at url spesandbox.com

  @TC_001(Positive)
  Scenario:User Download Channel List PDF Report By Input Registered Email
    When User click channel list menu
      And User click channel dropdown button
      And User select channel name
      And User click email channel list field
      And User input registered email
      And User click download report button
      And User select pdf type format
        Then User success to download pdf report channel list

  @TC_002(Positive)
  Scenario:User Add Channel List By Fill All Required Text Field
    When User click channel list menu
      And User click add channel button
      And User fill all the required text field
      And User click save button
        Then User successfully to add new channel

  @TC_003(Negative)
  Scenario:User Add Channel List By Unfilled All Required Text Field
    When User click channel list menu
      And User click add channel button
      And User fills in all text fields except the required text fields
      And User click save button
        Then User get a message that the * field is required