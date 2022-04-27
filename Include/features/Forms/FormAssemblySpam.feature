@FormAssembly
Feature: Update third party spam on Form Assembly
  I want to change the third party spam box so automation can run

  @FormAssembly
  Scenario: Check the third party spam box
    Given I log into Form Assembly
    When I search for the form Id
    And I click the list of requests
    And I click the Summary tab
    And I click the Processing tab
    And I click the spam box
    Then I click the Apply button
