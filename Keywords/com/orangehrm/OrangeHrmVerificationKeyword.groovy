package com.orangehrm

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

class OrangeHrmVerificationKeyword {

    @Keyword
    def verifyDashboard() {
        WebUI.verifyElementPresent(findTestObject('Object Repository/Web/OrangeHRM/Page_OrangeHRM/h6_Dashboard'), 10)
    }
}
