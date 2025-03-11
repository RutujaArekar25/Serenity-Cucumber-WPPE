Feature: Ongoing Queue Functionality

  @LogIn
  Scenario: LogIn using Credentials
    Given User is on HomePage to LogIn
    When User LogIn with valid Credentials
    Then  User is should be on Dashboard

    @RetrievalRequest
    Scenario: Add Retrieval Request
      Given User is on Ongoing Queue status
      And User add Retrieval Request

#    @BookingRequest
#    Scenario:Add Booking Request
#      Given User is on Ongoing Queue status
#      And User add Booking Request

#    @CancelBookingOrRetrieval
#    Scenario: Cancel the Request
#      Given User is on Ongoing Queue status
#      And User cancel the request
