#Author: rkeough@babson.edu

@Form @Undergrad
Feature: Form Testing
  Testing of all graduate forms and dropdown options

  @Forms @Undergrad
  Scenario: Submit and Verify Undergrad Form
    Given I am on the entrepreneurial leadership page
    When I close the privacy policy popup
    And I input the first name last name and email
    And I select an entrepreneurial program of interest
    And I enter the phone number
    
    
      
      
      