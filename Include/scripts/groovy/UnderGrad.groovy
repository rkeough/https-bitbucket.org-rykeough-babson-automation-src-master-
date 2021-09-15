import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty
import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.When
import cucumber.api.java.en.Then

class UnderGrad {

	@Given("I am on the entrepreneurial leadership page")
	def IAmOnTheEntrepreneurialLeadershipPage() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://www.babson.edu/about/entrepreneurial-leadership-development-programs/')
		WebUI.maximizeWindow()
	}

	@When("I select an entrepreneurial program of interest")
	def SelectAnEntrepreneurialProgramOfInterest() {
		WebUI.click(findTestObject('SubmitGradAdmissionForm/ProgramOfInterest'))
		WebUI.selectOptionByValue(findTestObject('SubmitGradAdmissionForm/ProgramOfInterest'), 'tfa_1903', false)
	}

	@When("I get entrepreneruial request")
	def GetEntrepreneurialRequest() {
		WS.sendRequest(findTestObject('FormFields/EntreprenerualGet'))
	}

	@Then("I delete entreprenurial request")
	def DeleteEntrepreneruialRequest() {
		WS.sendRequest(findTestObject('FormFields/EntreprenerualDelete'))
	}

	@When("I select full time mba")
	def SelectFullTimeMba() {
		WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/POIDropDown'),
				'tfa_1037', false)
	}

	@When("I select all options of program of interest for full time mba for entrepreneurial leadership form")
	def FullTimeMbaOptions() {
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
		WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'), 'tfa_1409', false)
	}

	@When("I select part time mba")
	def SelectPartTimeMb() {
		WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/POIDropDown'),
				'tfa_1043', false)
	}

	@When("I select all options of program of interest for part time mba for entrepreneurial leadership form")
	def PartTimeMbaOptions() {

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

		WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'), 'tfa_1412', false)
	}

	@When("I select online mba")
	def SelectOnlineMba() {
		WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/POIDropDown'), 'tfa_1136',
				false)
	}

	@When("I select all options of program of interest for online mba for entrepreneurial leadership form")
	def OnlineMbaOptions() {
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
	}

	@When("I select Master in Entrepreneurial Leadership")
	def SelectMasterInEntreprenerialLeadership() {
		WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/POIDropDown'),
				'tfa_1057', false)
	}

	@When("I select all options of program of interest for Master in Entrepreneurial Leadership for entrepreneurial leadership form")
	def MasterInEntreprenerualLeadershipOptions() {
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
	}

	@When("I select Master in Advanced Entrepreneurial Leadership")
	def SelectMasterInAdvancedEntrepreneurialLeadership() {
		WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/POIDropDown'), 'tfa_1144',
				false)
	}

	@When("I select all options of program of interest for Master in Advanced Entrepreneurial Leadership for entrepreneurial leadership form")
	def MastInAdvancedEntrepreneurialLeadershipOptions() {
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
	}

	@When("I select Master of Science in Finance")
	def SelectMasterOfScienceInFinance() {
		WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/POIDropDown'),
				'tfa_1063', false)
	}

	@When("I select all options of program of interest for Master of Science in Finance for entrepreneurial leadership form")
	def MasterOfScienceInFinanceOptions() {
		WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'),
				'tfa_1067', false)

		WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'),
				'tfa_1068', false)

		WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'),
				'tfa_1133', false)

		WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'),
				'tfa_1423', false)
	}

	@When("I select Master of Science in Business Analytics Wellesley")
	def SelectMasterOfScienceInBusinessAnalyticsWellesley() {
		WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/POIDropDown'),
				'tfa_1069', false)
	}

	@When("I select all options of program of interest for Master of Science in Business Analytics Wellesley for entrepreneurial leadership form")
	def MasterOfScienceInBusinessAnalyticsWellesleyOptions() {
		WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'),
				'tfa_1073', false)

		WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'),
				'tfa_1074', false)

		WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'),
				'tfa_1134', false)

		WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'),
				'tfa_1424', false)
	}

	@When("I select Undergraduate Program")
	def SelectUndergraduateProgram() {
		WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/POIDropDown'),
				'tfa_1075', false)
	}

	@When("I select all options of program of interest for Undergraduate Program for entrepreneurial leadership form")
	def UndergraduateProgramOptions() {
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
	}

	@When("I select Master in Undergraduate Program Transfer")
	def SelectMasterInUndergraduateProgramTransfer() {
		WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/POIDropDown'),
				'tfa_1142', false)
	}

	@When("I select all options of program of interest for Undergraduate Program Transfer for entrepreneurial leadership form")
	def UndergraduateProgramTransfer() {
		WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'),
				'tfa_1148', false)

		WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'),
				'tfa_1149', false)

		WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'),
				'tfa_1406', false)

		WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'),
				'tfa_1407', false)
	}

	@When("I select Master in Executive Education Open Enrollment Programs")
	def SelectMasterInExecutiveEducationOpenEnrollment() {

		WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/POIDropDown'),
				'tfa_1152', false)
	}

	@When("I select all options of program of interest for Executive Education Open Enrollment Programs for entrepreneurial leadership form")
	def ExecutiveEducationOpenEnroolmentOptions() {
		WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'),
				'tfa_1154', false)

		WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/TOEOption'),
				'tfa_1155', false)
	}

	@Then("I select Executive Education Open Enrollment Programs")
	def SelectExecutiveEducationOpenEnrollment() {
		WebUI.selectOptionByValue(findTestObject('Dopdown/EntrepreneurialLeadershipDropdownOptions/POIDropDown'),
				'tfa_1159', false)
	}
}