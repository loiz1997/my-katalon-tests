import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')
try {
    WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')
    WebUI.setText(findTestObject('Object Repository/Web/OrangeHRM/Page_OrangeHRM/input_Username'), 'admin')
    WebUI.setText(findTestObject('Object Repository/Web/OrangeHRM/Page_OrangeHRM/input_Password'), 'admin123')
    WebUI.click(findTestObject('Object Repository/Web/OrangeHRM/Page_OrangeHRM/button_Login'))
    WebUI.verifyElementText(findTestObject('Object Repository/Web/OrangeHRM/Page_OrangeHRM/p_Invalid credentials'), 'Invalid credentials')
} finally {
    WebUI.closeBrowser()
}