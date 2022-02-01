Form @152 @Graduate
Feature: academics/graduate-school
  I want to submit and verify form submits with the correct data

  @Grad @152
  Scenario Outline: Submit Grad form
    Given I am on grad "<gradForm>" page
    When I close the virtual popup
    And I close the privacy policy popup
    And I input the first and last name on the form
    And I input an email address
    And I select a program "<program>"
    And I select a term "<term>"
    And I input a phone number
    And I select a country
    And I select a state
    And I input a city
    And I input the zip code
    And I click the submit button
    Then I am on the correct "<thankYou>" page

    Examples: 
      | gradForm                                          | program  | term     | thankYou                                                                      |
      | https://www.babson.edu/academics/graduate-school/ | tfa_1184 | tfa_1042 | https://www.babson.edu/academics/graduate-school/mba/full-time-mba/thank-you/ |
      | https://www.babson.edu/academics/graduate-school/ | tfa_1184 | tfa_1089 | https://www.babson.edu/academics/graduate-school/mba/full-time-mba/thank-you/ |