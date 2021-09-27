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
    And I input the phone number
    And I click Submit
    And I get entrepreneruial request
    Then I delete entreprenurial request

  @Forms @Undergrad @dropdowns
  Scenario: All dropdown options are available
    Given I am on the entrepreneurial leadership page
    When I close the privacy policy popup
    And I click program of interest
    And I select full time mba
    And I click intended term of enrollment
    And I select all options of program of interest for full time mba for entrepreneurial leadership form
    And I click program of interest
    And I select part time mba
    And I click intended term of enrollment
    And I select all options of program of interest for part time mba for entrepreneurial leadership form
    And I click program of interest
    And I select online mba
    And I click intended term of enrollment
    And I select all options of program of interest for online mba for entrepreneurial leadership form
    And I click program of interest
    And I select Master in Entrepreneurial Leadership
    And I click intended term of enrollment
    And I select all options of program of interest for Master in Entrepreneurial Leadership for entrepreneurial leadership form
    And I click program of interest
    And I select Master in Advanced Entrepreneurial Leadership
    And I click intended term of enrollment
    And I select all options of program of interest for Master in Advanced Entrepreneurial Leadership for entrepreneurial leadership form
    And I click program of interest
    And I select Master of Science in Finance
    And I click intended term of enrollment
    And I select all options of program of interest for Master of Science in Finance for entrepreneurial leadership form
    And I click program of interest
    And I select Master of Science in Business Analytics Wellesley
    And I click intended term of enrollment
    And I select all options of program of interest for Master of Science in Business Analytics Wellesley for entrepreneurial leadership form
    And I click program of interest
    And I select Undergraduate Program
    And I click intended term of enrollment
    And I select all options of program of interest for Undergraduate Program for entrepreneurial leadership form
    And I click program of interest
    And I select Master in Undergraduate Program Transfer
    And I click intended term of enrollment
    And I select all options of program of interest for Undergraduate Program Transfer for entrepreneurial leadership form
    And I click program of interest
    And I select Master in Executive Education Open Enrollment Programs
    And I click intended term of enrollment
    And I select all options of program of interest for Executive Education Open Enrollment Programs for entrepreneurial leadership form
    Then I select Executive Education Open Enrollment Programs
