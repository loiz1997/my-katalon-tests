import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import internal.GlobalVariable as GlobalVariable

/**
 * MedTrack iOS admin login.
 * Objects: Object Repository/Mobile/MedTrack
 * Credentials: Profiles/default (admin_username, admin_password)
 *
 * App path must be the simulator .app bundle (not the Runner folder name).
 */
int timeout = 10

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

Mobile.verifyElementNotExist(findTestObject('Mobile/MedTrackPages/XCUIElementTypeStaticText - Sign in to continue'), timeout)

Mobile.verifyElementNotExist(findTestObject('Mobile/MedTrackPages/XCUIElementTypeButton - login_admin_submit_button'), timeout)

