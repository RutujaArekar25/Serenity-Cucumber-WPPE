Feature: Concurrent Request functionality

  @LogIn
  Scenario: LogIn using Credentials
    Given User is on HomePage to LogIn
    When User LogIn with valid Credentials
    Then  User is should be on Dashboard

  @ConcurrentRequest
  Scenario: The user is able to send Concurrent Request
    Given User is on Concurrent Request Page
    And User is able to send Concurrent Request