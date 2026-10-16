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

WebUI.callTestCase(findTestCase('Web/OrangeHrm/ReuseTC/LoginAdmin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.switchToWindowTitle('OrangeHRM')

WebUI.rightClick(findTestObject('Web/OrangeHRM/WebDashboardPages/img_client brand banner'))

WebUI.assertElementVisible(findTestObject('Web/OrangeHRM/WebDashboardPages/img_client brand banner'), 0)

WebUI.rightClick(findTestObject('Web/OrangeHRM/WebDashboardPages/input_Search'))

WebUI.assertElementPresent(findTestObject('Web/OrangeHRM/WebDashboardPages/input_Search'), 0)

WebUI.rightClick(findTestObject('Web/OrangeHRM/WebDashboardPages/span_Admin'))

WebUI.assertElementText(findTestObject('Web/OrangeHRM/WebDashboardPages/span_Admin'), var_Admin, 0)

WebUI.rightClick(findTestObject('Web/OrangeHRM/WebDashboardPages/a_PIM'))

WebUI.assertElementText(findTestObject('Web/OrangeHRM/WebDashboardPages/a_PIM'), var_PIM, 0)

WebUI.rightClick(findTestObject('Web/OrangeHRM/WebDashboardPages/a_Leave'))

WebUI.assertElementText(findTestObject('Web/OrangeHRM/WebDashboardPages/a_Leave'), var_leave, 0)

WebUI.rightClick(findTestObject('Web/OrangeHRM/WebDashboardPages/a_Time'))

WebUI.assertElementText(findTestObject('Web/OrangeHRM/WebDashboardPages/a_Time'), var_time, 0)

WebUI.rightClick(findTestObject('Web/OrangeHRM/WebDashboardPages/span_Recruitment'))

WebUI.assertElementText(findTestObject('Web/OrangeHRM/WebDashboardPages/span_Recruitment'), 'Recruitment', 0)

WebUI.rightClick(findTestObject('Web/OrangeHRM/WebDashboardPages/span_My Info'))

WebUI.assertElementText(findTestObject('Web/OrangeHRM/WebDashboardPages/span_My Info'), 'My Info', 0)

WebUI.rightClick(findTestObject('Web/OrangeHRM/WebDashboardPages/span_Performance'))

WebUI.assertElementText(findTestObject('Web/OrangeHRM/WebDashboardPages/span_Performance'), 'Performance', 0)

WebUI.rightClick(findTestObject('Web/OrangeHRM/WebDashboardPages/span_Dashboard'))

WebUI.assertElementText(findTestObject('Web/OrangeHRM/WebDashboardPages/span_Dashboard'), 'Dashboard', 0)

WebUI.rightClick(findTestObject('Web/OrangeHRM/WebDashboardPages/span_Directory'))

WebUI.assertElementPresent(findTestObject('Web/OrangeHRM/WebDashboardPages/span_Directory'), 0)

WebUI.rightClick(findTestObject('Web/OrangeHRM/WebDashboardPages/span_Maintenance'))

WebUI.assertElementText(findTestObject('Web/OrangeHRM/WebDashboardPages/span_Maintenance'), 'Maintenance', 0)

WebUI.rightClick(findTestObject('Web/OrangeHRM/WebDashboardPages/span_Claim'))

WebUI.assertElementText(findTestObject('Web/OrangeHRM/WebDashboardPages/span_Claim'), 'Claim', 0)

WebUI.rightClick(findTestObject('Web/OrangeHRM/WebDashboardPages/span_Buzz'))

WebUI.assertElementText(findTestObject('Web/OrangeHRM/WebDashboardPages/span_Buzz'), 'Buzz', 0)

WebUI.rightClick(findTestObject('Web/OrangeHRM/WebDashboardPages/p_manda user'))

WebUI.assertElementPresent(findTestObject('Web/OrangeHRM/WebDashboardPages/p_manda user'), 0)

WebUI.rightClick(findTestObject('Web/OrangeHRM/WebDashboardPages/img_profile picture'))

WebUI.assertElementVisible(findTestObject('Web/OrangeHRM/WebDashboardPages/img_profile picture'), 0)

WebUI.rightClick(findTestObject('Web/OrangeHRM/WebDashboardPages/button_Upgrade'))

WebUI.assertElementVisible(findTestObject('Web/OrangeHRM/WebDashboardPages/button_Upgrade'), 0)

WebUI.callTestCase(findTestCase('Web/OrangeHrm/ReuseTC/closeWebBrowser'), [:], FailureHandling.STOP_ON_FAILURE)

