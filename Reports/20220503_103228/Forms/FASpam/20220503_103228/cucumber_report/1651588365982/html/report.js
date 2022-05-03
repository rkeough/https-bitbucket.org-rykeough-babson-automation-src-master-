$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/rkeough/git/babson-automation/Include/features/Forms/FormAssemblySpam.feature");
formatter.feature({
  "name": "Update third party spam on Form Assembly",
  "description": "  I want to change the third party spam box so automation can run",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@FormAssembly"
    }
  ]
});
formatter.scenario({
  "name": "Check the third party spam box",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@FormAssembly"
    },
    {
      "name": "@FormAssembly"
    }
  ]
});
formatter.step({
  "name": "I log into Form Assembly",
  "keyword": "Given "
});
formatter.match({
  "location": "FormAssemblySpam.LogIntoFormAssembly()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click the spam box",
  "keyword": "And "
});
formatter.match({
  "location": "FormAssemblySpam.ClickSpamBox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click the Apply button",
  "keyword": "Then "
});
formatter.match({
  "location": "FormAssemblySpam.ClickApplyButton()"
});
formatter.result({
  "status": "passed"
});
});