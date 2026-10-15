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

/**
 * MedTrack iOS admin login.
 * Objects: Object Repository/Mobile/MedTrack
 * Credentials: Profiles/default (admin_username, admin_password)
 *
 * App path must be the simulator .app bundle (not the Runner folder name).
 */
int timeout = 15

//Mobile.startApplication('/Users/77qatechteam/medtrack_flutter/build/ios/iphonesimulator/Runner.app', false)
Mobile.waitForElementPresent(findTestObject('Mobile/MedTrackPages/XCUIElementTypeStaticText - MedTrack'), timeout)

Mobile.verifyElementExist(findTestObject('Mobile/MedTrackPages/XCUIElementTypeStaticText - Sign in to continue'), timeout)

Mobile.tap(findTestObject('Mobile/MedTrackPages/XCUIElementTypeOther - AdminTab 3 of 3'), timeout)

Mobile.verifyElementExist(findTestObject('Mobile/MedTrackPages/XCUIElementTypeTextField - Username'), timeout)

Mobile.verifyElementExist(findTestObject('Mobile/MedTrackPages/XCUIElementTypeTextField - Password'), timeout)

Mobile.verifyElementExist(findTestObject('Mobile/MedTrackPages/XCUIElementTypeButton - login_admin_submit_button'), timeout)

Mobile.tap(findTestObject('Mobile/MedTrackPages/XCUIElementTypeTextField - Username'), timeout)

Mobile.setText(findTestObject('Mobile/MedTrackPages/XCUIElementTypeTextField - Username'), MT_username.toString(), timeout)

Mobile.tap(findTestObject('Mobile/MedTrackPages/XCUIElementTypeTextField - Password'), timeout)

Mobile.setText(findTestObject('Mobile/MedTrackPages/XCUIElementTypeTextField - Password'), MT_password.toString(), timeout)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Mobile/MedTrackPages/XCUIElementTypeButton - login_admin_submit_button'), timeout)

Mobile.verifyElementNotExist(findTestObject('Mobile/MedTrackPages/XCUIElementTypeButton - login_admin_submit_button'), timeout)

Mobile.verifyElementNotExist(findTestObject('Mobile/MedTrackPages/XCUIElementTypeStaticText - Sign in to continue'), timeout)

