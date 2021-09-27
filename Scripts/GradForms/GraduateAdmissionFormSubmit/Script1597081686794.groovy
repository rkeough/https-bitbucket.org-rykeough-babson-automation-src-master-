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

WebUI.navigateToUrl('https://test-www.babson.edu/admission/graduate-school/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('FormFields/UnderGradSubmit/PrivacyPolicy'))

WebUI.setText(findTestObject('FormFields/inputFirstName'), 'Automation')

WebUI.setText(findTestObject('FormFields/inputLastName'), 'Test')

WebUI.setText(findTestObject('FormFields/inputEmail'), 'babsonTest1@gmail.com')

WebUI.click(findTestObject('FormFields/ProgramOfInterest'))

WebUI.selectOptionByValue(findTestObject('FormFields/ProgramOfInterest'), 'tfa_1208', false)

WebUI.click(findTestObject('FormFields/IntendedTermOfEnrollment'))

WebUI.selectOptionByValue(findTestObject('FormFields/IntendedTermOfEnrollment'), 'tfa_1217', false)

WebUI.setText(findTestObject('FormFields/inputPhoneNumber'), '5555555555')

WebUI.click(findTestObject('FormFields/selectCountry'))

WebUI.selectOptionByValue(findTestObject('FormFields/selectCountry'), 'tfa_1022', false)

WebUI.click(findTestObject('FormFields/selectState'))

WebUI.selectOptionByValue(findTestObject('FormFields/selectState'), 'tfa_748', false)

WebUI.setText(findTestObject('FormFields/inputCity'), 'Babson')

WebUI.setText(findTestObject('FormFields/inputZipCode'), '00000')

WebUI.click(findTestObject('FormFields/clickSubmit'))

WebUI.click(findTestObject('FormFields/TYPrivacyPolicy'))

WebUI.verifyElementText(findTestObject('FormFields/ThankYouText'), 'Thank You')

WebUI.closeBrowser()

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

WebUI.click(findTestObject('FormAssembly/a_Delete'))

WebUI.click(findTestObject('FormAssembly/button_Delete'))

WebUI.closeBrowser()

