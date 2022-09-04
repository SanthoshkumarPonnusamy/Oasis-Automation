Feature: Login to HRM

#  @Regression # Hardcoded Test Data inside Feature File
#  Scenario: Login with invalid credentials
#    Given user is on home page
#    When user enter admin as username
#    And user enter admin123 as password
#    Then user should be able to login


#  @Smoke # Hardcoded value using data table
#  Scenario Outline: Login with valid credentials
#    Given user is on home page
#    When user enter <userName> as username
#    And user enter <password> as password
#    Then user should be able to login
#
#    Examples:
#      | userName | password |
#      | admin    | admin123 |


  @Production #Passing Test data from Test data (Excel) sheet
  Scenario: Login with incorrect credentials
    Given user is on home page
    When user enter valid userName
    And user enter valid password
    Then user should be able to login