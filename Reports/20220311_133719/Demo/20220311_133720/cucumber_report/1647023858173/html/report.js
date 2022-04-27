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
  "error_message": "com.kms.katalon.core.exception.StepFailedException: Unable to open browser with url: \u0027\u0027 (Root cause: com.kms.katalon.core.exception.StepFailedException: Unable to open browser with url: \u0027\u0027\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.stepFailed(WebUIKeywordMain.groovy:64)\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.runKeyword(WebUIKeywordMain.groovy:26)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.OpenBrowserKeyword.openBrowser(OpenBrowserKeyword.groovy:81)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.OpenBrowserKeyword.execute(OpenBrowserKeyword.groovy:67)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordExecutor.executeKeywordForPlatform(KeywordExecutor.groovy:74)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords.openBrowser(WebUiBuiltInKeywords.groovy:64)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords$openBrowser.call(Unknown Source)\r\n\tat forms.Grad152.GradPage(Grad152.groovy:44)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:48)\r\n\tat cucumber.runtime.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:50)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:65)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:47)\r\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:53)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:47)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:44)\r\n\tat cucumber.runtime.Runtime.runFeature(Runtime.java:120)\r\n\tat cucumber.runtime.Runtime.run(Runtime.java:106)\r\n\tat cucumber.api.cli.Main.run(Main.java:35)\r\n\tat cucumber.api.cli.Main$run.call(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$_runFeatureFile_closure1.doCall(CucumberBuiltinKeywords.groovy:108)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$_runFeatureFile_closure1.doCall(CucumberBuiltinKeywords.groovy)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain.runKeyword(KeywordMain.groovy:74)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain.runKeyword(KeywordMain.groovy:68)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain$runKeyword.call(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords.runFeatureFile(CucumberBuiltinKeywords.groovy:75)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$runFeatureFile$0.callStatic(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords.runFeatureFile(CucumberBuiltinKeywords.groovy:248)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$runFeatureFile.call(Unknown Source)\r\n\tat Demo.run(Demo:20)\r\n\tat com.kms.katalon.core.main.ScriptEngine.run(ScriptEngine.java:194)\r\n\tat com.kms.katalon.core.main.ScriptEngine.runScriptAsRawText(ScriptEngine.java:119)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.runScript(TestCaseExecutor.java:442)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.doExecute(TestCaseExecutor.java:433)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.processExecutionPhase(TestCaseExecutor.java:412)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.accessMainPhase(TestCaseExecutor.java:404)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.execute(TestCaseExecutor.java:281)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.execute(TestCaseExecutor.java:363)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.accessTestCaseMainPhase(TestSuiteExecutor.java:202)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.accessTestSuiteMainPhase(TestSuiteExecutor.java:164)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.execute(TestSuiteExecutor.java:105)\r\n\tat com.kms.katalon.core.main.TestCaseMain.startTestSuite(TestCaseMain.java:185)\r\n\tat com.kms.katalon.core.main.TestCaseMain$startTestSuite$0.call(Unknown Source)\r\n\tat TempTestSuite1647023840108.run(TempTestSuite1647023840108.groovy:36)\r\nCaused by: org.openqa.selenium.SessionNotCreatedException: session not created: This version of ChromeDriver only supports Chrome version 97\nCurrent browser version is 99.0.4844.51 with binary path C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:25:53\u0027\nSystem info: host: \u0027L18-0032\u0027, ip: \u002710.0.0.229\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: driver.version: CChromeDriver\nremote stacktrace: Backtrace:\n\tOrdinal0 [0x00CBE713+2549523]\n\tOrdinal0 [0x00C572D1+2126545]\n\tOrdinal0 [0x00B52C88+1059976]\n\tOrdinal0 [0x00B717FA+1185786]\n\tOrdinal0 [0x00B6D655+1168981]\n\tOrdinal0 [0x00B6AE21+1158689]\n\tOrdinal0 [0x00B9BFDF+1359839]\n\tOrdinal0 [0x00B9BC4A+1358922]\n\tOrdinal0 [0x00B97736+1341238]\n\tOrdinal0 [0x00B734E6+1193190]\n\tOrdinal0 [0x00B74376+1196918]\n\tGetHandleVerifier [0x00E59742+1627410]\n\tGetHandleVerifier [0x00F0A93C+2352908]\n\tGetHandleVerifier [0x00D52AE1+551089]\n\tGetHandleVerifier [0x00D51B03+547027]\n\tOrdinal0 [0x00C5CBEE+2149358]\n\tOrdinal0 [0x00C60F18+2166552]\n\tOrdinal0 [0x00C61060+2166880]\n\tOrdinal0 [0x00C6AC60+2206816]\n\tBaseThreadInitThunk [0x75976359+25]\n\tRtlGetAppContainerNamedObjectPath [0x77BC7B74+228]\n\tRtlGetAppContainerNamedObjectPath [0x77BC7B44+180]\n\r\n\tat org.openqa.selenium.remote.W3CHandshakeResponse.lambda$errorHandler$0(W3CHandshakeResponse.java:62)\r\n\tat org.openqa.selenium.remote.HandshakeResponse.lambda$getResponseFunction$0(HandshakeResponse.java:30)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.lambda$createSession$0(ProtocolHandshake.java:126)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:128)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:74)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:136)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat com.kms.katalon.selenium.driver.CChromeDriver.execute(CChromeDriver.java:19)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:213)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:131)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:181)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:147)\r\n\tat com.kms.katalon.selenium.driver.CChromeDriver.\u003cinit\u003e(CChromeDriver.java:13)\r\n\tat com.kms.katalon.core.webui.driver.DriverFactory.createNewChromeDriver(DriverFactory.java:433)\r\n\tat com.kms.katalon.core.webui.driver.DriverFactory.startNewBrowser(DriverFactory.java:366)\r\n\tat com.kms.katalon.core.webui.driver.DriverFactory.openWebDriver(DriverFactory.java:253)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.OpenBrowserKeyword$_openBrowser_closure1.doCall(OpenBrowserKeyword.groovy:74)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.OpenBrowserKeyword$_openBrowser_closure1.call(OpenBrowserKeyword.groovy)\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.runKeyword(WebUIKeywordMain.groovy:20)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.OpenBrowserKeyword.openBrowser(OpenBrowserKeyword.groovy:81)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.OpenBrowserKeyword.execute(OpenBrowserKeyword.groovy:67)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordExecutor.executeKeywordForPlatform(KeywordExecutor.groovy:74)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords.openBrowser(WebUiBuiltInKeywords.groovy:64)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords$openBrowser.call(Unknown Source)\r\n\tat forms.Grad152.GradPage(Grad152.groovy:44)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:48)\r\n\tat cucumber.runtime.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:50)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:65)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:47)\r\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:53)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:47)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:44)\r\n\tat cucumber.runtime.Runtime.runFeature(Runtime.java:120)\r\n\tat cucumber.runtime.Runtime.run(Runtime.java:106)\r\n\tat cucumber.api.cli.Main.run(Main.java:35)\r\n\tat cucumber.api.cli.Main$run.call(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$_runFeatureFile_closure1.doCall(CucumberBuiltinKeywords.groovy:108)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$_runFeatureFile_closure1.doCall(CucumberBuiltinKeywords.groovy)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain.runKeyword(KeywordMain.groovy:74)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain.runKeyword(KeywordMain.groovy:68)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain$runKeyword.call(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords.runFeatureFile(CucumberBuiltinKeywords.groovy:75)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$runFeatureFile$0.callStatic(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords.runFeatureFile(CucumberBuiltinKeywords.groovy:248)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$runFeatureFile.call(Unknown Source)\r\n\tat Script1645551788182.run(Script1645551788182.groovy:20)\r\n\t... 14 more\r\n)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain.stepFailed(KeywordMain.groovy:39)\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.stepFailed(WebUIKeywordMain.groovy:64)\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.runKeyword(WebUIKeywordMain.groovy:26)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.OpenBrowserKeyword.openBrowser(OpenBrowserKeyword.groovy:81)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.OpenBrowserKeyword.execute(OpenBrowserKeyword.groovy:67)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordExecutor.executeKeywordForPlatform(KeywordExecutor.groovy:74)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords.openBrowser(WebUiBuiltInKeywords.groovy:64)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords$openBrowser.call(Unknown Source)\r\n\tat forms.Grad152.GradPage(Grad152.groovy:44)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:48)\r\n\tat cucumber.runtime.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:50)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:65)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:47)\r\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:53)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:47)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:44)\r\n\tat cucumber.runtime.Runtime.runFeature(Runtime.java:120)\r\n\tat cucumber.runtime.Runtime.run(Runtime.java:106)\r\n\tat cucumber.api.cli.Main.run(Main.java:35)\r\n\tat cucumber.api.cli.Main$run.call(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$_runFeatureFile_closure1.doCall(CucumberBuiltinKeywords.groovy:108)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$_runFeatureFile_closure1.doCall(CucumberBuiltinKeywords.groovy)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.codehaus.groovy.reflection.CachedMethod.invoke(CachedMethod.java:98)\r\n\tat groovy.lang.MetaMethod.doMethodInvoke(MetaMethod.java:325)\r\n\tat org.codehaus.groovy.runtime.metaclass.ClosureMetaClass.invokeMethod(ClosureMetaClass.java:264)\r\n\tat groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:1034)\r\n\tat groovy.lang.Closure.call(Closure.java:420)\r\n\tat groovy.lang.Closure.call(Closure.java:414)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain.runKeyword(KeywordMain.groovy:74)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain.runKeyword(KeywordMain.groovy:68)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain$runKeyword.call(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords.runFeatureFile(CucumberBuiltinKeywords.groovy:75)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$runFeatureFile$0.callStatic(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords.runFeatureFile(CucumberBuiltinKeywords.groovy:248)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$runFeatureFile.call(Unknown Source)\r\n\tat Script1645551788182.run(Script1645551788182.groovy:20)\r\n\tat com.kms.katalon.core.main.ScriptEngine.run(ScriptEngine.java:194)\r\n\tat com.kms.katalon.core.main.ScriptEngine.runScriptAsRawText(ScriptEngine.java:119)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.runScript(TestCaseExecutor.java:442)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.doExecute(TestCaseExecutor.java:433)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.processExecutionPhase(TestCaseExecutor.java:412)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.accessMainPhase(TestCaseExecutor.java:404)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.execute(TestCaseExecutor.java:281)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.execute(TestCaseExecutor.java:363)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.accessTestCaseMainPhase(TestSuiteExecutor.java:202)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.accessTestSuiteMainPhase(TestSuiteExecutor.java:164)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.execute(TestSuiteExecutor.java:105)\r\n\tat com.kms.katalon.core.main.TestCaseMain.startTestSuite(TestCaseMain.java:185)\r\n\tat com.kms.katalon.core.main.TestCaseMain$startTestSuite$0.call(Unknown Source)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:47)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:116)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:144)\r\n\tat TempTestSuite1647023840108.run(TempTestSuite1647023840108.groovy:36)\r\n\tat groovy.lang.GroovyShell.runScriptOrMainOrTestOrRunnable(GroovyShell.java:263)\r\n\tat groovy.lang.GroovyShell.run(GroovyShell.java:507)\r\n\tat groovy.lang.GroovyShell.run(GroovyShell.java:496)\r\n\tat groovy.ui.GroovyMain.processOnce(GroovyMain.java:597)\r\n\tat groovy.ui.GroovyMain.run(GroovyMain.java:329)\r\n\tat groovy.ui.GroovyMain.process(GroovyMain.java:315)\r\n\tat groovy.ui.GroovyMain.processArgs(GroovyMain.java:134)\r\n\tat groovy.ui.GroovyMain.main(GroovyMain.java:114)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.codehaus.groovy.tools.GroovyStarter.rootLoader(GroovyStarter.java:116)\r\n\tat org.codehaus.groovy.tools.GroovyStarter.main(GroovyStarter.java:138)\r\nCaused by: com.kms.katalon.core.exception.StepFailedException: Unable to open browser with url: \u0027\u0027\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.stepFailed(WebUIKeywordMain.groovy:64)\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.runKeyword(WebUIKeywordMain.groovy:26)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.OpenBrowserKeyword.openBrowser(OpenBrowserKeyword.groovy:81)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.OpenBrowserKeyword.execute(OpenBrowserKeyword.groovy:67)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordExecutor.executeKeywordForPlatform(KeywordExecutor.groovy:74)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords.openBrowser(WebUiBuiltInKeywords.groovy:64)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords$openBrowser.call(Unknown Source)\r\n\tat forms.Grad152.GradPage(Grad152.groovy:44)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:48)\r\n\tat cucumber.runtime.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:50)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:65)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:47)\r\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:53)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:47)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:44)\r\n\tat cucumber.runtime.Runtime.runFeature(Runtime.java:120)\r\n\tat cucumber.runtime.Runtime.run(Runtime.java:106)\r\n\tat cucumber.api.cli.Main.run(Main.java:35)\r\n\tat cucumber.api.cli.Main$run.call(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$_runFeatureFile_closure1.doCall(CucumberBuiltinKeywords.groovy:108)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$_runFeatureFile_closure1.doCall(CucumberBuiltinKeywords.groovy)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain.runKeyword(KeywordMain.groovy:74)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain.runKeyword(KeywordMain.groovy:68)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain$runKeyword.call(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords.runFeatureFile(CucumberBuiltinKeywords.groovy:75)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$runFeatureFile$0.callStatic(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords.runFeatureFile(CucumberBuiltinKeywords.groovy:248)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$runFeatureFile.call(Unknown Source)\r\n\tat Demo.run(Demo:20)\r\n\tat com.kms.katalon.core.main.ScriptEngine.run(ScriptEngine.java:194)\r\n\tat com.kms.katalon.core.main.ScriptEngine.runScriptAsRawText(ScriptEngine.java:119)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.runScript(TestCaseExecutor.java:442)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.doExecute(TestCaseExecutor.java:433)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.processExecutionPhase(TestCaseExecutor.java:412)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.accessMainPhase(TestCaseExecutor.java:404)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.execute(TestCaseExecutor.java:281)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.execute(TestCaseExecutor.java:363)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.accessTestCaseMainPhase(TestSuiteExecutor.java:202)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.accessTestSuiteMainPhase(TestSuiteExecutor.java:164)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.execute(TestSuiteExecutor.java:105)\r\n\tat com.kms.katalon.core.main.TestCaseMain.startTestSuite(TestCaseMain.java:185)\r\n\tat com.kms.katalon.core.main.TestCaseMain$startTestSuite$0.call(Unknown Source)\r\n\tat TempTestSuite1647023840108.run(TempTestSuite1647023840108.groovy:36)\r\nCaused by: org.openqa.selenium.SessionNotCreatedException: session not created: This version of ChromeDriver only supports Chrome version 97\nCurrent browser version is 99.0.4844.51 with binary path C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:25:53\u0027\nSystem info: host: \u0027L18-0032\u0027, ip: \u002710.0.0.229\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: driver.version: CChromeDriver\nremote stacktrace: Backtrace:\n\tOrdinal0 [0x00CBE713+2549523]\n\tOrdinal0 [0x00C572D1+2126545]\n\tOrdinal0 [0x00B52C88+1059976]\n\tOrdinal0 [0x00B717FA+1185786]\n\tOrdinal0 [0x00B6D655+1168981]\n\tOrdinal0 [0x00B6AE21+1158689]\n\tOrdinal0 [0x00B9BFDF+1359839]\n\tOrdinal0 [0x00B9BC4A+1358922]\n\tOrdinal0 [0x00B97736+1341238]\n\tOrdinal0 [0x00B734E6+1193190]\n\tOrdinal0 [0x00B74376+1196918]\n\tGetHandleVerifier [0x00E59742+1627410]\n\tGetHandleVerifier [0x00F0A93C+2352908]\n\tGetHandleVerifier [0x00D52AE1+551089]\n\tGetHandleVerifier [0x00D51B03+547027]\n\tOrdinal0 [0x00C5CBEE+2149358]\n\tOrdinal0 [0x00C60F18+2166552]\n\tOrdinal0 [0x00C61060+2166880]\n\tOrdinal0 [0x00C6AC60+2206816]\n\tBaseThreadInitThunk [0x75976359+25]\n\tRtlGetAppContainerNamedObjectPath [0x77BC7B74+228]\n\tRtlGetAppContainerNamedObjectPath [0x77BC7B44+180]\n\r\n\tat org.openqa.selenium.remote.W3CHandshakeResponse.lambda$errorHandler$0(W3CHandshakeResponse.java:62)\r\n\tat org.openqa.selenium.remote.HandshakeResponse.lambda$getResponseFunction$0(HandshakeResponse.java:30)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.lambda$createSession$0(ProtocolHandshake.java:126)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:128)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:74)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:136)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat com.kms.katalon.selenium.driver.CChromeDriver.execute(CChromeDriver.java:19)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:213)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:131)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:181)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:147)\r\n\tat com.kms.katalon.selenium.driver.CChromeDriver.\u003cinit\u003e(CChromeDriver.java:13)\r\n\tat com.kms.katalon.core.webui.driver.DriverFactory.createNewChromeDriver(DriverFactory.java:433)\r\n\tat com.kms.katalon.core.webui.driver.DriverFactory.startNewBrowser(DriverFactory.java:366)\r\n\tat com.kms.katalon.core.webui.driver.DriverFactory.openWebDriver(DriverFactory.java:253)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.OpenBrowserKeyword$_openBrowser_closure1.doCall(OpenBrowserKeyword.groovy:74)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.OpenBrowserKeyword$_openBrowser_closure1.call(OpenBrowserKeyword.groovy)\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.runKeyword(WebUIKeywordMain.groovy:20)\r\n\t... 44 more\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I close the virtual popup",
  "keyword": "When "
});
formatter.match({
  "location": "Grad152.closeVirtualPopup()"
});
formatter.result({
  "status": "skipped"
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