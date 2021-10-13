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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('gradForm')

WebUI.click(findTestObject('FormFields/Grad152/virtualPopUp'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('FormFields/Grad152/privacyPopUp'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('FormFields/Grad152/gradFirstName'), 'Katalon')

WebUI.setText(findTestObject('FormFields/Grad152/gradLastName'), 'Automation')

WebUI.setText(findTestObject('FormFields/Grad152/gradEmail'), 'babsonTest1@gmail.com')

WebUI.selectOptionByValue(findTestObject('FormFields/Grad152/selectPOI'), program, false)

WebUI.selectOptionByValue(findTestObject('FormFields/Grad152/selectTOE'), term, false)

WebUI.setText(findTestObject('FormFields/Grad152/gradPhone'), '5555555555')

WebUI.selectOptionByValue(findTestObject('FormFields/gradCountry'), 'tfa_1022', false)

WebUI.selectOptionByValue(findTestObject('FormFields/gradState'), 'tfa_748', false)

WebUI.setText(findTestObject('FormFields/gradCity'), 'Wellesley')

WebUI.setText(findTestObject('FormFields/gradZipCode'), '00000')

WebUI.click(findTestObject('FormFields/Grad152/gradSubmit'))

WebUI.getUrl()

WebUI.closeBrowser()

