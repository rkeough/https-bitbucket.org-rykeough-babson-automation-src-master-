#Author: rkeough@babson.edu
@Forms
Feature: Form Testing
  Testing of all forms and dropdown options

  @Forms @Graduate @MBA
  Scenario: Submit and Verify Graduate Form
    Given I am on graduate admission page
    When I close the privacy policy popup
    And I input the first name last name email phone number and zipcode fields on the form
    And I select a program of interest
    And I select an intended term of enrollment
    And I select a country and state
    And I click submit
    And I am taken to the thank you page
    And I open Form Assembly
    And open the form details
    Then the text in each form assembly field matches what was entered