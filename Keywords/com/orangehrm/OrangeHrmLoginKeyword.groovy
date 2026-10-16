package com.orangehrm

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

class OrangeHrmLoginKeyword {

    @Keyword
    def loginToOrangeHrm(String username = 'Admin', String password = 'admin123') {
        WebUI.setText(findTestObject('Object Repository/Web/OrangeHRM/Page_OrangeHRM/input_Username'), username)
        WebUI.setText(findTestObject('Object Repository/Web/OrangeHRM/Page_OrangeHRM/input_Password'), password)
        WebUI.click(findTestObject('Object Repository/Web/OrangeHRM/Page_OrangeHRM/button_Login'))
    }
}
