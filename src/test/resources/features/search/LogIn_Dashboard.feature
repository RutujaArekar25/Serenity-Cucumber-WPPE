Feature: LogIn page and Dashboard functionality

    @LogIn
  Scenario: LogIn using Credentials
    Given User is on HomePage to LogIn
    When User LogIn with valid Credentials
    Then  User is should be on Dashboard

#  @LogIn
#  Scenario Outline: LogIn using Credentials
#    Given User is on HomePage to LogIn
#    When User LogIn with valid Credentials "<Username>" and "<Password>"
#    Then  User is should be on Dashboard

#    Examples:
#      | Username | Password  |
#      | 1005     | Test@1234 |
#      | 1005     | Test@1111 |

#  @LogIn
#  Scenario Outline: Verify user login with multiple credentials
#    Given the user navigates to the login page
#    When the user enters username "<username>" and password "<password>"
#    Then  User is should be on Dashboard

#    Examples:
#      | username | password  |
#      | 1005     | Test@1234 |
#      | user1    | wrongpass |
#      | guest    | guest123  |

  @CustomerAndLocation
  Scenario: The User is able to select Customer and Location
    Given User is should be on Dashboard
    And User Should select customer
    And User should select Location

  @AddVisitor
  Scenario: The user is able to add Visitor
    Given User is should be on Dashboard
    And User added Visitor

  @CountAllocations
  Scenario: The user is able to count the number of keyFob Allocations for Parked-Booked-Dead-Empty.
    Given User is should be on Dashboard
    When user Expand the sections
    Then user verifies the background colors for All allocations

  @ParkingStatus
  Scenario:The user is able to count Parking status
    Given User is should be on Dashboard
    When User expands parking status
    And User Count Parking status of Parked-Booked-Dead-Empty
    Then User Close the parking status
    And User count occupancy status of Parked-Booked-Dead-Empty

  @Assertion
  Scenario: The user comparing Actual vs Expected values
    Given User is should be on Dashboard
    And User compare the values of Parking status and occupancy