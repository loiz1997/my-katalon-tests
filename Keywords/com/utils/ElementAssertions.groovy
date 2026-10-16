package com.utils

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait
import java.time.Duration

public class ElementAssertions {

    /**
     * Asserts that a specified element is clickable within a given timeout.
     * 
     * @param to The Katalon TestObject to verify
     * @param timeoutInSeconds Maximum time to wait for the element to become clickable
     */
    @Keyword
    public void assertElementClickable(TestObject to, int timeoutInSeconds = 10) {
        KeywordUtil.logInfo("Verifying element is clickable: " + to.getObjectId())
        
        try {
            // Find the WebElement using Katalon's helper
            WebElement element = WebUiCommonHelper.findElement(to, timeoutInSeconds)
            
            // Initialize WebDriverWait and wait for the element to be clickable
            WebDriverWait wait = new WebDriverWait(DriverFactory.getWebDriver(), Duration.ofSeconds(timeoutInSeconds))
            wait.until(ExpectedConditions.elementToBeClickable(element))
            
            KeywordUtil.markPassed("Success: Element is clickable -> " + to.getObjectId())
            
        } catch (Exception e) {
            KeywordUtil.markFailed("Failure: Element is NOT clickable within " + timeoutInSeconds + " seconds -> " + to.getObjectId() + ". Reason: " + e.getMessage())
        }
    }
}