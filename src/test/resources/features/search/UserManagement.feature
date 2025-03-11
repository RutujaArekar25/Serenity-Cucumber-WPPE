Feature: User Management Functionality

  @LogIn
  Scenario: LogIn using Credentials
    Given User is on HomePage to LogIn
    When User LogIn with valid Credentials
    Then  User is should be on Dashboard

  @WebUsers
  Scenario: Get List of Web Users
    Given User is on user management Page
    And User Search Web users by userName

#  @MobileUsers
#  Scenario: Get List of Mobile Users
#    Given User is on user management Page
#    And User Search mobile users by userName
#
#  @VisitorUsers
#  Scenario: Get List of visitor Users
#    Given User is on user management Page
#    And User Search visitor users by userName
