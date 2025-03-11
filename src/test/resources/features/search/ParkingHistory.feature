Feature: Parking History Functionality

  @LogIn
  Scenario: LogIn using Credentials
    Given User is on HomePage to LogIn
    When User LogIn with valid Credentials
    Then  User is should be on Dashboard

#  @BookingHistory
#  Scenario: Get List of Booking History
#    Given User is on parking status Page
#    And User Search parking history by inputs

#  @RetrievalHistory
#  Scenario: Get List of Retrieval History
#    Given User is on parking status Page
#    And User Search Retrieval history by inputs

  @StorageHistory
  Scenario: Get List of Storage History
    Given User is on parking status Page
    And User Search Storage history by inputs

