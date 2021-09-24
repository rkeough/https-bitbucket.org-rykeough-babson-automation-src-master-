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
import GradForms
import Grad152
import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.When
import cucumber.api.java.en.Then

class UnderGradAdmissionSubmit {

	@Given("I am on the undergraduate admission page")
	def UndergradeAdmissionPage(){
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.navigateToUrl('https://test-www.babson.edu/admission/undergraduate-school/')
	}

	@When("I close the privacy policy popup")
	def CloseThePrivacyPopUP() {
		WebUI.click(findTestObject('FormFields/UnderGradSubmit/PrivacyPolicy'))
	}

	@When("I input the first name last name and email")
	def InputFirstNameLastNameAndEmail(){
		WebUI.setText(findTestObject('FormFields/UnderGradSubmit/FirstNameAdmissionUndergrad'), 'Katalon')
		WebUI.setText(findTestObject('FormFields/UnderGradSubmit/LastNameAdmissionUndergrad'), 'Automation')
		WebUI.setText(findTestObject('FormFields/UnderGradSubmit/EmailAdmissionUnderGrad'), 'babsonTest1@gmail.com')
	}

	@When("I select the birth month date and year")
	def EnterDateOfBirth(){
		WebUI.selectOptionByValue(findTestObject('FormFields/UnderGradSubmit/UnderGradBirthMonth'), '01',
				false)
		WebUI.selectOptionByValue(findTestObject('FormFields/UnderGradSubmit/UnderGradBirthDay'), '08',
				false)
		WebUI.selectOptionByValue(findTestObject('FormFields/UnderGradSubmit/UnderGradBirthYear'), '2006',
				false)
	}

	@When("I input the undergrad phone number")
	def InputThePhoneNumber() {
		WebUI.setText(findTestObject('FormFields/UnderGradSubmit/PhoneAdmissionUnderGrad'), '+1 555-555-5555')
	}

	@When("I select an admission program of interest")
	def SelectAnAdmissionProgramOfInterest(){
		WebUI.selectOptionByValue(findTestObject('FormFields/UnderGradSubmit/ProgramAdmissionUnderGrad'), '60ce2caf-d530-460d-8ef5-06e2d05268b4',
				true)
	}

	@When("I select an admission Term")
	def SelectanAdmissionTerm(){
		WebUI.selectOptionByValue(findTestObject('FormFields/UnderGradSubmit/TermAdmissionUnderGrad'), '21ec9983-1e8b-4338-ad8a-0f5a7079440b',
				true)
	}

	@When("I click Submit on the Undergrad Admission form")
	def ClickSubmitOnTheUndergradAdmissionForm(){
		WebUI.click(findTestObject('FormFields/UnderGradSubmit/button_Submit'))
	}

	@When("I verify I am on the UnderGrad Admission Thank You page")
	def UnderGradAdmissionThankYouPage(){
		WebUI.getUrl()
	}

	@When("I get the undergrad request")
	def RequestUndergrad(){
		WS.sendRequest(findTestObject('FormFields/UnderGradGet'))
	}

	@When("I delete the undergrad record")
	def DeleteUndergrad(){
		WS.sendRequest(findTestObject('FormFields/UnderGradDelete'))
	}
}
