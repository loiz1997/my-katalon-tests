try {
    CustomKeywords.'com.orangehrm.OrangeHrmLaunchKeyword.launchApplication'('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')
    CustomKeywords.'com.orangehrm.OrangeHrmLoginKeyword.loginToOrangeHrm'('Admin', 'admin123')
    CustomKeywords.'com.orangehrm.OrangeHrmVerificationKeyword.verifyDashboard'()
    CustomKeywords.'com.orangehrm.OrangeHrmNavigationKeyword.navigateToModule'('My Info')
} finally {
    CustomKeywords.'com.orangehrm.OrangeHrmCloseKeyword.closeApplication'()
}