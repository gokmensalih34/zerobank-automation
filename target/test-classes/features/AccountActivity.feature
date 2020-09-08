@aa
Feature: Account Activity


  Scenario: Account Activity page
    Given the user is logged in
    When the user accesses the "Account Activity" tab
    Then the page title should be "Zero - Account Activity"
    And the Account drop down default option should be "Savings"
    And Account drop down should have the following options
      | Savings     |
      | Checking    |
      | Savings     |
      | Loan        |
      | Credit Card |
      | Brokerage   |
    And Transactions table should have column following names
      | Date        |
      | Description |
      | Deposit     |
      | Withdrawal  |
