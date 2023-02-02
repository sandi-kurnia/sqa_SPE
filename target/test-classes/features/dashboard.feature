@Dashboard-Feature
Feature: Functional Dashboard Testing

  Background:
    Given User already to login at "https://admin-tap.spesandbox.com/"


  @TC_001(Positive)
  Scenario:User Download The 2020 Chart Line With PNG Type Format On The Dashboard Menu
      When User click dashboardboard menu button
        And User click chart with line
        And User click dropdown of year chart button
        And User click 2020 years of chart transaction
        And User click dropdown download chart button
        And User click png format type button
          Then User success to download 2020 chart line png format file

  @TC_002(Positive)
  Scenario: User Download The 2020 Chart Line With JPEG Type Format On The Dashboard Menu
    When User click dashboardboard menu button
      And User click chart with line
      And User click dropdown of year chart button
      And User click 2020 years of chart transaction
      And User click dropdown download chart button
      And User click jpeg format type button
        Then User success to download 2020 chart line jpeg format file


  @TC_003(Positive)
  Scenario: User Download The 2020 ChartBar With PNG Type Format On The Dashboard Menu
    When User click dashboardboard menu button
      And User click chart with bar
      And User click dropdown of year chart button
      And User click 2020 years of chart transaction
      And User click dropdown download chart button
      And User click png format type button
        Then User success to download chart bar png format file

  @TC_004(Positive)
  Scenario: User Download The 2020 ChartBar With JPG Type Format On The Dashboard Menu
    When User click dashboardboard menu button
      And User click chart with bar
      And User click dropdown of year chart button
      And User click 2020 years of chart transaction
      And User click dropdown download chart button
      And User click jpeg format type button
        Then User success to download chart bar jpeg format file

  @TC_005(Positive)
  Scenario: User Set Top 5 Channel Transaction By Set Valid Start Date And Valid End Date On The Dashboard Menu
    When User click dashboardboard menu button
      And User click start date button
      And User pick valid start date
      And User click end date
      And User pick valid end date
        Then Data is showing

  @TC_006(Negative)
  Scenario: User Set Top 5 Channel Transaction By Set Start Date Exceeds End Date
    When User click dashboardboard menu button
      And User click start date button
      And User pick invalid start date
      And User click end date
      And User pick valid end date
        Then showing alert pop up window "Tanggal Awal tidak boleh melebihi dari tanggal akhir"


