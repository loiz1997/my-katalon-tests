import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser(null)

//Navigate to this url https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
// Navigate to the OrangeHRM login page
WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

//Input username "Admin"
// Enter the username "Admin"
WebUI.setText(findTestObject('Object Repository/Web/OrangeHRM/WebLoginPages/input_Username'), 'Admin')

//Input password "admin123"
// Enter the password "admin123"
WebUI.setText(findTestObject('Object Repository/Web/OrangeHRM/WebLoginPages/input_Password'), 'admin123')

//Click Login button
// Click the Login button
WebUI.click(findTestObject('Object Repository/Web/OrangeHRM/WebLoginPages/button_Login'))



//Click Admin in the the dasboard
// Click the Admin menu on the dashboard
WebUI.click(findTestObject('Object Repository/Web/OrangeHRM/WebDashboardPages/span_Admin'))
//Assert 'System Users' text
// Verify that the System Users text is displayed
WebUI.verifyTextPresent('System Users', false)
//Type and input text 'testuser' in username textfield
// Enter the username value into the username text field
WebUI.setText(findTestObject('Object Repository/Web/OrangeHRM/Page_OrangeHRM/input_Username_username'), 'testuser')
//Assert 'Employee Name'
// Verify that the Employee Name text is displayed
WebUI.verifyTextPresent('Employee Name', false)
//Type and input text 'testemployee' in Employee Name textfield

// Enter the employee name into the Employee Name text field
WebUI.setText(findTestObject('Object Repository/Web/OrangeHRM/Page_OrangeHRM/input_Type for hints'), 'testemployee')

//Input text 'test text input' in username textfield
// Enter the specified text into the username text field
WebUI.setText(findTestObject('Object Repository/Web/OrangeHRM/Page_OrangeHRM/input_Username_username'), 'test text input')
//Select user role 'Admin' user role dropdown field
// Select the Admin user role from the user role dropdown
WebUI.click(findTestObject('Object Repository/Web/OrangeHRM/Page_OrangeHRM/i_oxd-icon bi-caret-down-fill oxd-select-text-ar_1'))
WebUI.click(findTestObject('Object Repository/Web/OrangeHRM/Page_OrangeHRM/div_Admin'))

//Input text 'test employee' in employee name textfield
// Enter the employee name into the Employee Name text field
WebUI.setText(findTestObject('Object Repository/Web/OrangeHRM/Page_OrangeHRM/input_Type for hints'), 'test employee')
//Select status 'Enabled' in status dropdown field
// Select the status dropdown
WebUI.click(findTestObject('Object Repository/Web/OrangeHRM/Page_OrangeHRM/i_oxd-icon bi-caret-down-fill oxd-select-text-ar_2'))

// Select the Enabled status
WebUI.click(findTestObject('Object Repository/Web/OrangeHRM/Page_OrangeHRM/span_Enabled'))
//Assert text that 'System Users' is visible
// Verify that the System Users text is displayed
WebUI.verifyTextPresent('System Users', false)
//Assert text that 'Username' is visible
// Verify that the Username text is displayed
WebUI.verifyTextPresent('Username', false)
//Assert text that 'User Role' is visible
// Verify that the User Role text is displayed
WebUI.verifyTextPresent('User Role', false)
//Assert text that 'Employee Name' is visible
// Verify that the Employee Name text is visible
WebUI.verifyTextPresent('Employee Name', false)
//Assert text that 'Status' is visible
// Verify that the Status text is visible
WebUI.verifyTextPresent('Status', false)
//Assert element that 'Reset' button is visible
// Verify that the Reset button is visible
WebUI.verifyElementVisible(findTestObject('Object Repository/Web/OrangeHRM/Page_OrangeHRM/button_Reset'))
//Assert element that 'Search' button is visible
// Verify that the Search button is visible
WebUI.verifyElementVisible(findTestObject('Object Repository/Web/OrangeHRM/Page_OrangeHRM/div_Reset Search'))

//Close web browser
// Close the current web browser session
WebUI.closeBrowser()
