@FormAssembly
Feature: Update check box to remove captcha on form
  I want to change the third party spam box so automation can run

  @FormAssembly
  Scenario: Check the captcha box
    Given I log into Form Assembly
    And I click captcha box
    Then I click the Apply button
