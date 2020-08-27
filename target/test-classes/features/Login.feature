Feature: User should login
  # Above is our Feature File

# The scenario below is our "test case" we call it also as Scenario

  Scenario:  Only autorized user should be login
    Given the user is on the login page
    When the user enter credentials
    Then account summary page should be displayed


  Scenario:  With wrong username or password login failed
    Given the user is on the login page
    When the user enter wrong credentials
    Then the user should see error message



