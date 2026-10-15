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

Mobile.startApplication('/Users/77qatechteam/Downloads/bitbar-sample-app.apk', true)

Mobile.tapAtPosition(413, 409)

Mobile.tap(findTestObject('Mobile/BitBarPages/android.widget.EditText - Please type your name to proceed (1)'), 60)

Mobile.sendKeys('Test')

Mobile.tap(findTestObject('Mobile/BitBarPages/android.widget.Button - Answer (1)'), 60)

Mobile.tapAtPosition(708, 726)

Mobile.tap(findTestObject('Mobile/BitBarPages/android.widget.TextView - Wrong Answer'), 60)

Mobile.tap(findTestObject('Mobile/BitBarPages/android.widget.TextView - Havent you heard about Testdroid Cloud'), 60)

Mobile.closeApplication()

