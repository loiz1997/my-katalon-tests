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

WebUI.callTestCase(findTestCase('Web/OrangeHrm/ReuseTC/OpenWeb'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.rightClick(findTestObject('Web/OrangeHRM/WebLoginPages/img_company-branding'))

WebUI.assertElementVisible(findTestObject('Web/OrangeHRM/WebLoginPages/img_company-branding'), 0)

WebUI.rightClick(findTestObject('Web/OrangeHRM/WebLoginPages/h5_Login'))

WebUI.assertElementVisible(findTestObject('Web/OrangeHRM/WebLoginPages/h5_Login'), 0)

WebUI.rightClick(findTestObject('Web/OrangeHRM/WebLoginPages/p_Username _ Admin'))

WebUI.assertElementPresent(findTestObject('Web/OrangeHRM/WebLoginPages/p_Username _ Admin'), 0)

WebUI.rightClick(findTestObject('Web/OrangeHRM/WebLoginPages/p_Password _ admin123'))

WebUI.assertElementPresent(findTestObject('Web/OrangeHRM/WebLoginPages/p_Password _ admin123'), 0)

WebUI.rightClick(findTestObject('Web/OrangeHRM/WebLoginPages/input_Username (1)'))

WebUI.assertElementClickable(findTestObject('Web/OrangeHRM/WebLoginPages/input_Username (1)'), 0)

WebUI.rightClick(findTestObject('Web/OrangeHRM/WebLoginPages/input_Password (1)'))

WebUI.assertElementClickable(findTestObject('Web/OrangeHRM/WebLoginPages/input_Password (1)'), 0)

WebUI.rightClick(findTestObject('Web/OrangeHRM/WebLoginPages/label_Username'))

WebUI.assertElementText(findTestObject('Web/OrangeHRM/WebLoginPages/label_Username'), 'Username', 0)

WebUI.rightClick(findTestObject('Web/OrangeHRM/WebLoginPages/label_Password'))

WebUI.assertElementText(findTestObject('Web/OrangeHRM/WebLoginPages/label_Password'), 'Password', 0)

WebUI.rightClick(findTestObject('Web/OrangeHRM/WebLoginPages/i_oxd-icon bi-person oxd-input-group_label-icon'))

WebUI.assertElementVisible(findTestObject('Web/OrangeHRM/WebLoginPages/i_oxd-icon bi-person oxd-input-group_label-icon'), 
    0)

WebUI.rightClick(findTestObject('Web/OrangeHRM/WebLoginPages/i_oxd-icon bi-key oxd-input-group_label-icon'))

WebUI.assertElementVisible(findTestObject('Web/OrangeHRM/WebLoginPages/i_oxd-icon bi-key oxd-input-group_label-icon'), 
    0)

WebUI.rightClick(findTestObject('Web/OrangeHRM/WebLoginPages/button_Login (1)'))

WebUI.assertElementClickable(findTestObject('Web/OrangeHRM/WebLoginPages/button_Login (1)'), 0)

WebUI.rightClick(findTestObject('Web/OrangeHRM/WebLoginPages/p_Forgot your password'))

WebUI.assertElementPresent(findTestObject('Web/OrangeHRM/WebLoginPages/p_Forgot your password'), 0)

WebUI.rightClick(findTestObject('Web/OrangeHRM/WebLoginPages/p_OrangeHRM OS 5.9'))

WebUI.assertElementPresent(findTestObject('Web/OrangeHRM/WebLoginPages/p_OrangeHRM OS 5.9'), 0)

WebUI.rightClick(findTestObject('Web/OrangeHRM/WebLoginPages/p_2005 - 2026 OrangeHRM, Inc. All rights reser'))

WebUI.assertElementPresent(findTestObject('Web/OrangeHRM/WebLoginPages/p_2005 - 2026 OrangeHRM, Inc. All rights reser'), 
    0)

WebUI.callTestCase(findTestCase('Web/OrangeHrm/ReuseTC/closeWebBrowser'), [:], FailureHandling.STOP_ON_FAILURE)
/*
 *  Validate the login button and supporting login-page elements, then close the web browser.
 *
 *  1. Right-click the Login button and verify that it is clickable.
 *  2. Right-click the Forgot your password element and verify that it is present.
 *  3. Right-click the OrangeHRM OS 5.9 version text and verify that it is present.
 *  4. Right-click the footer copyright text and verify that it is present.
 *  5. Call the closeWebBrowser test case and stop execution if the browser cannot be closed successfully.
 *
 */

