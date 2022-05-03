@Form @152 @Graduate
Feature: academics/graduate-school
  I want to submit and verify form submits with the correct data

  @Grad @152
  Scenario Outline: Submit Grad form
    Given I am on the homepage
    When I am on grad "<gradForm>" page
    And I input the first and last name on the form
    And I input an email address
    And I select a program "<program>"
    And I select a term "<term>"
    And I input a phone number
    And I select a country
    And I input a state
    And I input a city
    And I input the postal code
    And I click the submit button
    And I am on the correct "<thankYou>" page
    And I get the submit request
    Then I delete the form record

    Examples: 
      | gradForm                                              | program  | term     | thankYou                                                                      |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1184 | tfa_1042 | https://www.babson.edu/academics/graduate-school/mba/full-time-mba/thank-you/ |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1184 | tfa_1089 | https://www.babson.edu/academics/graduate-school/mba/full-time-mba/thank-you/ |

