$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/rkeough/git/babson-automation/Include/features/Forms/Demo.feature");
formatter.feature({
  "name": "academics/graduate-school",
  "description": "  I want to submit and verify form submits with the correct data",
  "keyword": "Feature"
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
  "name": "I am on grad \"\u003cgradForm\u003e\" page",
  "keyword": "Given "
});
formatter.step({
  "name": "I close the virtual popup",
  "keyword": "When "
});
formatter.step({
  "name": "I close the privacy policy popup",
  "keyword": "And "
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
  "name": "I select a state",
  "keyword": "And "
});
formatter.step({
  "name": "I input a city",
  "keyword": "And "
});
formatter.step({
  "name": "I input the zip code",
  "keyword": "And "
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
        "term"
      ]
    },
    {
      "cells": [
        "https://www.babson.edu/academics/graduate-school/",
        "tfa_1184",
        "tfa_1089"
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
      "name": "@Grad"
    },
    {
      "name": "@152"
    }
  ]
});
formatter.step({
  "name": "I am on grad \"https://www.babson.edu/academics/graduate-school/\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "Grad152.GradPage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I close the virtual popup",
  "keyword": "When "
});
formatter.match({
  "location": "Grad152.closeVirtualPopup()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I close the privacy policy popup",
  "keyword": "And "
});
formatter.match({
  "location": "UnderGradAdmissionSubmit.CloseThePrivacyPopUP()"
});
formatter.result({
  "error_message": "com.kms.katalon.core.exception.StepFailedException: Unable to click on object \u0027Object Repository/FormFields/UnderGradSubmit/PrivacyPolicy\u0027\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.stepFailed(WebUIKeywordMain.groovy:64)\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.runKeyword(WebUIKeywordMain.groovy:26)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.ClickKeyword.click(ClickKeyword.groovy:74)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.ClickKeyword.execute(ClickKeyword.groovy:40)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordExecutor.executeKeywordForPlatform(KeywordExecutor.groovy:74)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords.click(WebUiBuiltInKeywords.groovy:620)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords$click$2.call(Unknown Source)\r\n\tat forms.UnderGradAdmissionSubmit.CloseThePrivacyPopUP(UnderGradAdmissionSubmit.groovy:49)\r\n\tat ✽.I close the privacy policy popup(C:/Users/rkeough/git/babson-automation/Include/features/Forms/Demo.feature:8)\r\nCaused by: com.kms.katalon.core.webui.exception.WebElementNotFoundException: Web element with id: \u0027Object Repository/FormFields/UnderGradSubmit/PrivacyPolicy\u0027 located by \u0027//div[@id\u003d\u0027cookie-handler\u0027]/div/p/a\u0027 not found\r\n\tat com.kms.katalon.core.webui.common.WebUiCommonHelper.findWebElement(WebUiCommonHelper.java:1370)\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword.findWebElement(WebUIAbstractKeyword.groovy:27)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.ClickKeyword$_click_closure1.doCall(ClickKeyword.groovy:65)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.ClickKeyword$_click_closure1.call(ClickKeyword.groovy)\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.runKeyword(WebUIKeywordMain.groovy:20)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.ClickKeyword.click(ClickKeyword.groovy:74)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.ClickKeyword.execute(ClickKeyword.groovy:40)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordExecutor.executeKeywordForPlatform(KeywordExecutor.groovy:74)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords.click(WebUiBuiltInKeywords.groovy:620)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords$click$2.call(Unknown Source)\r\n\tat forms.UnderGradAdmissionSubmit.CloseThePrivacyPopUP(UnderGradAdmissionSubmit.groovy:49)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:48)\r\n\tat cucumber.runtime.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:50)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:65)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:47)\r\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:53)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:47)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:44)\r\n\tat cucumber.runtime.Runtime.runFeature(Runtime.java:120)\r\n\tat cucumber.runtime.Runtime.run(Runtime.java:106)\r\n\tat cucumber.api.cli.Main.run(Main.java:35)\r\n\tat cucumber.api.cli.Main$run.call(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$_runFeatureFile_closure1.doCall(CucumberBuiltinKeywords.groovy:108)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$_runFeatureFile_closure1.doCall(CucumberBuiltinKeywords.groovy)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain.runKeyword(KeywordMain.groovy:74)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain.runKeyword(KeywordMain.groovy:68)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain$runKeyword.call(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords.runFeatureFile(CucumberBuiltinKeywords.groovy:75)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$runFeatureFile$0.callStatic(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords.runFeatureFile(CucumberBuiltinKeywords.groovy:248)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$runFeatureFile.call(Unknown Source)\r\n\tat Demo.run(Demo:20)\r\n\tat com.kms.katalon.core.main.ScriptEngine.run(ScriptEngine.java:194)\r\n\tat com.kms.katalon.core.main.ScriptEngine.runScriptAsRawText(ScriptEngine.java:119)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.runScript(TestCaseExecutor.java:442)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.doExecute(TestCaseExecutor.java:433)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.processExecutionPhase(TestCaseExecutor.java:412)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.accessMainPhase(TestCaseExecutor.java:404)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.execute(TestCaseExecutor.java:281)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.accessTestCaseMainPhase(TestSuiteExecutor.java:202)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.accessTestSuiteMainPhase(TestSuiteExecutor.java:164)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.execute(TestSuiteExecutor.java:105)\r\n\tat com.kms.katalon.core.main.TestCaseMain.startTestSuite(TestCaseMain.java:185)\r\n\tat com.kms.katalon.core.main.TestCaseMain$startTestSuite$0.call(Unknown Source)\r\n\tat TempTestSuite1645627215240.run(TempTestSuite1645627215240.groovy:36)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I input the first and last name on the form",
  "keyword": "And "
});
formatter.match({
  "location": "Grad152.FirstLastName()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I input an email address",
  "keyword": "And "
});
formatter.match({
  "location": "Grad152.inputEmail()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I select a program \"tfa_1184\"",
  "keyword": "And "
});
formatter.match({
  "location": "Grad152.SelectAProgramOfInterest(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I select a term \"tfa_1089\"",
  "keyword": "And "
});
formatter.match({
  "location": "Grad152.SelectATermOfEnrollment(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I input a phone number",
  "keyword": "And "
});
formatter.match({
  "location": "Grad152.inputPhoneNumber()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I select a country",
  "keyword": "And "
});
formatter.match({
  "location": "Grad152.SelectACountry()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I select a state",
  "keyword": "And "
});
formatter.match({
  "location": "Grad152.selectState()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I input a city",
  "keyword": "And "
});
formatter.match({
  "location": "Grad152.inputCity()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I input the zip code",
  "keyword": "And "
});
formatter.match({
  "location": "Grad152.inputZipZode()"
});
formatter.result({
  "status": "skipped"
});
});