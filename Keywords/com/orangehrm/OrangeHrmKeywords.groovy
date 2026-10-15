package com.orangehrm

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

class OrangeHrmKeywords {

    @Keyword
    def launchApplication(String url = 'https://opensource-demo.orangehrmlive.com/web/index.php/auth/login') {
        WebUI.openBrowser('')
        WebUI.navigateToUrl(url)
        WebUI.verifyElementPresent(findTestObject('Object Repository/Web/OrangeHRM/Page_OrangeHRM/h5_Login'), 10)
    }

    @Keyword
    def loginToOrangeHrm(String username = 'Admin', String password = 'admin123') {
        WebUI.setText(findTestObject('Object Repository/Web/OrangeHRM/Page_OrangeHRM/input_Username'), username)
        WebUI.setText(findTestObject('Object Repository/Web/OrangeHRM/Page_OrangeHRM/input_Password'), password)
        WebUI.click(findTestObject('Object Repository/Web/OrangeHRM/Page_OrangeHRM/button_Login'))
        WebUI.verifyElementPresent(findTestObject('Object Repository/Web/OrangeHRM/Page_OrangeHRM/h6_Dashboard'), 10)
    }

    @Keyword
    def navigateToModule(String moduleName) {
        Map<String, String> moduleObjects = [
            'Admin'       : 'Object Repository/Web/OrangeHRM/WebDashboardPages/span_Admin',
            'PIM'         : 'Object Repository/Web/OrangeHRM/WebDashboardPages/a_PIM',
            'Leave'       : 'Object Repository/Web/OrangeHRM/WebDashboardPages/a_Leave',
            'Time'        : 'Object Repository/Web/OrangeHRM/WebDashboardPages/a_Time',
            'Recruitment' : 'Object Repository/Web/OrangeHRM/WebDashboardPages/span_Recruitment',
            'My Info'     : 'Object Repository/Web/OrangeHRM/WebDashboardPages/span_My Info',
            'Performance' : 'Object Repository/Web/OrangeHRM/WebDashboardPages/span_Performance',
            'Directory'   : 'Object Repository/Web/OrangeHRM/WebDashboardPages/span_Directory',
            'Buzz'        : 'Object Repository/Web/OrangeHRM/WebDashboardPages/span_Buzz'
        ]

        String objectPath = moduleObjects[moduleName]
        assert objectPath != null : "Unsupported OrangeHRM module: ${moduleName}"
        WebUI.click(findTestObject(objectPath))
    }

    @Keyword
    def verifyDashboard() {
        WebUI.verifyElementPresent(findTestObject('Object Repository/Web/OrangeHRM/Page_OrangeHRM/h6_Dashboard'), 10)
    }

    @Keyword
    def closeApplication() {
        WebUI.closeBrowser()
    }
}
