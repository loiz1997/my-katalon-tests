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
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables('default')
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
    
            admin_username = selectedVariables['admin_username']
            admin_password = selectedVariables['admin_password']
            createdProducts = selectedVariables['createdProducts']
            createdIds = selectedVariables['createdIds']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
