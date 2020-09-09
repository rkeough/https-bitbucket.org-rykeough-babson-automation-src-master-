#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Forms @Dropdowns
Feature: Dropdown options on forms
  I want to verify the correct dropdown options match with various scenarios

  @tag1
  Scenario Outline: The dropdown on the Entrepreneural form are shown correctly
    Given I am on the entreprenural form
    When I click <interest>
    Then I verify the <options> are available

    Examples: 
      | form | interest | options  |
      | entrepreneural |     Undergrad | Fall2024 |
      | name2 |     7 | Fail    |