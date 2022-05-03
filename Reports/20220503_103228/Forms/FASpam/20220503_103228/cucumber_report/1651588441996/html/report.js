$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/rkeough/git/babson-automation/Include/features/Forms/Demo.feature");
formatter.feature({
  "name": "academics/graduate-school",
  "description": "  I want to submit and verify form submits with the correct data",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Form"
    },
    {
      "name": "@152"
    },
    {
      "name": "@Graduate"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Submit Grad form",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Grad"
    },
    {
      "name": "@152"
    }
  ]
});
formatter.step({
  "name": "I am on the homepage",
  "keyword": "Given "
});
formatter.step({
  "name": "I am on grad \"\u003cgradForm\u003e\" page",
  "keyword": "When "
});
formatter.step({
  "name": "I input the first and last name on the form",
  "keyword": "And "
});
formatter.step({
  "name": "I input an email address",
  "keyword": "And "
});
formatter.step({
  "name": "I select a program \"\u003cprogram\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "I select a term \"\u003cterm\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "I input a phone number",
  "keyword": "And "
});
formatter.step({
  "name": "I select a country",
  "keyword": "And "
});
formatter.step({
  "name": "I input a state",
  "keyword": "And "
});
formatter.step({
  "name": "I input a city",
  "keyword": "And "
});
formatter.step({
  "name": "I input the postal code",
  "keyword": "And "
});
formatter.step({
  "name": "I click the submit button",
  "keyword": "And "
});
formatter.step({
  "name": "I am on the correct \"\u003cthankYou\u003e\" page",
  "keyword": "And "
});
formatter.step({
  "name": "I get the submit request",
  "keyword": "And "
});
formatter.step({
  "name": "I delete the form record",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "gradForm",
        "program",
        "term",
        "thankYou"
      ]
    },
    {
      "cells": [
        "https://www.babson.edu/academics/graduate-school/mba/",
        "tfa_1184",
        "tfa_1042",
        "https://www.babson.edu/academics/graduate-school/mba/full-time-mba/thank-you/"
      ]
    },
    {
      "cells": [
        "https://www.babson.edu/academics/graduate-school/mba/",
        "tfa_1184",
        "tfa_1089",
        "https://www.babson.edu/academics/graduate-school/mba/full-time-mba/thank-you/"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Submit Grad form",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Form"
    },
    {
      "name": "@152"
    },
    {
      "name": "@Graduate"
    },
    {
      "name": "@Grad"
    },
    {
      "name": "@152"
    }
  ]
});
formatter.step({
  "name": "I am on the homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "Grad152.Homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am on grad \"https://www.babson.edu/academics/graduate-school/mba/\" page",
  "keyword": "When "
});
formatter.match({
  "location": "Grad152.GradPage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I input the first and last name on the form",
  "keyword": "And "
});
formatter.match({
  "location": "Grad152.FirstLastName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I input an email address",
  "keyword": "And "
});
formatter.match({
  "location": "Grad152.inputEmail()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select a program \"tfa_1184\"",
  "keyword": "And "
});
formatter.match({
  "location": "Grad152.SelectAProgramOfInterest(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select a term \"tfa_1042\"",
  "keyword": "And "
});
formatter.match({
  "location": "Grad152.SelectATermOfEnrollment(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I input a phone number",
  "keyword": "And "
});
formatter.match({
  "location": "Grad152.inputPhoneNumber()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select a country",
  "keyword": "And "
});
formatter.match({
  "location": "Grad152.SelectACountry()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I input a state",
  "keyword": "And "
});
formatter.match({
  "location": "Grad152.inputState()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I input a city",
  "keyword": "And "
});
formatter.match({
  "location": "Grad152.inputCity()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I input the postal code",
  "keyword": "And "
});
formatter.match({
  "location": "Grad152.inputPostalZode()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click the submit button",
  "keyword": "And "
});
formatter.match({
  "location": "Grad152.clickSubmit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am on the correct \"https://www.babson.edu/academics/graduate-school/mba/full-time-mba/thank-you/\" page",
  "keyword": "And "
});
formatter.match({
  "location": "Grad152.thankYouPage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get the submit request",
  "keyword": "And "
});
formatter.match({
  "location": "Grad152.submitRequest()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I delete the form record",
  "keyword": "Then "
});
formatter.match({
  "location": "Grad152.deleteRequest()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Submit Grad form",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Form"
    },
    {
      "name": "@152"
    },
    {
      "name": "@Graduate"
    },
    {
      "name": "@Grad"
    },
    {
      "name": "@152"
    }
  ]
});
formatter.step({
  "name": "I am on the homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "Grad152.Homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am on grad \"https://www.babson.edu/academics/graduate-school/mba/\" page",
  "keyword": "When "
});
formatter.match({
  "location": "Grad152.GradPage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I input the first and last name on the form",
  "keyword": "And "
});
formatter.match({
  "location": "Grad152.FirstLastName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I input an email address",
  "keyword": "And "
});
formatter.match({
  "location": "Grad152.inputEmail()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select a program \"tfa_1184\"",
  "keyword": "And "
});
formatter.match({
  "location": "Grad152.SelectAProgramOfInterest(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select a term \"tfa_1089\"",
  "keyword": "And "
});
formatter.match({
  "location": "Grad152.SelectATermOfEnrollment(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I input a phone number",
  "keyword": "And "
});
formatter.match({
  "location": "Grad152.inputPhoneNumber()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select a country",
  "keyword": "And "
});
formatter.match({
  "location": "Grad152.SelectACountry()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I input a state",
  "keyword": "And "
});
formatter.match({
  "location": "Grad152.inputState()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I input a city",
  "keyword": "And "
});
formatter.match({
  "location": "Grad152.inputCity()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I input the postal code",
  "keyword": "And "
});
formatter.match({
  "location": "Grad152.inputPostalZode()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click the submit button",
  "keyword": "And "
});
formatter.match({
  "location": "Grad152.clickSubmit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am on the correct \"https://www.babson.edu/academics/graduate-school/mba/full-time-mba/thank-you/\" page",
  "keyword": "And "
});
formatter.match({
  "location": "Grad152.thankYouPage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get the submit request",
  "keyword": "And "
});
formatter.match({
  "location": "Grad152.submitRequest()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I delete the form record",
  "keyword": "Then "
});
formatter.match({
  "location": "Grad152.deleteRequest()"
});
formatter.result({
  "status": "passed"
});
});