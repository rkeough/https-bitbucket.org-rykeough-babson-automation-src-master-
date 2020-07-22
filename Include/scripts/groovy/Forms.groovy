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



class Forms {
	@Given("I am on graduate admission page")
	def IAmOnGraduateAdmissionPage() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://test-www.babson.edu/admission/graduate-school/')
		WebUI.maximizeWindow()
	}

	@When("I close the privacy policy popup")
	def CloseThePrivacyPolicyPopup() {
		WebUI.click(findTestObject('SubmitGradAdmissionForm/PrivacyPolicy'))
	}

	@When("I input the first name last name email phone number and zipcode fields on the form")
	def InputTheTextFieldsOnGradAdmissionForm() {
		WebUI.setText(findTestObject('SubmitGradAdmissionForm/inputFirstName'), 'Automation')
		WebUI.setText(findTestObject('SubmitGradAdmissionForm/inputLastName'), 'Test')
		WebUI.setText(findTestObject('SubmitGradAdmissionForm/inputEmail'), 'babsonTest1@gmail.com')
		WebUI.setText(findTestObject('SubmitGradAdmissionForm/inputPhoneNumber'), '5555555555')
		WebUI.setText(findTestObject('SubmitGradAdmissionForm/inputCity'), 'Babson')
		WebUI.setText(findTestObject('SubmitGradAdmissionForm/inputZipCode'), '00000')
	}

	@When("I select a program of interest")
	def SelectAProgramOfInterest() {
		WebUI.click(findTestObject('SubmitGradAdmissionForm/ProgramOfInterest'))
		WebUI.selectOptionByValue(findTestObject('SubmitGradAdmissionForm/ProgramOfInterest'), 'tfa_1208', false)
	}

	@When("I select an intended term of enrollment")
	def SelectAnIntendedTermOfEnrollment() {
		WebUI.click(findTestObject('SubmitGradAdmissionForm/IntendedTermOfEnrollment'))
		WebUI.selectOptionByValue(findTestObject('SubmitGradAdmissionForm/IntendedTermOfEnrollment'), 'tfa_1217', false)
	}

	@When("I select a country and state")
	def SelectACountry() {
		WebUI.click(findTestObject('SubmitGradAdmissionForm/selectCountry'))
		WebUI.selectOptionByValue(findTestObject('SubmitGradAdmissionForm/selectCountry'), 'tfa_1022', false)
		WebUI.click(findTestObject('SubmitGradAdmissionForm/selectState'))
		WebUI.selectOptionByValue(findTestObject('SubmitGradAdmissionForm/selectState'), 'tfa_748', false)
	}

	@When("I click submit")
	def ClickSubmit() {
		WebUI.click(findTestObject('SubmitGradAdmissionForm/clickSubmit'))
	}

	@When("I am taken to the thank you page")
	def GradAdmissionThankYouPage() {
		WebUI.click(findTestObject('SubmitGradAdmissionForm/TYPrivacyPolicy'))
		WebUI.verifyElementText(findTestObject('SubmitGradAdmissionForm/ThankYouText'), 'Thank You')
		WebUI.closeBrowser()
	}
	@When("I open Form Assembly")
	def OpenFormAssembly() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://babson.tfaforms.net/users/login')
		WebUI.maximizeWindow()
		WebUI.setText(findTestObject('Object Repository/FormAssembly/inpuyFAEmail'), 'rkeough@babson.edu')
		WebUI.setEncryptedText(findTestObject('Object Repository/FormAssembly/inputFAPassword'), 'GnaSFrYIDO8GMIhAnn2iDQ==')
		WebUI.click(findTestObject('Object Repository/FormAssembly/FALoginButton'))
	}

	@When("open the form details")
	def openTheFormDetails() {
		WebUI.click(findTestObject('Object Repository/FormAssembly/Form152Entries'))
	}

	@Then("the text in each form assembly field matches what was entered")
	def TextinFAMatchForm() {
		WebUI.click(findTestObject('Object Repository/FormAssembly/SelectEntry'))
		WebUI.switchToWindowTitle('FormAssembly Enterprise | Babson College : Responses')
		WebUI.verifyTextPresent('Automation', false)
		WebUI.verifyTextPresent('Test', false)
		WebUI.verifyTextPresent('babsonTest1@gmail.com', false)
		WebUI.verifyTextPresent('Online MBA', false)
		WebUI.verifyTextPresent('Fall 2021', false)
		WebUI.verifyTextPresent('5555555555', false)
		WebUI.verifyTextPresent('United States', false)
		WebUI.verifyTextPresent('Massachusetts', false)
		WebUI.verifyTextPresent('Babson', false)
		WebUI.verifyTextPresent('00000', false)
		WebUI.closeBrowser()
	
	}
}