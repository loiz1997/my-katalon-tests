import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// Helper method to dynamically construct TestObjects on the fly
TestObject createTestObject(String xpath) {
    TestObject to = new TestObject()
    to.addProperty("xpath", ConditionType.EQUALS, xpath)
    return to
}

// Dynamic Locators for OrangeHRM Login Page
TestObject logoHeader       = createTestObject("//div[@class='orangehrm-login-branding']/img")
TestObject loginHeader      = createTestObject("//h5[contains(@class,'orangehrm-login-title')]")
TestObject usernameInput    = createTestObject("//input[@name='username']")
TestObject passwordInput    = createTestObject("//input[@name='password']")
TestObject loginBtn         = createTestObject("//button[@type='submit']")
TestObject forgotPasswordLn  = createTestObject("//p[contains(@class,'orangehrm-login-forgot-header')]")
TestObject resetPasswordHdr = createTestObject("//h6[contains(@class,'orangehrm-forgot-password-title')]")
TestObject socialIcons      = createTestObject("//div[@class='orangehrm-login-footer-sm']/a")

// Step 1: Open Browser & Navigate
WebUI.openBrowser('')
WebUI.maximizeWindow()
WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

// Step 2: Verify Branding Logo & Login Title Header
WebUI.verifyElementVisible(logoHeader, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementVisible(loginHeader, FailureHandling.CONTINUE_ON_FAILURE)

// Step 3: Verify Username Field
WebUI.verifyElementVisible(usernameInput, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementClickable(usernameInput, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.setText(usernameInput, 'Admin')

// Step 4: Verify Password Field
WebUI.verifyElementVisible(passwordInput, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementClickable(passwordInput, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.setText(passwordInput, 'admin123')

// Step 5: Verify Login Button
WebUI.verifyElementVisible(loginBtn, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementClickable(loginBtn, FailureHandling.CONTINUE_ON_FAILURE)

// Step 6: Verify 'Forgot your password?' Link Navigation
WebUI.verifyElementVisible(forgotPasswordLn, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementClickable(forgotPasswordLn, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.click(forgotPasswordLn)

WebUI.verifyElementVisible(resetPasswordHdr, FailureHandling.CONTINUE_ON_FAILURE)

// Navigate Back to Login Page
WebUI.back()
WebUI.waitForElementVisible(loginBtn, 10)

// Step 7: Verify Social Media Links Footer Count and Visibility
WebUI.verifyElementPresent(socialIcons, 5, FailureHandling.CONTINUE_ON_FAILURE)

// Clean Up
WebUI.closeBrowser()