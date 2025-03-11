Feature: Messaging functionality

  @LogIn
  Scenario: LogIn using Credentials
    Given User is on HomePage to LogIn
    When User LogIn with valid Credentials
    Then  User is should be on Dashboard

  @Messages
  Scenario:Send Messages
    Given User is on Messaging Page
    And User is able to send Messages

