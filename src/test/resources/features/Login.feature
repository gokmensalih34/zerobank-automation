Feature: User should login

  Background:
    Given the user is on the login page
  # Above is our Feature File

# The scenario below is our "test case" we call it also as Scenario

  Scenario:  Only autorized user should be login
    When the user enters valid credentials
    Then account summary page should be displayed


  Scenario:  With wrong username or password login failed
    When the user enter wrong credentials
    Then the user should see error message

  Scenario Outline:  With wrong username or password login failed
    When the user enter "<username>" "<password>"
    Then the user should see error message
    Examples:
      | username  | password  |
      |           | password  |
      | username  |           |
      | 1usermane | password  |
      | username  | password2 |



