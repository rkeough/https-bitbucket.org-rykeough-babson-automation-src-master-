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

WebUI.click(findTestObject('Object Repository/test2/Page_FW Olin Graduate School of Business  B_65a723/a_X - CLOSE THIS WINDOW'))

WebUI.setText(findTestObject('Object Repository/test2/Page_FW Olin Graduate School of Business  B_65a723/input_First Name_tfa_1'), 
    'Automation')

WebUI.setText(findTestObject('Object Repository/test2/Page_FW Olin Graduate School of Business  B_65a723/input_Last Name_tfa_2'), 
    'Test')

WebUI.setText(findTestObject('Object Repository/test2/Page_FW Olin Graduate School of Business  B_65a723/input_Email_tfa_3'), 
    'babsonTest1@gmail.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/test2/Page_FW Olin Graduate School of Business  B_65a723/select_Please selectFull-Time MBAPart-Time _b40aed'), 
    'tfa_1116', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/test2/Page_FW Olin Graduate School of Business  B_65a723/select_Please selectFall 2020 Summer 2021Fa_b9629b'), 
    'tfa_1120', true)

WebUI.setText(findTestObject('Object Repository/test2/Page_FW Olin Graduate School of Business  B_65a723/input_Phone_tfa_12'), 
    '5555555555')

WebUI.selectOptionByValue(findTestObject('Object Repository/test2/Page_FW Olin Graduate School of Business  B_65a723/select_Please selectAfghanistanAlbaniaAlger_baf728'), 
    'tfa_1022', true)

WebUI.setText(findTestObject('Object Repository/test2/Page_FW Olin Graduate School of Business  B_65a723/input_City_tfa_17'), 
    'Babson')

WebUI.selectOptionByValue(findTestObject('SubmitGradAdmissionForm/selectState'), 'tfa_748', false)

WebUI.setText(findTestObject('Object Repository/test2/Page_FW Olin Graduate School of Business  B_65a723/input_Zip Code_tfa_1036'), 
    '00000')

WebUI.click(findTestObject('Object Repository/test2/Page_FW Olin Graduate School of Business  B_65a723/input_Postal Code_submit_button'))

WebUI.click(findTestObject('Object Repository/test2/Page_Thank You  Babson College/a_X - CLOSE THIS WINDOW'))

WebUI.click(findTestObject('Object Repository/test2/Page_Thank You  Babson College/h1_Thank You'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://babson.tfaforms.net/users/login')

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

WebUI.closeBrowser()

