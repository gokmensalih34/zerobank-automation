$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AccountActivity.feature");
formatter.feature({
  "name": "Account Activity",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@aa"
    }
  ]
});
formatter.scenario({
  "name": "Account Activity page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@aa"
    }
  ]
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
  "name": "the user accesses the \"Account Activity\" tab",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.PayBillsStepDefs.the_user_accesses_the_tab(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the page title should be \"Zero - Account Activity\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.AccountActivityStepDefs.the_page_title_should_be(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the Account drop down default option should be \"Savings\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.AccountActivityStepDefs.the_Account_drop_down_default_option_should_be(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Account drop down should have the following options",
  "rows": [
    {},
    {},
    {},
    {},
    {},
    {}
  ],
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.AccountActivityStepDefs.account_drop_down_should_have_the_following_options(java.util.List\u003cjava.lang.String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Transactions table should have column following names",
  "rows": [
    {},
    {},
    {},
    {}
  ],
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.AccountActivityStepDefs.transactions_table_should_have_column_following_names(java.util.List\u003cjava.lang.String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "User should login",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@li"
    }
  ]
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
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefs.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Only autorized user should be login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@li"
    }
  ]
});
formatter.step({
  "name": "the user enters valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefs.the_users_enter_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "account summary page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefs.account_summary_page_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
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
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefs.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "With wrong username or password login failed",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@li"
    }
  ]
});
formatter.step({
  "name": "the user enters wrong credentials",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefs.the_user_enters_wrong_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see error message",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefs.the_user_should_see_error_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "With wrong username or password login failed",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user enter \"\u003cusername\u003e\" \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "the user should see error message",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "",
        "password"
      ]
    },
    {
      "cells": [
        "username",
        ""
      ]
    },
    {
      "cells": [
        "1usermane",
        "password"
      ]
    },
    {
      "cells": [
        "username",
        "password2"
      ]
    }
  ]
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
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefs.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "With wrong username or password login failed",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@li"
    }
  ]
});
formatter.step({
  "name": "the user enter \"\" \"password\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefs.the_user_enter(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see error message",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefs.the_user_should_see_error_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
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
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefs.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "With wrong username or password login failed",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@li"
    }
  ]
});
formatter.step({
  "name": "the user enter \"username\" \"\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefs.the_user_enter(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see error message",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefs.the_user_should_see_error_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
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
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefs.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "With wrong username or password login failed",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@li"
    }
  ]
});
formatter.step({
  "name": "the user enter \"1usermane\" \"password\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefs.the_user_enter(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see error message",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefs.the_user_should_see_error_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
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
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefs.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "With wrong username or password login failed",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@li"
    }
  ]
});
formatter.step({
  "name": "the user enter \"username\" \"password2\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefs.the_user_enter(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see error message",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefs.the_user_should_see_error_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});