
package com.mycustom.keywords

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.util.KeywordUtil

public class certKeyword {

    /**
     * This keyword checks if an element on the screen contains the expected text.
     * 
     * @param to The Test Object (button, header, paragraph) you want to check.
     * @param expectedText The exact text you expect to see.
     */
    @Keyword
    def asserttestcert(TestObject to, String expectedText) {
        // 1. Get the actual text shown on the webpage
        String actualText = WebUI.getText(to)
        
        // 2. Check if the text matches
        if (actualText.trim().equals(expectedText.trim())) {
            KeywordUtil.markPassed("SUCCESS: Text matches! Found: '" + actualText + "'")
        } else {
            KeywordUtil.markFailedAndStop("FAILED: Expected text was '" + expectedText + "', but found '" + actualText + "'")
        }
    }
}