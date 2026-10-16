import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

/**
 * Web login with valid OrangeHRM demo credentials.
 * Objects: Object Repository/Web/OrangeHRM/recordObj/Page_OrangeHRM
 */
int timeout = 10

WebUI.openBrowser('')
WebUI.maximizeWindow()
WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

WebUI.verifyElementPresent(findTestObject('Web/OrangeHRM/recordObj/Page_OrangeHRM/img_company-branding'), timeout)
WebUI.verifyElementPresent(findTestObject('Web/OrangeHRM/recordObj/Page_OrangeHRM/input_Username'), timeout)
WebUI.verifyElementPresent(findTestObject('Web/OrangeHRM/recordObj/Page_OrangeHRM/input_Password'), timeout)
WebUI.verifyElementPresent(findTestObject('Web/OrangeHRM/recordObj/Page_OrangeHRM/button_Login'), timeout)

WebUI.setText(findTestObject('Web/OrangeHRM/recordObj/Page_OrangeHRM/input_Username'), 'Admin')
WebUI.setText(findTestObject('Web/OrangeHRM/recordObj/Page_OrangeHRM/input_Password'), 'admin123')
WebUI.click(findTestObject('Web/OrangeHRM/recordObj/Page_OrangeHRM/button_Login'))

WebUI.verifyElementPresent(findTestObject('Web/OrangeHRM/recordObj/Page_OrangeHRM/img_profile picture'), timeout)
WebUI.verifyElementPresent(findTestObject('Web/OrangeHRM/recordObj/Page_OrangeHRM/p_Time at Work'), timeout)

WebUI.closeBrowser()
