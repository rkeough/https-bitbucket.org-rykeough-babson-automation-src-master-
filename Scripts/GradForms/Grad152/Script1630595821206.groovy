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
import com.thoughtworks.selenium.webdriven.commands.SelectOption as SelectOption
import com.sun.org.apache.bcel.internal.generic.Select as Select
import com.kms.katalon.core.webui.keyword.builtin.SelectOptionByIndexKeyword as SelectOptionByIndexKeyword
import java.lang.String as String


WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('www.babson.edu')

WebUI.navigateToUrl('gradForm')

WebUI.click(findTestObject('Object Repository/XXXXXX/button_CLOSE'))

WebUI.setText(findTestObject('FormFields/inputFirstName'), 'Test')

WebUI.setText(findTestObject('FormFields/inputLastName'), 'erxtest')

WebUI.setText(findTestObject('FormFields/inputEmail'), 'larry21@babson-test.com')

WebUI.selectOptionByValue(findTestObject('FormFields/Grad152/selectPOI'), program, false)

WebUI.selectOptionByValue(findTestObject('FormFields/Grad152/selectTOE'), term, false)

WebUI.setText(findTestObject('FormFields/inputPhoneNumber'), '1011010111')

WebUI.selectOptionByLabel(findTestObject('FormFields/selectCountry'), 'Barbados', false)

WebUI.setText(findTestObject('Object Repository/XXXXXX/input_StateProvince_tfa_18'), 'TestState')

WebUI.setText(findTestObject('Object Repository/XXXXXX/input_City_tfa_17'), 'TestCity')

WebUI.setText(findTestObject('FormFields/PostalCode'), '11111')

WebUI.click(findTestObject('FormFields/clickSubmit'))

WebUI.getUrl()

WebUI.closeBrowser()

WS.sendRequest(findTestObject('FormFields/SubmitForm'))

WebUI.delay(2)

WS.sendRequest(findTestObject('FormFields/DeleteForm'))

