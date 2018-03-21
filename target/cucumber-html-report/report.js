$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("feature/testcase1.feature");
formatter.feature({
  "line": 1,
  "name": "Gmail Login",
  "description": "",
  "id": "gmail-login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 387072,
  "status": "passed"
});
formatter.before({
  "duration": 124626,
  "status": "passed"
});
formatter.before({
  "duration": 115339,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "valid the username and password",
  "description": "",
  "id": "gmail-login;valid-the-username-and-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Regression"
    },
    {
      "line": 3,
      "name": "@home"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User Launch the Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enter the Username and password",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User close the Application",
  "keyword": "Then "
});
formatter.match({
  "location": "Testcase1.user_Launch_the_Application()"
});
formatter.result({
  "duration": 451054525,
  "status": "passed"
});
formatter.match({
  "location": "Testcase1.user_enter_the_Username_and_password()"
});
formatter.result({
  "duration": 115340,
  "status": "passed"
});
formatter.match({
  "location": "Testcase1.user_close_the_Application()"
});
formatter.result({
  "duration": 492636,
  "status": "passed"
});
formatter.after({
  "duration": 503388,
  "status": "passed"
});
formatter.after({
  "duration": 105565,
  "status": "passed"
});
formatter.after({
  "duration": 100189,
  "status": "passed"
});
formatter.before({
  "duration": 1107943,
  "status": "passed"
});
formatter.before({
  "duration": 464779,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "valid the username and password",
  "description": "",
  "id": "gmail-login;valid-the-username-and-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@Sanity"
    },
    {
      "line": 10,
      "name": "@logout"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "User Launch the Application",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "User enter the Username and password and designation",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "designation"
      ],
      "line": 14
    },
    {
      "cells": [
        "vinoth",
        "rustee",
        "tester"
      ],
      "line": 15
    },
    {
      "cells": [
        "rustee",
        "fail",
        "busy"
      ],
      "line": 16
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "User close the Application",
  "keyword": "Then "
});
formatter.match({
  "location": "Testcase1.user_Launch_the_Application()"
});
formatter.result({
  "duration": 467223,
  "status": "passed"
});
formatter.match({
  "location": "Testcase1.user_enter_the_Username_and_password_and_designation(DataTable)"
});
formatter.result({
  "duration": 3186497,
  "status": "passed"
});
formatter.match({
  "location": "Testcase1.user_close_the_Application()"
});
formatter.result({
  "duration": 412485,
  "status": "passed"
});
formatter.after({
  "duration": 475531,
  "status": "passed"
});
formatter.after({
  "duration": 423237,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 22,
  "name": "Enter all the username and password",
  "description": "",
  "id": "gmail-login;enter-all-the-username-and-password",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 21,
      "name": "@Regression"
    },
    {
      "line": 21,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "User Launch the Application",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "User enter \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "User close the Application",
  "keyword": "Then "
});
formatter.examples({
  "line": 27,
  "name": "",
  "description": "",
  "id": "gmail-login;enter-all-the-username-and-password;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 28,
      "id": "gmail-login;enter-all-the-username-and-password;;1"
    },
    {
      "cells": [
        "vinoth",
        "success"
      ],
      "line": 29,
      "id": "gmail-login;enter-all-the-username-and-password;;2"
    },
    {
      "cells": [
        "rustee",
        "Fail"
      ],
      "line": 30,
      "id": "gmail-login;enter-all-the-username-and-password;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 544441,
  "status": "passed"
});
formatter.before({
  "duration": 464290,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "Enter all the username and password",
  "description": "",
  "id": "gmail-login;enter-all-the-username-and-password;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 21,
      "name": "@Sanity"
    },
    {
      "line": 21,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "User Launch the Application",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "User enter \"vinoth\" and \"success\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "User close the Application",
  "keyword": "Then "
});
formatter.match({
  "location": "Testcase1.user_Launch_the_Application()"
});
formatter.result({
  "duration": 463802,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "vinoth",
      "offset": 12
    },
    {
      "val": "success",
      "offset": 25
    }
  ],
  "location": "Testcase1.user_enter_and(String,String)"
});
formatter.result({
  "duration": 7901242,
  "status": "passed"
});
formatter.match({
  "location": "Testcase1.user_close_the_Application()"
});
formatter.result({
  "duration": 488727,
  "status": "passed"
});
formatter.after({
  "duration": 122182,
  "status": "passed"
});
formatter.after({
  "duration": 96280,
  "status": "passed"
});
formatter.before({
  "duration": 132933,
  "status": "passed"
});
formatter.before({
  "duration": 467711,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "Enter all the username and password",
  "description": "",
  "id": "gmail-login;enter-all-the-username-and-password;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 21,
      "name": "@Sanity"
    },
    {
      "line": 21,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "User Launch the Application",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "User enter \"rustee\" and \"Fail\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "User close the Application",
  "keyword": "Then "
});
formatter.match({
  "location": "Testcase1.user_Launch_the_Application()"
});
formatter.result({
  "duration": 441320,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "rustee",
      "offset": 12
    },
    {
      "val": "Fail",
      "offset": 25
    }
  ],
  "location": "Testcase1.user_enter_and(String,String)"
});
formatter.result({
  "duration": 600645,
  "status": "passed"
});
formatter.match({
  "location": "Testcase1.user_close_the_Application()"
});
formatter.result({
  "duration": 525870,
  "status": "passed"
});
formatter.after({
  "duration": 400756,
  "status": "passed"
});
formatter.after({
  "duration": 442787,
  "status": "passed"
});
});