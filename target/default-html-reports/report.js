$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/PayBills.feature");
formatter.feature({
  "name": "Pay Bills",
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
  "name": "the user accesses the \"Pay Bills\" tab",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.PayBillsStepDefs.the_user_accesses_the_tab(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should see failed message in case of unsuccessful payment under Pay Bills",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "the user choose payee \"Wells Fargo\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.PayBillsStepDefs.the_user_choose_payee(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user choose  Account \"Loan\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.PayBillsStepDefs.the_user_choose_Account(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters amount \"\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.PayBillsStepDefs.the_user_enters_amount(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enter date \"2020-09-08\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.PayBillsStepDefs.the_user_enter_date(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enter description \"New Transaction\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.PayBillsStepDefs.the_user_enter_description(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on Pay button",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.PayBillsStepDefs.the_user_clicks_on_Pay_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see failed message as \"Please fill in this field.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.PayBillsStepDefs.theUserShouldSeeFailedMessageAs(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});