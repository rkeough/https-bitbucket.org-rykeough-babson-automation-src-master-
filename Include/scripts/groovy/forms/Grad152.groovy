package forms
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.sun.org.apache.bcel.internal.generic.Select
import internal.GlobalVariable
import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty
import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.When
import cucumber.api.java.en.Then


class Grad152 {

	@Given("I am on grad {string} page")
	public void GradPage(String gradForm) {
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.navigateToUrl(gradForm)
	}

	@When("I close the virtual popup")
	public void closeVirtualPopup() {
		WebUI.click(findTestObject('FormFields/Grad152/virtualPopUp'))
	}

	@When("I input the first and last name on the form")
	public void FirstLastName() {
		WebUI.setText(findTestObject('FormFields/inputFirstName'), 'Katalon')
		WebUI.setText(findTestObject('FormFields/inputLastName'), 'Automation')
	}
	@When("I input an email address")
	public void inputEmail() {
		WebUI.setText(findTestObject('FormFields/inputEmail'), 'babsonTest1@gmail.com')
	}

	@When("I select a program {string}")
	public void SelectAProgramOfInterest(String program) {
		WebUI.selectOptionByValue(findTestObject('FormFields/Grad152/selectPOI'), program, false)
	}

	@When("I select a term {string}")
	public void SelectATermOfEnrollment(String term) {
		WebUI.selectOptionByValue(findTestObject('FormFields/Grad152/selectTOE'), term, false)
	}

	@When("I input a phone number")
	public void inputPhoneNumber() {
		WebUI.setText(findTestObject('FormFields/inputPhoneNumber'), '0000000000')
	}

	@When("I select a country")
	def SelectACountry() {
		WebUI.selectOptionByLabel(findTestObject('FormFields/selectCountry'), 'United States', false)
	}

	@When("I select a state")
	public void selectState() {
		WebUI.selectOptionByValue(findTestObject('FormFields/selectState'), 'tfa_748', false)
	}

	@When("I input a city")
	public void inputCity() {
		WebUI.setText(findTestObject('FormFields/gradCity'), 'Wellesley')
	}

	@Then("I input the zip code")
	public void inputZipZode() {
		WebUI.setText(findTestObject('FormFields/gradZipCode'), '00000')
	}

	@When("I click the submit button")
	public void clickSubmit() {
		WebUI.click(findTestObject('FormFields/clickSubmit'))
	}

	@Then("I am on the correct {string} page")
	public void thankYouPage(String thankYou) {
		def tyurl = WebUI.getUrl()
		WebUI.verifyEqual(tyurl, thankYou)
		WebUI.closeBrowser()
	}
}