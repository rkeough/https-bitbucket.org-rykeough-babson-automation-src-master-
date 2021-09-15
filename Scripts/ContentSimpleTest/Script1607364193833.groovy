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

WebUI.navigateToUrl('https://test-www.babson.edu/pdfassets/test/content-types-for-testing/card-simple/cardsimplenew/')

WebUI.maximizeWindow()

def h1SimpleColor = WebUI.getCSSValue(findTestObject('CardSimple/CardSimpleTest/h1HeaderSimpleTest'), 'color')

WebUI.verifyEqual(h1SimpleColor, 'rgba(0, 102, 68, 1)')

def h1FontSize = WebUI.getCSSValue(findTestObject('CardSimple/CardSimpleTest/h1HeaderSimpleTest'), 'font-size')

WebUI.verifyEqual(h1FontSize, '41.6px')

def h1FontStyle = WebUI.getCSSValue(findTestObject('CardSimple/CardSimpleTest/h1HeaderSimpleTest'), 'font-style')

WebUI.verifyEqual(h1FontStyle, 'italic')

def h1BottomMargin = WebUI.getCSSValue(findTestObject('CardSimple/CardSimpleTest/h1HeaderSimpleTest'), 'margin-bottom')

WebUI.verifyEqual(h1BottomMargin, '30px')

def h1FontFamily = WebUI.getCSSValue(findTestObject('CardSimple/CardSimpleTest/h1HeaderSimpleTest'), 'font-family')

WebUI.verifyEqual(h1FontFamily, '"Barlow Condensed"')

def p1FontSize = WebUI.getCSSValue(findTestObject('Page_ITCMS-3954 Card Simple with body text _978687/p_test'), 'font-size')

WebUI.verifyEqual(p1FontSize, '20px')

WebUI.closeBrowser()

