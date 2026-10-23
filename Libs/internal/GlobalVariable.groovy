package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object admin_username
     
    /**
     * <p></p>
     */
    public static Object admin_password
     
    /**
     * <p></p>
     */
    public static Object createdProducts
     
    /**
     * <p></p>
     */
    public static Object createdIds
     
    /**
     * <p></p>
     */
    public static Object web_uname
     
    /**
     * <p></p>
     */
    public static Object web_pass
     
    /**
     * <p></p>
     */
    public static Object test_user
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables('default')
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
    
            admin_username = selectedVariables['admin_username']
            admin_password = selectedVariables['admin_password']
            createdProducts = selectedVariables['createdProducts']
            createdIds = selectedVariables['createdIds']
            web_uname = selectedVariables['web_uname']
            web_pass = selectedVariables['web_pass']
            test_user = selectedVariables['test_user']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
