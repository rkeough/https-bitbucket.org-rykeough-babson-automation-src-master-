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

WebUI.navigateToUrl('https://test-www.babson.edu/admission/undergraduate-school/')

WebUI.click(findTestObject('FormFields/UnderGradSubmit/PrivacyPolicy'))

WebUI.setText(findTestObject('FormFields/UnderGradSubmit/FirstNameAdmissionUndergrad'), 'Katalon')

WebUI.setText(findTestObject('FormFields/UnderGradSubmit/LastNameAdmissionUndergrad'), 'Automation')

WebUI.selectOptionByValue(findTestObject('FormFields/UnderGradSubmit/UnderGradBirthMonth'), '01', false)

WebUI.selectOptionByValue(findTestObject('FormFields/UnderGradSubmit/UnderGradBirthDay'), '08', false)

WebUI.selectOptionByValue(findTestObject('FormFields/UnderGradSubmit/UnderGradBirthYear'), '2006', false)

WebUI.setText(findTestObject('FormFields/UnderGradSubmit/EmailAdmissionUnderGrad'), 'babsonTest1@gmail.com')

WebUI.setText(findTestObject('FormFields/UnderGradSubmit/PhoneAdmissionUnderGrad'), '+1 555-555-5555')

WebUI.selectOptionByValue(findTestObject('FormFields/UnderGradSubmit/ProgramAdmissionUnderGrad'), '60ce2caf-d530-460d-8ef5-06e2d05268b4', 
    true)

WebUI.selectOptionByValue(findTestObject('FormFields/UnderGradSubmit/TermAdmissionUnderGrad'), '21ec9983-1e8b-4338-ad8a-0f5a7079440b', 
    true)

WebUI.click(findTestObject('FormFields/UnderGradSubmit/button_Submit'))

WebUI.click(findTestObject('FormFields/TYPrivacyPolicy'))

WS.sendRequest(findTestObject('FormFields/UnderGradGet'))

WS.sendRequest(findTestObject('FormFields/UnderGradDelete'))

