@undergrad
Feature: admission/undergraduate-school/
  I want to fill out and submit the form on the admission/undergraduate-school URL, click submit, verify the correct Thank You page is returned,
   and the result is recorded in the database and removed

  @form @undergrad @undergradadmission 
  Scenario: admission/undergraduate/school form submit
    Given I am on the undergraduate admission page
    When I close the privacy policy popup
    And I input the first name last name and email
    And I select the birth month date and year
    And I input the undergad phone number
    And I select an admission program of interest
    And I select an admission Term
    And I click Submit on the Undergrad Admission form
    And I verify I am on the UnderGrad Admission Thank You page
    And I get the undergrad request
    Then I delete the undergrad record
