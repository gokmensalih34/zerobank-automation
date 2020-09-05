Feature: Pay Bills

  Background:
    Given the user is logged in
    When the user accesses the "Pay Bills" tab

  Scenario: User should see correct page title after accessing the Pay Bills tab
    Then the page title should be "Zero - Pay Bills"

  Scenario: User should see success message in case of successful payment under Pay Bills
    And the user choose payee "Apple"
    And the user choose  Account "Checking"
    And the user enters amount "500"
    And the user enter date "2020-09-08"
    And the user enter description "New Transaction"
    And the user clicks on Pay button
    Then the user should see "The payment was successfully submitted."

    Scenario: User should see failed message in case of unsuccessful payment under Pay Bills
      And the user choose payee "Wells Fargo"
      And the user choose  Account "Loan"
      And the user enters amount ""
      And the user enter date "2020-09-08"
      And the user enter description "New Transaction"
      And the user clicks on Pay button
      Then the user should see failed message