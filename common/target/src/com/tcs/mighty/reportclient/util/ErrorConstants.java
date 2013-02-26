
package com.tcs.mighty.reportclient.util;


public class ErrorConstants {

	
	//Error Codes

	//Session Expiry
	public static final java.lang.String APP_SESSION_EXPIRY_MSG = "Session Expired.Please Login.";

	//System Exceptions
	public static final java.lang.String APP_SYSTEM_EXCEPTION = "System Error Occurred. Please contact Administrator.";
	public static final int APP_SESSION_EXPIRY_RESPONSE_CODE = 411;

	//Custom Exceptions
	public static final int APP_EXCEPTION_RESPONSE_CODE = 410;
	
	//Defect Exceptions
	public static final int ERROR_CODE_DEFECT = 601;

	public static final java.lang.String ERROR_MSG_DEFECT_NO_MASTER_DATA_FOUND =  "No Defect master data found!! Please contact system administrator.";

	//Delete Flag
	public static final java.lang.String DELETE_FLAG_SET = "Y";
	public static final java.lang.String DELETE_FLAG_RESET = "N";

	// Manage Users
	//public static final java.lang.String TM_USER_ALREADY_ADDED_PL_CODE = "TM_100";
		
	//public static final java.lang.String TM_USER_INACTIVE_CODE = "TM_101";
	
	//public static final java.lang.String TM_USER_NOT_AVALABLE_DB_MSG = "User is not available in the database.";
	//public static final java.lang.String TM_USER_NOT_AVALABLE_DB_CODE = "TM_102";
	
	//public static final java.lang.String TM_OLD_PASSWORD_INVALID_CODE = "TM_103";
	

	
	//public static final java.lang.String TM_PL_NOT_AVALABLE_DB_MSG = "Project is not available in the database.";
	//public static final java.lang.String TM_PL_NOT_AVALABLE_DB_CODE = "TM_105";
	
	//public static final java.lang.String TM_USER2PLMAP_NOT_AVAILABLE_DB_MSG = "AppUser2PlMap is not available in the database.";
	//public static final java.lang.String TM_USER2PLMAP_NOT_AVAILABLE_DB_CODE = "TM_106";
	
	//public static final java.lang.String TM_USER_ACTIVE_IN_PL_CODE = "TM_107";
	
	/*public static final java.lang.String TM_USER_IS_PL_MGR_MSG = "User is an active Product Line Manager. Cannot be made inactive.";
	public static final java.lang.String TM_USER_IS_PL_MGR_CODE = "TM_108";
	
	public static final java.lang.String TM_USER_IS_PROD_MGR_MSG = "User is an active Product Manager. Cannot be made inactive.";
	public static final java.lang.String TM_USER_IS_PROD_MGR_CODE = "TM_109";
	
	public static final java.lang.String TM_USER_IS_PROD_IMPL_LEAD_MSG = "User is an active Product Implementation Lead. Cannot be made inactive.";
	public static final java.lang.String TM_USER_IS_PROD_IMPL_LEAD_CODE = "TM_110";
	
	public static final java.lang.String TM_USER_IS_CLIENT_IMPL_LEAD_MSG = "User is an active Client Implementation Lead. Cannot be made inactive.";
	public static final java.lang.String TM_USER_IS_CLIENT_IMPL_LEAD_CODE = "TM_111";
	
	public static final java.lang.String TM_USER_PROD_MGR_NO_DESELECT_MSG = "User is an active Product Manager. Cannot deselect Product Manager role.";
	public static final java.lang.String TM_USER_PROD_MGR_NO_DESELECT_CODE = "TM_112";
	
	public static final java.lang.String TM_USER_PROD_IMPL_LEAD_NO_DESELECT_MSG = "User is an active Product Implementation Lead. Cannot deselect Product Implementation Lead role.";
	public static final java.lang.String TM_USER_PROD_IMPL_LEAD_NO_DESELECT_CODE = "TM_113";
	
	public static final java.lang.String TM_USER_CLIENT_IMPL_LEAD_NO_DESELECT_MSG = "User is an active Client Implementation Lead. Cannot deselect Client Implementation Lead role.";
	public static final java.lang.String TM_USER_CLIENT_IMPL_LEAD_NO_DESELECT_CODE = "TM_114";*/
	
	//public static final java.lang.String TM_USER_ALREADY_PRESENT_DB_CODE = "TM_115";
	
	public static final java.lang.String TM_MANAGE_USER_ERROR = "Error Occurred. Please Contact System Administrator.";
	
	// Project level
	
	//public static final java.lang.String TM_DUP_PRO_NAME_CODE = "TM_PM_001";

	// Test Case
	public static final java.lang.String ERR_ENTITY_CONCURRENT_CHECKOUT_IN_PROGRESS = "ERR_REQ_TC_001";
	public static final java.lang.String ERR_ENTITY_STALE_DATA_DETECTED = "ERR_REQ_TC_002";
	public static final java.lang.String ERR_ENTITY_ILLEGAL_OPERATION_ATTEMPTED = "ERR_REQ_TC_003";
	
	//App Default Config
	public static final java.lang.String ERR_APP_METH_INVALID_INPUT = "ERR_APP_001";
	
	
	//Selenium 
	
	public static final java.lang.String TM_SELENIUM_SERVER_DOWN_CODE = "TM_120";
	public static final java.lang.String TM_SELENIUM_SERVER_DOWN_MSG = "Selenium Server is down or not responding properly. Please contact the System Administrator.";
	
	
	public static final java.lang.String TM_SELENIUM_SCRIPT_INVALID_CODE = "TM_121";
	public static final java.lang.String TM_SELENIUM_SCRIPT_INVALID_MSG = "The Selenium Script is invalid. Please create / upload the valid script.";
	
	public static final java.lang.String TPLAN_DUPLICATE_TEST_SET_MSG = "Test cycle already contains the test set. Cannot create duplicate test set.";
}

