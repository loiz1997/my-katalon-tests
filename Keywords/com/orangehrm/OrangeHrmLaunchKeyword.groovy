package com.orangehrm

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

class OrangeHrmLaunchKeyword {

    @Keyword
    def launchApplication(String url = 'https://opensource-demo.orangehrmlive.com/web/index.php/auth/login') {
        WebUI.openBrowser('')
        WebUI.navigateToUrl(url)
    }
}
