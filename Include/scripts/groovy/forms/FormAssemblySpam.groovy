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



class FormAssemblySpam {

	@Given("I log into Form Assembly")
	public void LogIntoFormAssembly () {
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.navigateToUrl('https://babson.tfaforms.net/')
		WebUI.setText(findTestObject('Object Repository/SpamFA/input_Username or Email_dataUserusername'), 'digitalsupport@babson.edu')
		WebUI.setEncryptedText(findTestObject('Object Repository/SpamFA/input_Show_dataUserpassword'), 'JNHshaFIsvHCWCGTc4ftx3niQhp2cMsn')
		WebUI.click(findTestObject('Object Repository/SpamFA/button_Log In'))
	}

	@When("I search for the form Id")
	public void SearchForForm() {
		WebUI.setText(findTestObject('Object Repository/SpamFA/input_Search_D5Gfqd4ssQ'), '152')
	}

	@When("I click the list of requests")
	public void ClickRequests() {
		WebUI.click(findTestObject('Object Repository/SpamFA/a_10,484 Completed  6,150 Incomplete  10,20_ee0309'))
	}

	@When("I click the Summary tab")
	public void ClickSummaryTab() {
		WebUI.click(findTestObject('Object Repository/SpamFA/span_Summary'))
	}

	@When("I click the Processing tab")
	public void ClickProcessingTab() {
		WebUI.click(findTestObject('Object Repository/SpamFA/span_Processing'))
	}
	@When("I click the spam box")
	public void ClickSpamBox() {
		WebUI.click(findTestObject('Object Repository/SpamFA/input_Use Google reCAPTCHA (a challenge tha_d7b3d0'))
	}

	@When("I click the Apply button")
	public void ClickApplyButton() {
		WebUI.click(findTestObject('Object Repository/SpamFA/input_This custom message which will be dis_9a4b08'))
		WebUI.delay(2)
		WebUI.closeBrowser()
	}
}