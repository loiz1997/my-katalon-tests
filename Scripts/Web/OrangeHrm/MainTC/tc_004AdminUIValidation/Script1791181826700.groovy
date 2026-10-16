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

WebUI.click(findTestObject('Web/OrangeHRM/WebAdminPage/a_Admin'))

WebUI.rightClick(findTestObject('Web/OrangeHRM/WebAdminPage/h6_Admin'))

WebUI.assertElementText(findTestObject('Web/OrangeHRM/WebAdminPage/h6_Admin'), 'Admin', 0)

WebUI.rightClick(findTestObject('Web/OrangeHRM/WebAdminPage/li_User Management'))

WebUI.assertElementPresent(findTestObject('Web/OrangeHRM/WebAdminPage/li_User Management'), 0)

WebUI.rightClick(findTestObject('Web/OrangeHRM/WebAdminPage/span_Job'))

WebUI.assertElementPresent(findTestObject('Web/OrangeHRM/WebAdminPage/span_Job'), 0)

WebUI.rightClick(findTestObject('Web/OrangeHRM/WebAdminPage/span_Organization'))

WebUI.assertElementPresent(findTestObject('Web/OrangeHRM/WebAdminPage/span_Organization'), 0)

WebUI.rightClick(findTestObject('Web/OrangeHRM/WebAdminPage/span_Qualifications'))

WebUI.assertElementText(findTestObject('Web/OrangeHRM/WebAdminPage/span_Qualifications'), 'Qualifications', 0)

WebUI.rightClick(findTestObject('Web/OrangeHRM/WebAdminPage/a_Nationalities'))

WebUI.assertElementPresent(findTestObject('Web/OrangeHRM/WebAdminPage/a_Nationalities'), 0)

WebUI.rightClick(findTestObject('Web/OrangeHRM/WebAdminPage/li_More'))

WebUI.assertElementPresent(findTestObject('Web/OrangeHRM/WebAdminPage/li_More'), 0)

WebUI.rightClick(findTestObject('Web/OrangeHRM/WebAdminPage/h5_System Users'))

WebUI.assertElementText(findTestObject('Web/OrangeHRM/WebAdminPage/h5_System Users'), 'System Users', 0)

WebUI.rightClick(findTestObject('Web/OrangeHRM/WebAdminPage/input_oxd-input oxd-input-active'))

WebUI.assertElementClickable(findTestObject('Web/OrangeHRM/WebAdminPage/input_oxd-input oxd-input-active'), 0)

WebUI.callTestCase(findTestCase('Web/OrangeHrm/ReuseTC/closeWebBrowser'), [:], FailureHandling.STOP_ON_FAILURE)

