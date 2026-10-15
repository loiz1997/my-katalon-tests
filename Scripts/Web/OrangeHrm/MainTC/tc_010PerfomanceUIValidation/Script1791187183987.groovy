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

WebUI.click(findTestObject('Web/OrangeHRM/Page_OrangeHRM/span_Performance'))

WebUI.rightClick(findTestObject('Web/OrangeHRM/Page_OrangeHRM/span_Configure'))

WebUI.assertElementVisible(findTestObject('Web/OrangeHRM/Page_OrangeHRM/span_Configure'), 0)

WebUI.rightClick(findTestObject('Web/OrangeHRM/Page_OrangeHRM/span_Manage Reviews'))

WebUI.assertElementVisible(findTestObject('Web/OrangeHRM/Page_OrangeHRM/span_Manage Reviews'), 0)

WebUI.rightClick(findTestObject('Web/OrangeHRM/Page_OrangeHRM/li_My Trackers'))

WebUI.assertElementVisible(findTestObject('Web/OrangeHRM/Page_OrangeHRM/li_My Trackers'), 0)

WebUI.rightClick(findTestObject('Web/OrangeHRM/Page_OrangeHRM/a_Employee Trackers'))

WebUI.assertElementVisible(findTestObject('Web/OrangeHRM/Page_OrangeHRM/a_Employee Trackers'), 0)

WebUI.rightClick(findTestObject('Web/OrangeHRM/Page_OrangeHRM/h5_Employee Reviews'))

WebUI.assertElementPresent(findTestObject('Web/OrangeHRM/Page_OrangeHRM/h5_Employee Reviews'), 0)

WebUI.callTestCase(findTestCase('Web/OrangeHrm/ReuseTC/closeWebBrowser'), [:], FailureHandling.STOP_ON_FAILURE)

