import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import org.openqa.selenium.Keys as Keys
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Web/OrangeHrm/ReuseTC/LoginAdmin'), [:], FailureHandling.STOP_ON_FAILURE)

// Call your custom keyword:
CustomKeywords.'com.mycustom.keywords.TextKeywords.assertElementText'(findTestObject('Object Repository/Web/OrangeHRM/WebAdminPage/a_Admin'), 
    'Admin')

CustomKeywords.'com.mycustom.keywords.TextKeywords.assertElementText'(findTestObject('Object Repository/Web/OrangeHRM/Page_OrangeHRM/a_Leave'), 
    'Leave')


WebUI.click(findTestObject('Web/OrangeHRM/WebAdminPage/a_Admin'))
// Call your button visibility keyword:
CustomKeywords.'com.mycustom.keywords.ButtonKeywords.assertButtonIsVisible'(findTestObject('Object Repository/Web/OrangeHRM/Page_OrangeHRM/button_Add'))


WebUI.callTestCase(findTestCase('Web/OrangeHrm/ReuseTC/closeWebBrowser'), [:], FailureHandling.STOP_ON_FAILURE)


