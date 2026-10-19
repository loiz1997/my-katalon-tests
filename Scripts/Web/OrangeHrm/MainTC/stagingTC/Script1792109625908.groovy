import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

try {
    WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')
    WebUI.setText(findTestObject('Object Repository/Web/OrangeHRM/Page_OrangeHRM/input_Username'), 'Admin')
    WebUI.setText(findTestObject('Object Repository/Web/OrangeHRM/Page_OrangeHRM/input_Password'), 'admin123')
    WebUI.click(findTestObject('Object Repository/Web/OrangeHRM/Page_OrangeHRM/button_Login'))

    WebUI.waitForElementVisible(findTestObject('Object Repository/Web/OrangeHRM/Page_OrangeHRM/span_Admin'), 10)
    WebUI.click(findTestObject('Object Repository/Web/OrangeHRM/Page_OrangeHRM/a_Admin'))
    WebUI.waitForPageLoad(10)

    CustomKeywords.'com.utils.AssertionUtils.assertTextPresent'('Admin')
} finally {
    WebUI.closeBrowser()
}
