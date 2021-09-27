#Author: rkeough@babson.edu
@FormRegress
Feature: Form Testing
  Testing of all graduate forms and dropdown options

  @Forms @Graduate @Submit @152 @Regression
  Scenario: Submit and Verify Graduate Form
    Given I am on graduate admission page
    When I close the privacy policy popup
    And I input the first name last name and email
    And I select a program of interest for grad
    And I select an intended term of enrollment
    And I enter the phone number
    And I select a country and state
    And I enter a city and zip code
    And I click submit
    And I am taken to the thank you page
    And I open Form Assembly Grad Form
    And the text in each form assembly field matches what was entered
    Then I delete the record on form assembly
