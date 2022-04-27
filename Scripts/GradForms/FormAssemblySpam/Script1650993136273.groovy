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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://babson.tfaforms.net/')

WebUI.setText(findTestObject('Object Repository/SpamFA/input_Username or Email_dataUserusername'), 'digitalsupport@babson.edu')

WebUI.setEncryptedText(findTestObject('Object Repository/SpamFA/input_Show_dataUserpassword'), 'JNHshaFIsvHCWCGTc4ftx3niQhp2cMsn')

WebUI.click(findTestObject('Object Repository/SpamFA/button_Log In'))

WebUI.setText(findTestObject('Object Repository/SpamFA/input_Search_D5Gfqd4ssQ'), '152')

WebUI.click(findTestObject('Object Repository/SpamFA/a_10,484 Completed  6,150 Incomplete  10,20_ee0309'))

WebUI.click(findTestObject('Object Repository/SpamFA/span_Summary'))

WebUI.click(findTestObject('Object Repository/SpamFA/span_Processing'))

WebUI.click(findTestObject('Object Repository/SpamFA/input_Use Google reCAPTCHA (a challenge tha_d7b3d0'))

WebUI.click(findTestObject('Object Repository/SpamFA/input_This custom message which will be dis_9a4b08'))

WebUI.closeBrowser()

