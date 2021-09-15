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

WebUI.navigateToUrl('https://test-www.babson.edu/about/entrepreneurial-leadership-development-programs/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('FormFields/UnderGradSubmit/PrivacyPolicy'))

WebUI.setText(findTestObject('FormFields/inputFirstName'), 'Katalon36')

WebUI.setText(findTestObject('FormFields/inputLastName'), 'Test')

WebUI.setText(findTestObject('FormFields/inputEmail'), 'babsonTest1@gmail.com')

WebUI.click(findTestObject('FormFields/ProgramOfInterest'))

WebUI.selectOptionByValue(findTestObject('FormFields/ProgramOfInterest'), 'tfa_1136', false)

WebUI.click(findTestObject('FormFields/IntendedTermOfEnrollment'))

WebUI.selectOptionByValue(findTestObject('FormFields/IntendedTermOfEnrollment'), 'tfa_1166', false)

WebUI.setText(findTestObject('FormFields/inputPhoneNumber'), '5555555555')

WebUI.click(findTestObject('test2/Page_FW Olin Graduate School of Business  B_65a723/select_Please selectAfghanistanAlbaniaAlger_baf728'))

WebUI.selectOptionByValue(findTestObject('test2/Page_FW Olin Graduate School of Business  B_65a723/select_Please selectAfghanistanAlbaniaAlger_baf728'), 
    'tfa_1395', false)

WebUI.click(findTestObject('FormFields/clickSubmit'))

WebUI.click(findTestObject('FormFields/TYPrivacyPolicy'))

WebUI.click(findTestObject('FormFields/ThankYouText'))

WebUI.closeBrowser()

//fusionmx.babson.edu/Services/GetFormAssemblyUgradTestRecord.cfm?UUU=Katalon&PPP=********&FirstName=Katalon36 = WebUI.getUrl()
https: WebUI.getUrl()

