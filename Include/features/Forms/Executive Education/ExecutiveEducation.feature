@Form @executiveeducation
Feature: academics/executive-education
  I want to submit and verify form submits with the correct data

  @babsonacademy
  Scenario Outline: Submit executive education form
    Given I am on grad "<gradForm>" page
    And I close the privacy policy popup
    And I input the first and last name on the form
    And I input an email address
    And I input a phone number
    And I input a company
    And I fill out how can we help you field
    And I click the submit button
    And I am on the correct "<thankYou>" page
    And I get the undergrad request
    Then I delete the undergrad record

    Examples: 
      | gradForm                                              | thankYou                                                        |
      | https://www.babson.edu/academics/executive-education/ | https://www.babson.edu/academics/executive-education/thank-you/ |
