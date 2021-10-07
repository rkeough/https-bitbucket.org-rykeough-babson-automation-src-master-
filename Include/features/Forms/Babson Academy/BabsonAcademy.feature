@Form @babsonacademy
Feature: academics/babson-academy
  I want to submit and verify form submits with the correct data

  @babsonacademy
  Scenario Outline: Submit Babson Academy form
    Given I am on grad "<gradForm>" page
    And I close the privacy policy popup
    And I input the first and last name on the form
    And I input an email address
    And I input an organization
    And I input a title
    And I input a phone number
    And I select a country
    And I fill out how can we help you field
    And I click the submit button
    And I am on the correct "<thankYou>" page
    And I get the undergrad request
    Then I delete the undergrad record

    Examples: 
      | gradForm                                         | thankYou                                                   |
      | https://www.babson.edu/academics/babson-academy/ | https://www.babson.edu/academics/babson-academy/thank-you/ |

  @babsonacademy
  Scenario Outline: Submit babson-academy
    Given I am on grad "<gradForm>" page
    When I input the first and last name on the form
    And I input an Institution
    And I input a title
    And I input an email address
    And I click the submit button
    And I am on the correct "<thankYou>" page
    And I get the undergrad request
    Then I delete the undergrad record

    Examples: 
      | gradForm                                                                                                                          | thankYou                                                                                                                                    |
      | https://www.babson.edu/academics/babson-academy/babson-academy-webinars/2021-cracking-the-code-in-sales-education/                | https://www.babson.edu/academics/babson-academy/babson-academy-webinars/2021-cracking-the-code-in-sales-education/thank-you/                |
      | https://www.babson.edu/academics/babson-academy/babson-academy-webinars/2020-dec-inclusion-gender-race--class-in-entrepreneurship | https://www.babson.edu/academics/babson-academy/babson-academy-webinars/2020-dec-inclusion-gender-race--class-in-entrepreneurship/thank-you |
      | https://www.babson.edu/academics/babson-academy/babson-academy-webinars/2020-nov-we-are-all-innovators-now/                       | https://www.babson.edu/academics/babson-academy/babson-academy-webinars/2020-nov-we-are-all-innovators-now/thank-you/                       |
      | https://www.babson.edu/academics/babson-academy/babson-academy-webinars/2021-cracking-the-code-in-sales-education/                | https://www.babson.edu/academics/babson-academy/babson-academy-webinars/2021-cracking-the-code-in-sales-education/thank-you                 |
      | https://www.babson.edu/academics/babson-academy/babson-academy-webinars/2021-when-is-an-idea-an-opportunity/                      | https://www.babson.edu/academics/babson-academy/babson-academy-webinars/2021-when-is-an-idea-an-opportunity/thank-you/                      |
      | https://www.babson.edu/academics/babson-academy/babson-academy-webinars/recognizing-and-refining-your-video-voice-potential/      | https://www.babson.edu/academics/babson-academy/babson-academy-webinars/recognizing-and-refining-your-video-voice-potential/thank-you/      |
      | https://www.babson.edu/academics/babson-academy/student-programs/babson-build/                                                    | https://www.babson.edu/academics/babson-academy/student-programs/babson-build/thank-you/                                                    |

  @babsonacademy
  Scenario Outline: Submit babson-academy/babson-academy
    Given I am on grad "<gradForm>" page
    When I input the first and last name on the form
    And I select a country
    And I input an email address
    And I input an Institution
    And I click the submit button
    And I am on the correct "<thankYou>" page
    And I get the undergrad request
    Then I delete the undergrad record

    Examples: 
      | gradForm                                                                                               | thankYou                                                                                                         |
      | https://www.babson.edu/academics/babson-academy/babson-academy-webinars/                               | https://www.babson.edu/academics/babson-academy/babson-academy-webinars/thank-you                                |
      | https://www.babson.edu/academics/babson-academy/building-an-entrepreneurship-education-ecosystem/      | https://www.babson.edu/academics/babson-academy/building-an-entrepreneurship-education-ecosystem/thank-you/      |
      | https://www.babson.edu/academics/babson-academy/price-babson-symposium-for-entrepreneurship-educators/ | https://www.babson.edu/academics/babson-academy/price-babson-symposium-for-entrepreneurship-educators/thank-you/ |
      | https://www.babson.edu/academics/babson-academy/the-babson-collaborative/                              | https://www.babson.edu/academics/babson-academy/the-babson-collaborative/thank-you/                              |

  @babsonacademy
  Scenario Outline: Submit babson-academy
    Given I am on grad "<gradForm>" page
    When I input the first and last name on the form
    And I input an Institution
    And I input a title
    And I input a preferred email address
    And I click the submit button
    And I am on the correct "<thankYou>" page
    And I get the undergrad request
    Then I delete the undergrad record

    Examples: 
      | gradForm                                                                                        | thankYou                                                                                                   |
      | https://www.babson.edu/academics/babson-academy/student-programs/babson-build/brochure-download | https://www.babson.edu/academics/babson-academy/student-programs/babson-build/brochure-download/thank-you/ |
