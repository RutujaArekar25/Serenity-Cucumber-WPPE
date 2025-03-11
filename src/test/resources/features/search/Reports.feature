Feature: Report functionality

  @LogIn
  Scenario: LogIn using Credentials
    Given User is on HomePage to LogIn
    When User LogIn with valid Credentials
    Then  User is should be on Dashboard

#  @ReportPerHour
#  Scenario:Get Report of Request per Hour
#    Given User is should be on Report
#    And User is able to get report of request per hour
#  #  And User is able to download the RequestPerHour report

  @ReportOfVisitors
  Scenario:Get Report of visitors
    Given User is should be on Report
    And User is able to get data dateWise

#  @ReportOfAllUserParking
#  Scenario:Get Report of visitors
#    Given User is should be on Report
#    And User is able to get All users Parking report
#
#  @ReportOfParkingDataCount
#  Scenario:Get Report of visitors
#    Given User is should be on Report
#    And User is able to get Parking data count report
