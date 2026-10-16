import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')
try {
    WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')
    WebUI.click(findTestObject('Object Repository/Web/OrangeHRM/Page_OrangeHRM/p_Forgot your password'))
    WebUI.click(findTestObject('Object Repository/Web/OrangeHRM/Page_OrangeHRM/button_Reset'))
    WebUI.verifyTextPresent('Required', false)
} finally {
    WebUI.closeBrowser()
}