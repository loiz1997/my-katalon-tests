package com.orangehrm

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

class OrangeHrmNavigationKeyword {

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
}
