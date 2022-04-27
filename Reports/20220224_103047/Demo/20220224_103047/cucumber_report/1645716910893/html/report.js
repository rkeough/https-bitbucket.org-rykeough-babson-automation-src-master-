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
  "error_message": "com.kms.katalon.core.exception.StepFailedException: Unable to set text \u0027babsonTest1@gmail.com\u0027 of object \u0027Object Repository/FormFields/inputEmail\u0027 (Root cause: com.kms.katalon.core.exception.StepFailedException: Unable to set text \u0027babsonTest1@gmail.com\u0027 of object \u0027Object Repository/FormFields/inputEmail\u0027\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.stepFailed(WebUIKeywordMain.groovy:64)\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.runKeyword(WebUIKeywordMain.groovy:26)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.SetTextKeyword.setText(SetTextKeyword.groovy:66)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.SetTextKeyword.execute(SetTextKeyword.groovy:37)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordExecutor.executeKeywordForPlatform(KeywordExecutor.groovy:74)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords.setText(WebUiBuiltInKeywords.groovy:980)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords$setText$3.call(Unknown Source)\r\n\tat forms.Grad152.inputEmail(Grad152.groovy:61)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:48)\r\n\tat cucumber.runtime.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:50)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:65)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:47)\r\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:53)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:47)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:44)\r\n\tat cucumber.runtime.Runtime.runFeature(Runtime.java:120)\r\n\tat cucumber.runtime.Runtime.run(Runtime.java:106)\r\n\tat cucumber.api.cli.Main.run(Main.java:35)\r\n\tat cucumber.api.cli.Main$run.call(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$_runFeatureFile_closure1.doCall(CucumberBuiltinKeywords.groovy:108)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$_runFeatureFile_closure1.doCall(CucumberBuiltinKeywords.groovy)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain.runKeyword(KeywordMain.groovy:74)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain.runKeyword(KeywordMain.groovy:68)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain$runKeyword.call(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords.runFeatureFile(CucumberBuiltinKeywords.groovy:75)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$runFeatureFile$0.callStatic(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords.runFeatureFile(CucumberBuiltinKeywords.groovy:248)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$runFeatureFile.call(Unknown Source)\r\n\tat Demo.run(Demo:20)\r\n\tat com.kms.katalon.core.main.ScriptEngine.run(ScriptEngine.java:194)\r\n\tat com.kms.katalon.core.main.ScriptEngine.runScriptAsRawText(ScriptEngine.java:119)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.runScript(TestCaseExecutor.java:442)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.doExecute(TestCaseExecutor.java:433)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.processExecutionPhase(TestCaseExecutor.java:412)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.accessMainPhase(TestCaseExecutor.java:404)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.execute(TestCaseExecutor.java:281)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.execute(TestCaseExecutor.java:363)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.execute(TestCaseExecutor.java:363)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.execute(TestCaseExecutor.java:363)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.accessTestCaseMainPhase(TestSuiteExecutor.java:202)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.accessTestSuiteMainPhase(TestSuiteExecutor.java:164)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.execute(TestSuiteExecutor.java:105)\r\n\tat com.kms.katalon.core.main.TestCaseMain.startTestSuite(TestCaseMain.java:185)\r\n\tat com.kms.katalon.core.main.TestCaseMain$startTestSuite$0.call(Unknown Source)\r\n\tat TempTestSuite1645716647730.run(TempTestSuite1645716647730.groovy:36)\r\nCaused by: com.kms.katalon.core.webui.exception.WebElementNotFoundException: Web element with id: \u0027Object Repository/FormFields/inputEmail\u0027 located by \u0027//*[@type \u003d \u0027text\u0027 and @class \u003d \u0027validate-email required\u0027 and contains(@title, \u0027Email\u0027)]\u0027 not found\r\n\tat com.kms.katalon.core.webui.common.WebUiCommonHelper.findWebElement(WebUiCommonHelper.java:1370)\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword.findWebElement(WebUIAbstractKeyword.groovy:27)\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword.findWebElement(WebUIAbstractKeyword.groovy:26)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.SetTextKeyword$_setText_closure1.doCall(SetTextKeyword.groovy:51)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.SetTextKeyword$_setText_closure1.call(SetTextKeyword.groovy)\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.runKeyword(WebUIKeywordMain.groovy:20)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.SetTextKeyword.setText(SetTextKeyword.groovy:66)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.SetTextKeyword.execute(SetTextKeyword.groovy:37)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordExecutor.executeKeywordForPlatform(KeywordExecutor.groovy:74)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords.setText(WebUiBuiltInKeywords.groovy:980)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords$setText$3.call(Unknown Source)\r\n\tat forms.Grad152.inputEmail(Grad152.groovy:61)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:48)\r\n\tat cucumber.runtime.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:50)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:65)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:47)\r\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:53)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:47)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:44)\r\n\tat cucumber.runtime.Runtime.runFeature(Runtime.java:120)\r\n\tat cucumber.runtime.Runtime.run(Runtime.java:106)\r\n\tat cucumber.api.cli.Main.run(Main.java:35)\r\n\tat cucumber.api.cli.Main$run.call(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$_runFeatureFile_closure1.doCall(CucumberBuiltinKeywords.groovy:108)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$_runFeatureFile_closure1.doCall(CucumberBuiltinKeywords.groovy)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain.runKeyword(KeywordMain.groovy:74)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain.runKeyword(KeywordMain.groovy:68)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain$runKeyword.call(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords.runFeatureFile(CucumberBuiltinKeywords.groovy:75)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$runFeatureFile$0.callStatic(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords.runFeatureFile(CucumberBuiltinKeywords.groovy:248)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$runFeatureFile.call(Unknown Source)\r\n\tat Script1645551788182.run(Script1645551788182.groovy:20)\r\n\t... 16 more\r\n)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain.stepFailed(KeywordMain.groovy:39)\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.stepFailed(WebUIKeywordMain.groovy:64)\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.runKeyword(WebUIKeywordMain.groovy:26)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.SetTextKeyword.setText(SetTextKeyword.groovy:66)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.SetTextKeyword.execute(SetTextKeyword.groovy:37)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordExecutor.executeKeywordForPlatform(KeywordExecutor.groovy:74)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords.setText(WebUiBuiltInKeywords.groovy:980)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords$setText$3.call(Unknown Source)\r\n\tat forms.Grad152.inputEmail(Grad152.groovy:61)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:48)\r\n\tat cucumber.runtime.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:50)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:65)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:47)\r\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:53)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:47)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:44)\r\n\tat cucumber.runtime.Runtime.runFeature(Runtime.java:120)\r\n\tat cucumber.runtime.Runtime.run(Runtime.java:106)\r\n\tat cucumber.api.cli.Main.run(Main.java:35)\r\n\tat cucumber.api.cli.Main$run.call(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$_runFeatureFile_closure1.doCall(CucumberBuiltinKeywords.groovy:108)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$_runFeatureFile_closure1.doCall(CucumberBuiltinKeywords.groovy)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.codehaus.groovy.reflection.CachedMethod.invoke(CachedMethod.java:98)\r\n\tat groovy.lang.MetaMethod.doMethodInvoke(MetaMethod.java:325)\r\n\tat org.codehaus.groovy.runtime.metaclass.ClosureMetaClass.invokeMethod(ClosureMetaClass.java:264)\r\n\tat groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:1034)\r\n\tat groovy.lang.Closure.call(Closure.java:420)\r\n\tat groovy.lang.Closure.call(Closure.java:414)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain.runKeyword(KeywordMain.groovy:74)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain.runKeyword(KeywordMain.groovy:68)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain$runKeyword.call(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords.runFeatureFile(CucumberBuiltinKeywords.groovy:75)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$runFeatureFile$0.callStatic(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords.runFeatureFile(CucumberBuiltinKeywords.groovy:248)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$runFeatureFile.call(Unknown Source)\r\n\tat Script1645551788182.run(Script1645551788182.groovy:20)\r\n\tat com.kms.katalon.core.main.ScriptEngine.run(ScriptEngine.java:194)\r\n\tat com.kms.katalon.core.main.ScriptEngine.runScriptAsRawText(ScriptEngine.java:119)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.runScript(TestCaseExecutor.java:442)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.doExecute(TestCaseExecutor.java:433)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.processExecutionPhase(TestCaseExecutor.java:412)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.accessMainPhase(TestCaseExecutor.java:404)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.execute(TestCaseExecutor.java:281)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.execute(TestCaseExecutor.java:363)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.execute(TestCaseExecutor.java:363)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.execute(TestCaseExecutor.java:363)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.accessTestCaseMainPhase(TestSuiteExecutor.java:202)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.accessTestSuiteMainPhase(TestSuiteExecutor.java:164)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.execute(TestSuiteExecutor.java:105)\r\n\tat com.kms.katalon.core.main.TestCaseMain.startTestSuite(TestCaseMain.java:185)\r\n\tat com.kms.katalon.core.main.TestCaseMain$startTestSuite$0.call(Unknown Source)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:47)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:116)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:144)\r\n\tat TempTestSuite1645716647730.run(TempTestSuite1645716647730.groovy:36)\r\n\tat groovy.lang.GroovyShell.runScriptOrMainOrTestOrRunnable(GroovyShell.java:263)\r\n\tat groovy.lang.GroovyShell.run(GroovyShell.java:507)\r\n\tat groovy.lang.GroovyShell.run(GroovyShell.java:496)\r\n\tat groovy.ui.GroovyMain.processOnce(GroovyMain.java:597)\r\n\tat groovy.ui.GroovyMain.run(GroovyMain.java:329)\r\n\tat groovy.ui.GroovyMain.process(GroovyMain.java:315)\r\n\tat groovy.ui.GroovyMain.processArgs(GroovyMain.java:134)\r\n\tat groovy.ui.GroovyMain.main(GroovyMain.java:114)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.codehaus.groovy.tools.GroovyStarter.rootLoader(GroovyStarter.java:116)\r\n\tat org.codehaus.groovy.tools.GroovyStarter.main(GroovyStarter.java:138)\r\nCaused by: com.kms.katalon.core.exception.StepFailedException: Unable to set text \u0027babsonTest1@gmail.com\u0027 of object \u0027Object Repository/FormFields/inputEmail\u0027\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.stepFailed(WebUIKeywordMain.groovy:64)\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.runKeyword(WebUIKeywordMain.groovy:26)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.SetTextKeyword.setText(SetTextKeyword.groovy:66)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.SetTextKeyword.execute(SetTextKeyword.groovy:37)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordExecutor.executeKeywordForPlatform(KeywordExecutor.groovy:74)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords.setText(WebUiBuiltInKeywords.groovy:980)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords$setText$3.call(Unknown Source)\r\n\tat forms.Grad152.inputEmail(Grad152.groovy:61)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:48)\r\n\tat cucumber.runtime.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:50)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:65)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:47)\r\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:53)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:47)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:44)\r\n\tat cucumber.runtime.Runtime.runFeature(Runtime.java:120)\r\n\tat cucumber.runtime.Runtime.run(Runtime.java:106)\r\n\tat cucumber.api.cli.Main.run(Main.java:35)\r\n\tat cucumber.api.cli.Main$run.call(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$_runFeatureFile_closure1.doCall(CucumberBuiltinKeywords.groovy:108)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$_runFeatureFile_closure1.doCall(CucumberBuiltinKeywords.groovy)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain.runKeyword(KeywordMain.groovy:74)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain.runKeyword(KeywordMain.groovy:68)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain$runKeyword.call(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords.runFeatureFile(CucumberBuiltinKeywords.groovy:75)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$runFeatureFile$0.callStatic(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords.runFeatureFile(CucumberBuiltinKeywords.groovy:248)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$runFeatureFile.call(Unknown Source)\r\n\tat Demo.run(Demo:20)\r\n\tat com.kms.katalon.core.main.ScriptEngine.run(ScriptEngine.java:194)\r\n\tat com.kms.katalon.core.main.ScriptEngine.runScriptAsRawText(ScriptEngine.java:119)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.runScript(TestCaseExecutor.java:442)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.doExecute(TestCaseExecutor.java:433)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.processExecutionPhase(TestCaseExecutor.java:412)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.accessMainPhase(TestCaseExecutor.java:404)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.execute(TestCaseExecutor.java:281)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.execute(TestCaseExecutor.java:363)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.execute(TestCaseExecutor.java:363)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.execute(TestCaseExecutor.java:363)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.accessTestCaseMainPhase(TestSuiteExecutor.java:202)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.accessTestSuiteMainPhase(TestSuiteExecutor.java:164)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.execute(TestSuiteExecutor.java:105)\r\n\tat com.kms.katalon.core.main.TestCaseMain.startTestSuite(TestCaseMain.java:185)\r\n\tat com.kms.katalon.core.main.TestCaseMain$startTestSuite$0.call(Unknown Source)\r\n\tat TempTestSuite1645716647730.run(TempTestSuite1645716647730.groovy:36)\r\nCaused by: com.kms.katalon.core.webui.exception.WebElementNotFoundException: Web element with id: \u0027Object Repository/FormFields/inputEmail\u0027 located by \u0027//*[@type \u003d \u0027text\u0027 and @class \u003d \u0027validate-email required\u0027 and contains(@title, \u0027Email\u0027)]\u0027 not found\r\n\tat com.kms.katalon.core.webui.common.WebUiCommonHelper.findWebElement(WebUiCommonHelper.java:1370)\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword.findWebElement(WebUIAbstractKeyword.groovy:27)\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword.findWebElement(WebUIAbstractKeyword.groovy:26)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.SetTextKeyword$_setText_closure1.doCall(SetTextKeyword.groovy:51)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.SetTextKeyword$_setText_closure1.call(SetTextKeyword.groovy)\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.runKeyword(WebUIKeywordMain.groovy:20)\r\n\t... 46 more\r\n",
  "status": "failed"
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