@Form @152 @Graduate
Feature: Title of your feature
  I want to use this template for my feature file

  @Grad @152
  Scenario Outline: Submit Grad form
    Given I am on academics grad "<gradForm>" page
    When I close the virutal popup
    And I close the privacy policy popup
    And I input the first name last name and email for grad form
    And I select a program "<program>"
    And I select a term "<term>"
    And I input the grad phone number
    And I select a country
    And I select a state
    And I input a city
    And I input the zip code
    And I click the grad submit button
    Then I am on the correct "<thankYou>" page

    Examples: 
      | gradForm                                          | program  | term     | thankYou                                                                      |
      | https://www.babson.edu/academics/graduate-school/ | tfa_1184 | tfa_1042 | https://www.babson.edu/academics/graduate-school/mba/full-time-mba/thank-you/ |
      | https://www.babson.edu/academics/graduate-school/ | tfa_1184 | tfa_1089 | https://www.babson.edu/academics/graduate-school/mba/full-time-mba/thank-you/ |
