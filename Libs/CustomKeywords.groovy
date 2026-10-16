
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import com.kms.katalon.core.testobject.TestObject

import java.lang.String



def static "com.orangehrm.OrangeHrmCloseKeyword.closeApplication"() {
    (new com.orangehrm.OrangeHrmCloseKeyword()).closeApplication()
}

 /**
     * Asserts that a specified element is clickable within a given timeout.
     * 
     * @param to The Katalon TestObject to verify
     * @param timeoutInSeconds Maximum time to wait for the element to become clickable
     */ 
def static "com.utils.ElementAssertions.assertElementClickable"(
    	TestObject to	
     , 	int timeoutInSeconds	) {
    (new com.utils.ElementAssertions()).assertElementClickable(
        	to
         , 	timeoutInSeconds)
}


def static "com.utils.ElementAssertions.assertElementClickable"(
    	TestObject to	) {
    (new com.utils.ElementAssertions()).assertElementClickable(
        	to)
}


def static "com.orangehrm.OrangeHrmNavigationKeyword.navigateToModule"(
    	String moduleName	) {
    (new com.orangehrm.OrangeHrmNavigationKeyword()).navigateToModule(
        	moduleName)
}


def static "com.orangehrm.OrangeHrmVerificationKeyword.verifyDashboard"() {
    (new com.orangehrm.OrangeHrmVerificationKeyword()).verifyDashboard()
}

 /**
     * This keyword checks if an element on the screen contains the expected text.
     * 
     * @param to The Test Object (button, header, paragraph) you want to check.
     * @param expectedText The exact text you expect to see.
     */ 
def static "com.mycustom.keywords.TextKeywords.assertElementText"(
    	TestObject to	
     , 	String expectedText	) {
    (new com.mycustom.keywords.TextKeywords()).assertElementText(
        	to
         , 	expectedText)
}


def static "com.orangehrm.OrangeHrmLoginKeyword.loginToOrangeHrm"(
    	String username	
     , 	String password	) {
    (new com.orangehrm.OrangeHrmLoginKeyword()).loginToOrangeHrm(
        	username
         , 	password)
}


def static "com.orangehrm.OrangeHrmLoginKeyword.loginToOrangeHrm"(
    	String username	) {
    (new com.orangehrm.OrangeHrmLoginKeyword()).loginToOrangeHrm(
        	username)
}


def static "com.orangehrm.OrangeHrmLoginKeyword.loginToOrangeHrm"() {
    (new com.orangehrm.OrangeHrmLoginKeyword()).loginToOrangeHrm()
}


def static "com.orangehrm.OrangeHrmKeywords.launchApplication"(
    	String url	) {
    (new com.orangehrm.OrangeHrmKeywords()).launchApplication(
        	url)
}


def static "com.orangehrm.OrangeHrmKeywords.loginToOrangeHrm"(
    	String username	
     , 	String password	) {
    (new com.orangehrm.OrangeHrmKeywords()).loginToOrangeHrm(
        	username
         , 	password)
}


def static "com.orangehrm.OrangeHrmKeywords.navigateToModule"(
    	String moduleName	) {
    (new com.orangehrm.OrangeHrmKeywords()).navigateToModule(
        	moduleName)
}


def static "com.orangehrm.OrangeHrmKeywords.verifyDashboard"() {
    (new com.orangehrm.OrangeHrmKeywords()).verifyDashboard()
}


def static "com.orangehrm.OrangeHrmKeywords.closeApplication"() {
    (new com.orangehrm.OrangeHrmKeywords()).closeApplication()
}


def static "com.orangehrm.OrangeHrmKeywords.launchApplication"() {
    (new com.orangehrm.OrangeHrmKeywords()).launchApplication()
}


def static "com.orangehrm.OrangeHrmKeywords.loginToOrangeHrm"(
    	String username	) {
    (new com.orangehrm.OrangeHrmKeywords()).loginToOrangeHrm(
        	username)
}


def static "com.orangehrm.OrangeHrmKeywords.loginToOrangeHrm"() {
    (new com.orangehrm.OrangeHrmKeywords()).loginToOrangeHrm()
}

 /**
     * This keyword checks if a button is visible on the screen.
     * 
     * @param to The Test Object of the button you want to check.
     */ 
def static "com.mycustom.keywords.ButtonKeywords.assertButtonIsVisible"(
    	TestObject to	) {
    (new com.mycustom.keywords.ButtonKeywords()).assertButtonIsVisible(
        	to)
}


def static "com.orangehrm.OrangeHrmLaunchKeyword.launchApplication"(
    	String url	) {
    (new com.orangehrm.OrangeHrmLaunchKeyword()).launchApplication(
        	url)
}


def static "com.orangehrm.OrangeHrmLaunchKeyword.launchApplication"() {
    (new com.orangehrm.OrangeHrmLaunchKeyword()).launchApplication()
}
