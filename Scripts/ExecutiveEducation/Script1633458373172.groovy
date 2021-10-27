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

WebUI.navigateToUrl('https://www.babson.edu/academics/executive-education/')

WebUI.setText(findTestObject('FormFields/ExecutiveEducation/Company'), 'Babson')

WebUI.click(findTestObject('Object Repository/hlhjhkjhkj/input_How can we help you_submit_button'), FailureHandling.STOP_ON_FAILURE)

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.babson.edu/academics/executive-education/')

WebUI.setText(findTestObject('Object Repository/FormFields/ExecutiveEducation/Company'), 'Babson')

WebUI.click(findTestObject('ExecutiveEducation/input_How can we help you_submit_button'), FailureHandling.STOP_ON_FAILURE)

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.babson.edu/academics/executive-education/custom-programs/')

WebUI.click(findTestObject('ExecutiveEducation/a_X - CLOSE THIS WINDOW'))

WebUI.selectOptionByValue(findTestObject('ExecutiveEducation/groupSize'), 'tfa_7', true)

WebUI.selectOptionByValue(findTestObject('ExecutiveEducation/groupSize'), 'tfa_8', true)

WebUI.selectOptionByValue(findTestObject('ExecutiveEducation/groupSize'), 'tfa_9', true)

WebUI.setText(findTestObject('ExecutiveEducation/DescriptionBox'), 'Automation')

WebUI.navigateToUrl('https://www.babson.edu/academics/executive-education/')

WebUI.setText(findTestObject('Object Repository/FormFields/ExecutiveEducation/Company'), 'Babson')

WebUI.click(findTestObject('Object Repository/hlhjhkjhkj/input_How can we help you_submit_button'), FailureHandling.STOP_ON_FAILURE)

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.babson.edu/academics/executive-education/')

WebUI.setText(findTestObject('Object Repository/FormFields/ExecutiveEducation/Company'), 'Babson')

WebUI.click(findTestObject('Object Repository/ExecutiveEducation/input_How can we help you_submit_button'), FailureHandling.STOP_ON_FAILURE)

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.babson.edu/academics/executive-education/custom-programs/')

WebUI.click(findTestObject('Object Repository/ExecutiveEducation/a_X - CLOSE THIS WINDOW'))

WebUI.selectOptionByValue(findTestObject('Object Repository/ExecutiveEducation/groupSize'), 'tfa_7', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/ExecutiveEducation/groupSize'), 'tfa_8', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/ExecutiveEducation/groupSize'), 'tfa_9', true)

WebUI.setText(findTestObject('Object Repository/ExecutiveEducation/DescriptionBox'), 'Automation')

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.babson.edu/academics/executive-education/executive-leadership-programs/')

WebUI.click(findTestObject('Object Repository/hkjhkhkj/a_X - CLOSE THIS WINDOW'))

WebUI.selectOptionByValue(findTestObject('FormFields/ExecutiveEducation/selectExecutiveInterest'), 'tfa_6', true)

WebUI.click(findTestObject('FormFields/ExecutiveEducation/a_X - CLOSE THIS WINDOW'))

