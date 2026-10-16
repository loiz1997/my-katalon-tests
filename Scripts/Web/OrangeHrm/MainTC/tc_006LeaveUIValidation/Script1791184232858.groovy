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

WebUI.click(findTestObject('Web/OrangeHRM/Page_OrangeHRM/a_Leave'))

WebUI.rightClick(findTestObject('Web/OrangeHRM/Page_OrangeHRM/a_Apply'))

WebUI.assertElementVisible(findTestObject('Web/OrangeHRM/Page_OrangeHRM/a_Apply'), 0)

WebUI.rightClick(findTestObject('Web/OrangeHRM/Page_OrangeHRM/a_My Leave'))

WebUI.assertElementVisible(findTestObject('Web/OrangeHRM/Page_OrangeHRM/a_My Leave'), 0)

WebUI.rightClick(findTestObject('Web/OrangeHRM/Page_OrangeHRM/span_Entitlements'))

WebUI.assertElementVisible(findTestObject('Web/OrangeHRM/Page_OrangeHRM/span_Entitlements'), 0)

WebUI.rightClick(findTestObject('Web/OrangeHRM/Page_OrangeHRM/li_Reports'))

WebUI.assertElementVisible(findTestObject('Web/OrangeHRM/Page_OrangeHRM/li_Reports'), 0)

WebUI.rightClick(findTestObject('Web/OrangeHRM/Page_OrangeHRM/span_Configure'))

WebUI.assertElementPresent(findTestObject('Web/OrangeHRM/Page_OrangeHRM/span_Configure'), 0)

WebUI.rightClick(findTestObject('Web/OrangeHRM/Page_OrangeHRM/h5_Leave List'))

WebUI.assertElementText(findTestObject('Web/OrangeHRM/Page_OrangeHRM/h5_Leave List'), 'Leave List', 0)

WebUI.callTestCase(findTestCase('Web/OrangeHrm/ReuseTC/closeWebBrowser'), [:], FailureHandling.STOP_ON_FAILURE)

