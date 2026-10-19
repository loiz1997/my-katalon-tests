package com.utils

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class AssertionUtils {

    @Keyword
    def assertTextPresent(String expectedText) {
        boolean isPresent = WebUI.verifyTextPresent(expectedText, false, FailureHandling.OPTIONAL)

        if (isPresent) {
            KeywordUtil.markPassed("Text '${expectedText}' is present on the page.")
        } else {
            KeywordUtil.markFailed("Text '${expectedText}' is NOT present on the page.")
        }
    }
}
