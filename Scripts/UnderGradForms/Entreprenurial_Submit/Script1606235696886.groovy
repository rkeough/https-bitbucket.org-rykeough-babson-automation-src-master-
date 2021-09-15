import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://test-www.babson.edu/business-programs-wes/entrepreneurial-leadership-development-programs/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('FormFields/inputFirstName'), 'Katalon')

WebUI.setText(findTestObject('FormFields/inputLastName'), 'Automation')

WebUI.setText(findTestObject('FormFields/inputEmail'), 'aaa@babson.edu')

WebUI.click(findTestObject('FormFields/ProgramOfInterest'))

WebUI.selectOptionByValue(findTestObject('FormFields/ProgramOfInterest'), 'tfa_1142', false)

WebUI.click(findTestObject('FormFields/IntendedTermOfEnrollment'))

WebUI.selectOptionByValue(findTestObject('FormFields/IntendedTermOfEnrollment'), 'tfa_1407', false)

WebUI.setText(findTestObject('FormFields/inputDateofBirth'), '01/01/2001')

WebUI.setText(findTestObject('FormFields/inputPhoneNumber'), '5555555555')

WebUI.click(findTestObject('FormFields/clickSubmit'))

WS.sendRequest(findTestObject('FormFields/UnderGradGet'))

WS.sendRequest(findTestObject('FormFields/UnderGradDelete'))

WebUI.closeBrowser()

