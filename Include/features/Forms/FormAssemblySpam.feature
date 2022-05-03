@FormAssembly
Feature: Update third party spam on Form Assembly
  I want to change the third party spam box so automation can run

  @FormAssembly
  Scenario: Check the third party spam box
    Given I log into Form Assembly
    And I click the spam box
    Then I click the Apply button
