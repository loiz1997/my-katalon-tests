package com.mycustom.keywords

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.util.KeywordUtil

public class ButtonKeywords {

    /**
     * This keyword checks if a button is visible on the screen.
     * 
     * @param to The Test Object of the button you want to check.
     */
    @Keyword
    def assertButtonIsVisible(TestObject to) {
        // Ask Katalon if the button can be seen on the screen
        boolean isVisible = WebUI.verifyElementVisible(to, FailureHandling.OPTIONAL)
        
        if (isVisible) {
            KeywordUtil.markPassed("SUCCESS: Yay! The button is visible and ready to play.")
        } else {
            KeywordUtil.markFailedAndStop("FAILED: Oh no! The button is hiding and cannot be seen on the screen.")
        }
    }
}