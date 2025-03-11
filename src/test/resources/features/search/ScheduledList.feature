Feature: Scheduled List Functionality

    @LogIn
    Scenario: LogIn using Credentials
      Given User is on HomePage to LogIn
      When User LogIn with valid Credentials
      Then  User is should be on Dashboard

      @BookingScheduledList
      Scenario: Get Scheduled List of Booking
        Given User is on Scheduled List
        And User Search Booking List by userName
#
#        @RetrievalScheduledList
#      Scenario: Get Scheduled List of Retrieval
#        Given User is on Scheduled List
#        And User Search Retrieval List by userName