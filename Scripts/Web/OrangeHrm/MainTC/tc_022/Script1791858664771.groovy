import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')
WebUI.maximizeWindow()

try {
    WebUI.waitForElementPresent(findTestObject('Object Repository/Web/OrangeHRM/Page_OrangeHRM/input_Username'), 15)
    WebUI.setText(findTestObject('Object Repository/Web/OrangeHRM/Page_OrangeHRM/input_Username'), 'Admin')
    WebUI.setText(findTestObject('Object Repository/Web/OrangeHRM/Page_OrangeHRM/input_Password'), 'admin123')
    WebUI.click(findTestObject('Object Repository/Web/OrangeHRM/Page_OrangeHRM/button_Login'))

    WebUI.waitForElementPresent(findTestObject('Object Repository/Web/OrangeHRM/Page_OrangeHRM/span_Admin'), 15)
    WebUI.click(findTestObject('Object Repository/Web/OrangeHRM/Page_OrangeHRM/span_Admin'))
    WebUI.waitForElementPresent(findTestObject('Object Repository/Web/OrangeHRM/Page_OrangeHRM/h6_Admin'), 15)

    CustomKeywords.'com.utils.AssertionUtils.assertTextPresent'('Admin')
} finally {
    WebUI.closeBrowser()
}