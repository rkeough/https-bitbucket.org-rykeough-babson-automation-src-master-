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

WebUI.navigateToUrl('https://test-www.babson.edu/business-programs-wes/entrepreneurial-leadership-development-programs/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('FormFields/ProgramOfInterest'))

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/POIDropDown'), 
    'tfa_1037', false)

WebUI.click(findTestObject('FormFields/IntendedTermOfEnrollment'))

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'), 'tfa_1088', 
    false)

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'), 'tfa_1041', 
    false)

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'), 
    'tfa_1042', false)

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'), 
    'tfa_1089', false)

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'), 
    'tfa_1113', false)

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'), 
    'tfa_1130', false)

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'), 
    'tfa_1409', false)

WebUI.click(findTestObject('FormFields/ProgramOfInterest'))

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/POIDropDown'), 
    'tfa_1043', false)

WebUI.click(findTestObject('FormFields/IntendedTermOfEnrollment'))

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'), 
    'tfa_1114', false)

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'), 
    'tfa_1115', false)

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'), 
    'tfa_1116', false)

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'), 
    'tfa_1117', false)

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'), 
    'tfa_1118', false)

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'), 
    'tfa_1119', false)

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'), 
    'tfa_1120', false)

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'), 
    'tfa_1121', false)

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'), 
    'tfa_1131', false)

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'), 
    'tfa_1410', false)

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'), 
    'tfa_1411', false)

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'), 'tfa_1412', 
    false)

WebUI.click(findTestObject('FormFields/ProgramOfInterest'))

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/POIDropDown'), 'tfa_1136', 
    false)

WebUI.click(findTestObject('FormFields/IntendedTermOfEnrollment'))

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'), 'tfa_1164', 
    false)

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'), 
    'tfa_1165', false)

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'), 
    'tfa_1166', false)

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'), 
    'tfa_1413', false)

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'), 
    'tfa_1414', false)

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'), 
    'tfa_1415', false)

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'), 
    'tfa_1416', false)

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'), 
    'tfa_1417', false)

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'), 
    'tfa_1418', false)

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'), 
    'tfa_1419', false)

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'), 
    'tfa_1420', false)

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'), 
    'tfa_1421', false)

WebUI.click(findTestObject('FormFields/ProgramOfInterest'))

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/POIDropDown'), 
    'tfa_1057', false)

WebUI.click(findTestObject('FormFields/IntendedTermOfEnrollment'))

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'), 
    'tfa_1167', false)

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'), 
    'tfa_1061', false)

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'), 
    'tfa_1062', false)

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'), 
    'tfa_1132', false)

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'), 
    'tfa_1422', false)

WebUI.click(findTestObject('FormFields/ProgramOfInterest'))

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/POIDropDown'), 'tfa_1144', 
    false)

WebUI.click(findTestObject('FormFields/IntendedTermOfEnrollment'))

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'), 
    'tfa_1146', false)

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'), 
    'tfa_1425', false)

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'), 
    'tfa_1426', false)

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'), 
    'tfa_1427', false)

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'), 
    'tfa_1428', false)

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'), 
    'tfa_1429', false)

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'), 
    'tfa_1430', false)

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'), 
    'tfa_1431', false)

WebUI.click(findTestObject('FormFields/ProgramOfInterest'))

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/POIDropDown'), 
    'tfa_1063', false)

WebUI.click(findTestObject('FormFields/IntendedTermOfEnrollment'))

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'), 
    'tfa_1067', false)

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'), 
    'tfa_1068', false)

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'), 
    'tfa_1133', false)

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'), 
    'tfa_1423', false)

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/POIDropDown'), 
    'tfa_1069', false)

WebUI.click(findTestObject('FormFields/IntendedTermOfEnrollment'))

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'), 
    'tfa_1073', false)

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'), 
    'tfa_1074', false)

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'), 
    'tfa_1134', false)

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'), 
    'tfa_1424', false)

WebUI.click(findTestObject('FormFields/ProgramOfInterest'))

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/POIDropDown'), 
    'tfa_1075', false)

WebUI.click(findTestObject('FormFields/IntendedTermOfEnrollment'))

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'), 
    'tfa_1122', false)

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'), 
    'tfa_1123', false)

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'), 
    'tfa_1124', false)

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'), 
    'tfa_1125', false)

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'), 
    'tfa_1126', false)

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'), 
    'tfa_1127', false)

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'), 
    'tfa_1128', false)

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'), 
    'tfa_1129', false)

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'), 
    'tfa_1135', false)

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'), 
    'tfa_1432', false)

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'), 
    'tfa_1433', false)

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'), 
    'tfa_1434', false)

WebUI.click(findTestObject('FormFields/ProgramOfInterest'))

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/POIDropDown'), 
    'tfa_1142', false)

WebUI.click(findTestObject('FormFields/IntendedTermOfEnrollment'))

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'), 
    'tfa_1148', false)

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'), 
    'tfa_1149', false)

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'), 
    'tfa_1406', false)

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'), 
    'tfa_1407', false)

WebUI.click(findTestObject('FormFields/ProgramOfInterest'))

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/POIDropDown'), 
    'tfa_1152', false)

WebUI.click(findTestObject('FormFields/IntendedTermOfEnrollment'))

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'), 
    'tfa_1154', false)

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'), 
    'tfa_1155', false)

WebUI.click(findTestObject('FormFields/ProgramOfInterest'))

WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/POIDropDown'), 
    'tfa_1159', false)

WebUI.closeBrowser()

