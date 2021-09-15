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

WebUI.navigateToUrl('https://www.babson.edu/academics/executive-education/open-enrollment-programs/the-entrepreneurial-family/')

WebUI.click(findTestObject('Object Repository/Page_The Entrepreneurial Family  Babson College/a_X - CLOSE THIS WINDOW'))

WebUI.setText(findTestObject('Object Repository/Page_The Entrepreneurial Family  Babson College/input_First Name_tfa_1'), 
    'Katalon')

WebUI.setText(findTestObject('Object Repository/Page_The Entrepreneurial Family  Babson College/input_Last Name_tfa_2'), 
    'Test')

WebUI.setText(findTestObject('Object Repository/Page_The Entrepreneurial Family  Babson College/input_Company_tfa_3'), 'Babson')

WebUI.setText(findTestObject('Object Repository/Page_The Entrepreneurial Family  Babson College/input_Work Email Address_tfa_4'), 
    'babstontest1@babson.edu')

WebUI.click(findTestObject('Object Repository/Page_The Entrepreneurial Family  Babson College/div_reCAPTCHA_recaptcha-checkbox-border'))

WebUI.closeBrowser()

