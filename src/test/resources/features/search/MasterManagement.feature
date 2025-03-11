Feature: Master Management Functionality

  @LogIn
  Scenario: LogIn using Credentials
    Given User is on HomePage to LogIn
    When User LogIn with valid Credentials
    Then  User is should be on Dashboard

  @CustomerMaster
  Scenario: Get the list of customer
    Given User is on Master management page
    And User search customer master by username

  @CustomerLocationMaster
  Scenario: Get the list of customer Location
    Given User is on Master management page
    And User search customer Location master by username

  @NotificationMaster
  Scenario: Get the list of Notification
    Given User is on Master management page
    And User search Notification by input

  @FAQMaster
  Scenario: Get the list of FAQ
    Given User is on Master management page
    And User search FAQ by input

  @CustomerClientMaster
  Scenario: Get the list of customer client
    Given User is on Master management page
    And User search customer client master by username

  @AddCustomerClient
  Scenario: User is able to add customer client
    Given User is on Master management page
    When User add customer client

  @UpdateCustomerClient
  Scenario: User is able to update customer client
    Given User is on Master management page
    When User update customer client

  @KeyFobMaster
  Scenario: Get the list of Key fob
    Given User is on Master management page
    When User get the all details using keyFob Token

  @AddKeyFob
  Scenario:The user is able to add Key fob
    Given User is on Master management page
    When User add key fob

  @KeyFobAllocationMaster
  Scenario: Get the list of Key fob allocations
    Given User is on Master management page
    When User get the all details of key fob allocations using input

  @AddKeyFobAllocation
  Scenario: The user is able to add key fob allocations
    Given User is on Master management page
    When User is able to add key fob allocations
