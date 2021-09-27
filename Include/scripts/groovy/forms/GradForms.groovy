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
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class GradForms {

	@Given("I am on graduate admission page")
	def IAmOnGraduateAdmissionPage() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://test-www.babson.edu/admission/graduate-school/')
		WebUI.maximizeWindow()
	}

	@When("I select a program of interest for grad")
	def SelectAProgramOfInterestForGrad() {
		WebUI.click(findTestObject('SubmitGradAdmissionForm/ProgramOfInterest'))
		WebUI.selectOptionByValue(findTestObject('SubmitGradAdmissionForm/ProgramOfInterest'), 'tfa_1208', false)
	}
	@When("I select an intended term of enrollment")
	def SelectAnIntendedTermOfEnrollment() {
		WebUI.click(findTestObject('SubmitGradAdmissionForm/IntendedTermOfEnrollment'))

		WebUI.selectOptionByValue(findTestObject('SubmitGradAdmissionForm/IntendedTermOfEnrollment'), 'tfa_1217', false)
	}
	@When("I select a country and state")
	def SelectACountryAndState() {
		WebUI.click(findTestObject('SubmitGradAdmissionForm/selectCountry'))

		WebUI.selectOptionByValue(findTestObject('SubmitGradAdmissionForm/selectCountry'), 'tfa_1022', false)

		WebUI.click(findTestObject('SubmitGradAdmissionForm/selectState'))

		WebUI.selectOptionByValue(findTestObject('SubmitGradAdmissionForm/selectState'), 'tfa_748', false)
	}
	@When("I enter a city and zip code")
	def EnterACityAndZipCode() {
		WebUI.setText(findTestObject('SubmitGradAdmissionForm/inputCity'), 'Babson')

		WebUI.setText(findTestObject('SubmitGradAdmissionForm/inputZipCode'), '00000')
	}
	@When("I click submit")
	def ClickSubmit() {
		WebUI.click(findTestObject('SubmitGradAdmissionForm/clickSubmit'))
	}
	@When("I am taken to the thank you page")
	def IAmTakenToTheThankYouPage() {
		WebUI.verifyElementText(findTestObject('SubmitGradAdmissionForm/ThankYouText'), 'Thank You')

		WebUI.closeBrowser()
	}
	@When("I open Form Assembly Grad Form")
	def OpenFormAssembly() {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://babson.tfaforms.net/reports/view/152')

		WebUI.maximizeWindow()
		WebUI.setText(findTestObject('FormAssembly/input_Username or Email_dataUserusername'),
				'rkeough@babson.edu')

		WebUI.setEncryptedText(findTestObject('FormAssembly/input_Show_dataUserpassword'),
				'GnaSFrYIDO8GMIhAnn2iDQ==')
		WebUI.click(findTestObject('FormAssembly/FALoginSubmit'))

		WebUI.click(findTestObject('FormAssembly/FARecord'))

		WebUI.switchToWindowTitle('FormAssembly Enterprise | Babson College : Responses')
	}

	@When("the text in each form assembly field matches what was entered")
	def TheTextInFormAssemblyMatchesEntries() {
		WebUI.verifyElementPresent(findTestObject('FormAssembly/div_Automation'),
				0)

		WebUI.verifyElementPresent(findTestObject('FormAssembly/div_Test'),
				0)

		WebUI.verifyElementPresent(findTestObject('FormAssembly/div_babsonTest1gmailcom'),
				0)

		WebUI.verifyElementPresent(findTestObject('FormAssembly/div_One-Year MBA'),
				0)

		WebUI.verifyElementPresent(findTestObject('FormAssembly/div_Summer 2021'),
				0)

		WebUI.verifyElementPresent(findTestObject('FormAssembly/div_5555555555'),
				0)

		WebUI.verifyElementPresent(findTestObject('FormAssembly/div_United States'),
				0)

		WebUI.verifyElementPresent(findTestObject('FormAssembly/div_Babson'),
				0)

		WebUI.verifyElementPresent(findTestObject('FormAssembly/div_00000'),
				0)
	}
	@When("I delete the record on form assembly")
	def DeleteRecordOnFormAssembly() {
		WebUI.click(findTestObject('FormAssembly/a_Delete'))

		WebUI.click(findTestObject('FormAssembly/button_Delete'))

		WebUI.closeBrowser()
	}
}