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

WebUI.click(findTestObject('SubmitGradAdmissionForm/PrivacyPolicy'))

WebUI.setText(findTestObject('SubmitGradAdmissionForm/inputFirstName'), 'Automation')

WebUI.setText(findTestObject('SubmitGradAdmissionForm/inputLastName'), 'Test')

WebUI.setText(findTestObject('SubmitGradAdmissionForm/inputEmail'), 'babsonTest1@gmail.com')

WebUI.click(findTestObject('SubmitGradAdmissionForm/ProgramOfInterest'))

WebUI.selectOptionByValue(findTestObject('SubmitGradAdmissionForm/ProgramOfInterest'), 'tfa_1208', false)

WebUI.click(findTestObject('SubmitGradAdmissionForm/IntendedTermOfEnrollment'))

WebUI.selectOptionByValue(findTestObject('SubmitGradAdmissionForm/IntendedTermOfEnrollment'), 'tfa_1217', false)

WebUI.setText(findTestObject('SubmitGradAdmissionForm/inputPhoneNumber'), '5555555555')

WebUI.click(findTestObject('SubmitGradAdmissionForm/selectCountry'))

WebUI.selectOptionByValue(findTestObject('SubmitGradAdmissionForm/selectCountry'), 'tfa_1022', false)

WebUI.click(findTestObject('SubmitGradAdmissionForm/selectState'))

WebUI.selectOptionByValue(findTestObject('SubmitGradAdmissionForm/selectState'), 'tfa_748', false)

WebUI.setText(findTestObject('SubmitGradAdmissionForm/inputCity'), 'Babson')

WebUI.setText(findTestObject('SubmitGradAdmissionForm/inputZipCode'), '00000')

WebUI.click(findTestObject('SubmitGradAdmissionForm/clickSubmit'))

WebUI.click(findTestObject('SubmitGradAdmissionForm/TYPrivacyPolicy'))

WebUI.verifyElementText(findTestObject('SubmitGradAdmissionForm/ThankYouText'), 'Thank You')

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://babson.tfaforms.net/users/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/FormAssembly/inpuyFAEmail'), 'rkeough@babson.edu')

WebUI.setEncryptedText(findTestObject('Object Repository/FormAssembly/inputFAPassword'), 'GnaSFrYIDO8GMIhAnn2iDQ==')

WebUI.click(findTestObject('Object Repository/FormAssembly/FALoginButton'))

WebUI.click(findTestObject('Object Repository/FormAssembly/Form152Entries'))

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

