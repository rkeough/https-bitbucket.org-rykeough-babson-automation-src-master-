@Form @executiveeducation
Feature: academics/executive-education
  I want to submit and verify form submits with the correct data

  @executiveeducation
  Scenario Outline: Submit executive education form
    Given I am on grad "<gradForm>" page
    And I close the privacy policy popup
    And I input the first and last name on the form
    And I input an email address
    And I input a phone number
    And I input a company
    And I select an executive program of "<interest>"
    And I click the submit button
    And I am on the correct "<thankYou>" page
 

    Examples: 
      | gradForm                                                                                                                       | interest | thankYou                                                                                                                                  |
      | https://www.babson.edu/academics/executive-education/open-enrollment-programs/executive-entrepreneurial-leadership-certificate | tfa_6    | https://www.babson.edu/academics/executive-education/open-enrollment-programs/executive-entrepreneurial-leadership-certificate/thank-you/ |
      | https://www.babson.edu/academics/executive-education/open-enrollment-programs/executive-entrepreneurial-leadership-certificate | tfa_49   | https://www.babson.edu/academics/executive-education/open-enrollment-programs/executive-entrepreneurial-leadership-certificate/thank-you/ |
      | https://www.babson.edu/academics/executive-education/open-enrollment-programs/executive-entrepreneurial-leadership-certificate | tfa_16   | https://www.babson.edu/academics/executive-education/open-enrollment-programs/executive-entrepreneurial-leadership-certificate/thank-you/ |
      | https://www.babson.edu/academics/executive-education/open-enrollment-programs/executive-entrepreneurial-leadership-certificate | tfa_44   | https://www.babson.edu/academics/executive-education/open-enrollment-programs/executive-entrepreneurial-leadership-certificate/thank-you/ |
      | https://www.babson.edu/academics/executive-education/open-enrollment-programs/executive-entrepreneurial-leadership-certificate | tfa_8    | https://www.babson.edu/academics/executive-education/open-enrollment-programs/executive-entrepreneurial-leadership-certificate/thank-you/ |
      | https://www.babson.edu/academics/executive-education/open-enrollment-programs/executive-entrepreneurial-leadership-certificate | tfa_47   | https://www.babson.edu/academics/executive-education/open-enrollment-programs/executive-entrepreneurial-leadership-certificate/thank-you/ |
      | https://www.babson.edu/academics/executive-education/open-enrollment-programs/executive-entrepreneurial-leadership-certificate | tfa_11   | https://www.babson.edu/academics/executive-education/open-enrollment-programs/executive-entrepreneurial-leadership-certificate/thank-you/ |
      | https://www.babson.edu/academics/executive-education/open-enrollment-programs/executive-entrepreneurial-leadership-certificate | tfa_48   | https://www.babson.edu/academics/executive-education/open-enrollment-programs/executive-entrepreneurial-leadership-certificate/thank-you/ |
      | https://www.babson.edu/academics/executive-education/open-enrollment-programs/executive-entrepreneurial-leadership-certificate | tfa_41   | https://www.babson.edu/academics/executive-education/open-enrollment-programs/executive-entrepreneurial-leadership-certificate/thank-you/ |
      | https://www.babson.edu/academics/executive-education/open-enrollment-programs/executive-entrepreneurial-leadership-certificate | tfa_46   | https://www.babson.edu/academics/executive-education/open-enrollment-programs/executive-entrepreneurial-leadership-certificate/thank-you/ |
      | https://www.babson.edu/academics/executive-education/open-enrollment-programs/executive-entrepreneurial-leadership-certificate | tfa_40   | https://www.babson.edu/academics/executive-education/open-enrollment-programs/executive-entrepreneurial-leadership-certificate/thank-you/ |
      | https://www.babson.edu/academics/executive-education/open-enrollment-programs/executive-entrepreneurial-leadership-certificate | tfa_19   | https://www.babson.edu/academics/executive-education/open-enrollment-programs/executive-entrepreneurial-leadership-certificate/thank-you/ |
      | https://www.babson.edu/academics/executive-education/open-enrollment-programs/executive-entrepreneurial-leadership-certificate | tfa_42   | https://www.babson.edu/academics/executive-education/open-enrollment-programs/executive-entrepreneurial-leadership-certificate/thank-you/ |
      | https://www.babson.edu/academics/executive-education/open-enrollment-programs/executive-entrepreneurial-leadership-certificate | tfa_39   | https://www.babson.edu/academics/executive-education/open-enrollment-programs/executive-entrepreneurial-leadership-certificate/thank-you/ |
      | https://www.babson.edu/academics/executive-education/open-enrollment-programs/executive-entrepreneurial-leadership-certificate | tfa_10   | https://www.babson.edu/academics/executive-education/open-enrollment-programs/executive-entrepreneurial-leadership-certificate/thank-you/ |
      | https://www.babson.edu/academics/executive-education/open-enrollment-programs/executive-entrepreneurial-leadership-certificate | tfa_13   | https://www.babson.edu/academics/executive-education/open-enrollment-programs/executive-entrepreneurial-leadership-certificate/thank-you/ |
