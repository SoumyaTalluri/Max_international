$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Isomorphic sigin Screen",
  "description": "",
  "id": "isomorphic-sigin-screen",
  "keyword": "Feature"
});
formatter.before({
  "duration": 23121969900,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "[Login] To verify the user is able to sigin in the application",
  "description": "",
  "id": "isomorphic-sigin-screen;[login]-to-verify-the-user-is-able-to-sigin-in-the-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@sigin"
    },
    {
      "line": 5,
      "name": "@demo"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I am on the sigin page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I enter the username \"nimittest20@gmail.com\" and the password \"Pass123@\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I click on the sigin button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I will switch to home page and verify with \"nimittest20@gmail.com\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.i_am_on_the_sigin_page()"
});
formatter.result({
  "duration": 203379600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "nimittest20@gmail.com",
      "offset": 22
    },
    {
      "val": "Pass123@",
      "offset": 63
    }
  ],
  "location": "LoginStepDefinition.i_enter_the_username_something_and_the_password_something(String,String)"
});
formatter.result({
  "duration": 655030400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.i_click_on_the_sigin_button()"
});
formatter.result({
  "duration": 106803800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "nimittest20@gmail.com",
      "offset": 44
    }
  ],
  "location": "LoginStepDefinition.i_will_switch_to_home_page_and_verify_with_something(String)"
});
formatter.result({
  "duration": 2911659100,
  "status": "passed"
});
});