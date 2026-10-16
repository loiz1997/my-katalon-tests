package com.orangehrm

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

class OrangeHrmCloseKeyword {

    @Keyword
    def closeApplication() {
        WebUI.closeBrowser()
    }
}
