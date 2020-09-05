$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/PurchaseForeignCurrency.feature");
formatter.feature({
  "name": "Purchase Foreign Currency",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.AccountActivityNavigationStepDefs.the_user_is_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user accesses the Purchase foreign currency cash tab",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.PurchaseForeignCurrenyStepDefs.the_user_accesses_the_Purchase_foreign_currency_cash_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Error message for not selecting currency",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "user tries to calculate cost without selecting a currency",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.PurchaseForeignCurrenyStepDefs.user_tries_to_calculate_cost_without_selecting_a_currency()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "error message \"Please, ensure that you have filled all the required fields with valid values.\" should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.PurchaseForeignCurrenyStepDefs.errorMessageShouldBeDisplayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});