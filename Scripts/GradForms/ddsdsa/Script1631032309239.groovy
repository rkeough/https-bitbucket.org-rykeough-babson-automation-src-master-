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

WebUI.navigateToUrl('https://www.babson.edu/academics/graduate-school/mba/')

WebUI.click(findTestObject('null'))

WebUI.selectOptionByValue(findTestObject('null'), 'tfa_1184', false)

WebUI.selectOptionByValue(findTestObject('null'), 'tfa_1042', false)

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.babson.edu/academics/graduate-school/mba/')

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('null'), '555-555-5555')

WebUI.selectOptionByValue(findTestObject('null'), 'tfa_1184', true)

WebUI.selectOptionByValue(findTestObject('null'), 'tfa_1089', true)

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.babson.edu/academics/graduate-school/mba/')

WebUI.click(findTestObject('null'))

WebUI.selectOptionByValue(findTestObject('null'), 'tfa_1184', false)

WebUI.selectOptionByValue(findTestObject('null'), 'tfa_1042', false)

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.babson.edu/academics/graduate-school/mba/')

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('null'), '555-555-5555')

WebUI.selectOptionByValue(findTestObject('null'), 'tfa_1184', true)

WebUI.selectOptionByValue(findTestObject('null'), 'tfa_1089', true)

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.babson.edu/academics/graduate-school/mba/')

WebUI.click(findTestObject('FormFields/Grad152/virtualPopUp'))

WebUI.click(findTestObject('FormFields/Grad152/virtualPopUp'))

WebUI.click(findTestObject('FormFields/Grad152/gradSubmit'))

