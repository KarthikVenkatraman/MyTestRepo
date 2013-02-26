package com.tcs.mighty.reportclient.util;

public class Constants {
   
	public static final java.lang.String ENTITY_TYPE = "ENTITY_TYPE";
	
	//App Constants
	public static final String APP_TIMESTAMP_FORMAT = "dd-MM-yyyy HH:mm:ss";
	public static final String TREE_PROJECT_ROOT_TC_PATH_PREFIX = "PR_TC_";
    public static final String TREE_PROJECT_ROOT_REQ_PATH_PREFIX = "PR_REQ_";
	public static final String TREE_PATH_SEPARATOR = "/";
	public static final String YES_FLAG = "Y";
	public static final String NO_FLAG = "N";
	public static final String EXT_DATE_STR_SEPARATOR = "T";
	
	//Workflow and checkout/checkin 
	public static final String LOCKED_FLAG_YES = "Y";
	public static final String LOCKED_FLAG_NO = "N";
	public static final String CHECK_OUT_ENABLED = "CO";
	public static final String CHECK_IN_ENABLED = "CI";
	public static final String READ_ONLY = "RO";
	public static final String BASELINING_ENABLED = "BL";
	public static final String CHECK_OUT_AS_NEW_VERSION_ENABLED = "CONV";
	public static final String PROCESS_TYPE_WORKFLOW = "WK";
	public static final String PROCESS_TYPE_STATE_TRANSITION = "ST";
	public static final String WORKFLOW_STATUS_COMPLETED = "C";
	public static final String WORKFLOW_STATUS_COMPLETED_BACKWARD = "R";
	public static final String WORKFLOW_STATUS_PENDING = "P";
	//Postgres sql error state for 'Lock Not Available'
	public static final String POSTGRESQL_SQLSTATE_CLASS55_LOCK_NOT_AVAILABLE = "55P03";
	public static final String WORKFLOW_ENGINE_NOT_PENDING = "Workflow Transaction state not Pending";
	// Allocation Types
	public static final String WORKFLOW_ALLOCATION_TYPE_USER = "U";
	public static final String WORKFLOW_ALLOCATION_TYPE_ROLE = "R";
	public static final String WORKFLOW_ALLOCATION_TYPE_ROUND_ROBIN = "A";
	
	//Test Case
	public static final java.lang.String TESTCASE_ENTITY_TYPE = "TestCase";
	public static final java.lang.String ENTITY_TYPE_DOMAINID_TESTCASE = "ENTITY_TYPE_TESTCASE";
	//Domain Ids
	public static final java.lang.String DOMAIN_ID_TCASE_STATUS_NEW = "TCASE_STATUS_NEW";
	public static final int VERSION_NO_START_VALUE = 1;
	public static final java.lang.String TAG_START_VALUE = "0.0";
	public static final java.lang.Integer CYCLE_NO_START_VALUE = new java.lang.Integer(1);

	//Domain Category Ids
	public static final java.lang.String TCASE_TYPE_CATEGORY_ID = "TCASE_TYPE";
	public static final java.lang.String TCASE_STATUS_CATEGORY_ID = "TCASE_STATUS";
	public static final java.lang.String TCASE_PRIORITY_CATEGORY_ID = "TCASE_PRIORITY";
	
	public static final java.lang.String TEST_CASE_LIST_DEFAULT_SORT_COL_NAME = "createdOn";
	public static final java.lang.String REQUIREMENT_LIST_DEFAULT_SORT_COL_NAME = "createdOn";
	
	public static final java.lang.String SORT_ASC = "ASC";
	public static final java.lang.String SORT_DESC = "DESC";

    // Test Execution Constants
    
    public static final java.lang.String TEST_RUN_ID = "RUN_";
    // Tree node custom type
    
    public static final java.lang.String NODE_RELEASE = "R";
    public static final java.lang.String NODE_BUILD = "B";
    public static final java.lang.String NODE_TEST_CYCLE = "TC";
    public static final java.lang.String NODE_TEST_SET = "TS";
    
    // Step Execution status
    
    public static final java.lang.String STEP_STATUS_PASS_DOMAINID = "STEP_STATUS_PASS";
    public static final java.lang.String STEP_STATUS_FAIL_DOMAINID = "STEP_STATUS_FAIL";
    public static final java.lang.String STEP_STATUS_BLOCKED_DOMAINID = "STEP_STATUS_BLOCKED";
    
    // Domain id for test case execution type
    public static final java.lang.String TCASE_TYPE_MANUAL_DOMAINID = "TCASE_TYPE_MANUAL";
    public static final java.lang.String TCASE_TYPE_AUTO_DOMAINID = "TCASE_TYPE_AUTO";
    // Domain Id for test execution
    
    public static final java.lang.String TEST_RUN_INCOMPLETE_DOMAINID = "TRUN_STATUS_INCOMPLETE";
    public static final java.lang.String TEST_RUN_COMPLETE_DOMAINID = "TRUN_STATUS_COMPLETE";
//    public static final java.lang.String TEST_RUN_PAUSED_DOMAINID = "TRUN_STATUS_PAUSE";
    public static final java.lang.String TEST_RUN_BLOCKED_DOMAINID = "TRUN_STATUS_BLOCKED";
    public static final java.lang.String TEST_RUN_TERMINATE_DOMAINID = "TRUN_STATUS_TERMINATE";
    public static final java.lang.String TEST_RUN_INVALIDATED_DOMAINID = "TRUN_STATUS_INVALIDATED";
    public static final java.lang.String BLOCK_TYPE = "BLOCK";
    public static final java.lang.String INVALIDATE_TYPE = "INVALIDATE";
   
	// Test Case Consolidated Run Status
   /* public static final java.lang.String TC_CON_FAIL = "Fail";
    public static final java.lang.String TC_CON_PASS ="Pass";
    public static final java.lang.String TC_CON_NORUN = "No Run";
    public static final java.lang.String TC_CON_BLOCKED = "Blocked";*/
	
	// Test Case Consolidated Run Status Domain Ids
	public static final java.lang.String TC_CON_STATUS_DOMAINID_FAIL = "TC_CON_STATUS_FAIL";
    public static final java.lang.String TC_CON_STATUS_DOMAINID_PASS ="TC_CON_STATUS_PASS";
    public static final java.lang.String TC_CON_STATUS_DOMAINID_NORUN = "TC_CON_STATUS_NORUN";
    public static final java.lang.String TC_CON_STATUS_DOMAINID_BLOCKED = "TC_CON_STATUS_BLOCKED";

	// Ext Filter
	public static final java.lang.String EXT_FILTER_PREFIX = "ExtFilter_";
	public static final java.lang.String EXT_FILTER_TYPE_PREFIX = "ExtFType_";
	public static final java.lang.String EXT_FILTER_COMPARISON_PREFIX = "ExtFComparison_";
	public static final java.lang.String EXT_FILTER_COMPARISON_LT = "lt";
	public static final java.lang.String EXT_FILTER_COMPARISON_GT = "gt";
	public static final java.lang.String EXT_FILTER_COMPARISON_EQ = "eq";
	public static final java.lang.String EXT_FILTER_TYPE_STRING = "string";
	public static final java.lang.String EXT_FILTER_TYPE_LIST = "list";
	public static final java.lang.String EXT_FILTER_TYPE_DATE = "date";
	public static final java.lang.String EXT_FILTER_PARAM_DELIMITER = "~!@";
	public static final java.lang.String EXT_FILTER_TYPE_KEY = "type";
	public static final java.lang.String EXT_FILTER_VALUE_KEY = "value";
	public static final java.lang.String EXT_FILTER_COMPARISON_KEY = "comparison";
	
	//PAGINATION
	public static final int PAGE_SIZE = 10;
	public static final int START_INDEX = 0;

	
	//Defect
	public static final int DEFECT_PAGE_SIZE = 20;
	public static final int DEFECT_AUDIT_PAGE_SIZE = 20;
	//Defect Domain Category	
	public static final java.lang.String DEFECT_ENTITY_TYPE = "Defect";
	public static final java.lang.String DEFECT_ENTITY_TYPE_DOMAIN_ID = "ENTITY_TYPE_DEFECT";
	public static final java.lang.String DEFECT_SEVERITY = "DEF_SEVERITY";
	public static final java.lang.String DEFECT_PRIORITY = "DEF_PRIORITY";
	public static final java.lang.String DEFECT_STATUS = "DEF_STATUS";
	public static final java.lang.String DEFECT_TYPE= "DEFECT_TYPE";
	public static final java.lang.String DEFECT_CAUSE = "DEFECT_CAUSE";
	//Defect Domain Value	
	public static final java.lang.String DEFECT_STATUS_FIXED = "Fixed";
	public static final java.lang.String DEFECT_STATUS_VERIFIED = "Verified";
	public static final java.lang.String DEFECT_STATUS_REOPEN = "Reopen";
	//Defect Constants
	public static final java.lang.String START_STATE = "S";
	public static final java.lang.String BASELINE_STATE = "B";
	public static final java.lang.String END_STATE = "E";
	public static final java.lang.String DEFECT_SEQUENCE_NAME ="defect_sequence";
	public static final java.lang.String PROJECT_SEQUENCE_NAME ="project_sequence";
	

	
	
    	//Requirements
	public static final java.lang.String REQ_ENTITY_TYPE = "Requirement";
	public static final java.lang.String ENTITY_TYPE_DOMAINID_REQUIREMENT = "ENTITY_TYPE_REQUIREMENT";
	public static final java.lang.String DOMAIN_CATEGORY_ID_REQ_STATUS = "REQ_STATUS";
	public static final java.lang.String DOMAIN_CATEGORY_ID_REQ_PRIORITY = "REQ_PRIORITY";
	public static final java.lang.String DOMAIN_CATEGORY_ID_REQ_TYPE = "REQ_TYPE";

	
	// User
	public static final String DELETE_FLAG_YES = "Y";
	public static final String DELETE_FLAG_NO = "N";
	public static final String ADMIN_FLAG_YES = "Y";
	public static final String ADMIN_FLAG_NO = "N";
	public static final String DEFAULT_USER_PASSWORD = "password";
	public static final String IS_DEFAULT_YES = "Y";
	public static final String IS_DEFAULT_NO = "N";
	// project
	
	
	//Role
	public static final String ROLE_TYPE_PM = "ROLE_TYPE_PM";
	public static final String ROLE_TYPE_DOM_CATEGORY = "ROLE_TYPE";

	//Report
    public static final java.lang.String NODE_REPORT_PARENT_GROUP = "RP";
    public static final java.lang.String NODE_REPORT_SUB_GROUP = "RS";
    public static final java.lang.String NODE_REPORT = "REP";
	
	//State Transition Error Constants
	public static final String START_STATE_NOT_PRESENT = "Start State Not Present in From Steps";
	public static final String BASELINE_STATE_NOT_PRESENT = "Baseline State Not Present in To Steps";
	
	public static final String CUSTOM_FIELD_TYPE_LOV = "LOV";
	public static final String CUSTOM_FIELD_TYPE_DATE = "Date";
	public static final String CUSTOM_FIELD_TYPE_TEXT = "Text";

	
	//ReportEngine

	public static final int SEVERITY_ONE = 1;
	public static final java.lang.String SEVERITY = "Severity";

	// PARAMETER TYPES 
	public static final String PARAMETER_TYPE_ID_QUERY = "Q";
	public static final String PARAMETER_TYPE_ID_LIST = "L";
	public static final String PARAMETER_TYPE_ID_FREETEXT = "F";
	public static final String PARAMETER_TYPE_QUERY = "Query";
	public static final String PARAMETER_TYPE_LIST = "List";
	public static final String PARAMETER_TYPE_FREETEXT = "FreeText";

	public static final String PARAMETER_LOV_SEPARATOR_1 = ";";
	public static final String PARAMETER_LOV_SEPARATOR_2 = ",";


	public static final String YES = "Y";
	public static final String NO = "N";

	public static final String YES_LABEL = "Yes";
	public static final String NO_LABEL = "No";
	public static final java.util.HashMap reportParameterTypeMap = new java.util.HashMap();

	static{
	reportParameterTypeMap.put(PARAMETER_TYPE_ID_QUERY,PARAMETER_TYPE_QUERY);
	reportParameterTypeMap.put(PARAMETER_TYPE_ID_LIST,PARAMETER_TYPE_LIST);
	reportParameterTypeMap.put(PARAMETER_TYPE_ID_FREETEXT,PARAMETER_TYPE_FREETEXT);
	}

	// Report Data Source Types
	public static final String REPORT_DATA_SOURCE_ID_QUERY = "Q";
	public static final String REPORT_DATA_SOURCE_ID_PROC = "P";

	public static final String REPORT_DATA_SOURCE_QUERY = "Query";
	public static final String REPORT_DATA_SOURCE_PROC = "Procedure";
	public static final java.util.HashMap reportMasterDataSourceTypeMap = new java.util.HashMap();

	static{
	reportMasterDataSourceTypeMap.put(REPORT_DATA_SOURCE_ID_QUERY,REPORT_DATA_SOURCE_QUERY);
	reportMasterDataSourceTypeMap.put(REPORT_DATA_SOURCE_ID_PROC,REPORT_DATA_SOURCE_PROC);
	}


	public static final String DATA_TYPE_PRIMITIVE_INT = "DATA_TYPE_PRIMITIVE_INT";
	public static final String DATA_TYPE_PRIMITIVE_FLOAT = "DATA_TYPE_PRIMITIVE_FLOAT ";
	public static final String DATA_TYPE_PRIMITIVE_DOUBLE = "DATA_TYPE_PRIMITIVE_DOUBLE ";
	public static final String DATA_TYPE_PRIMITIVE_LONG = "DATA_TYPE_PRIMITIVE_LONG";
	public static final String DATA_TYPE_OBJECT_INTEGER = "DATA_TYPE_OBJECT_INTEGER";
	public static final String DATA_TYPE_OBJECT_FLOAT = "DATA_TYPE_OBJECT_FLOAT ";
	public static final String DATA_TYPE_OBJECT_DOUBLE = "DATA_TYPE_OBJECT_DOUBLE ";
	public static final String DATA_TYPE_OBJECT_LONG = "DATA_TYPE_OBJECT_LONG";
	public static final String DATA_TYPE_OBJECT_STRING = "DATA_TYPE_OBJECT_STRING";

	public static final String REPORT_TYPE_PIE_CHART = "PIE_CHART";
	public static final String REPORT_TYPE_BAR_CHART = "BAR_CHART";
	public static final String REPORT_TYPE_SERIES_BAR_CHART = "SERIES_BAR_CHART";

	public static final String CHART_CONFIG_TITLE = "CHART_CONFIG_TITLE";
	public static final String CHART_CONFIG_X_LABEL = "CHART_CONFIG_X_LABEL";
	public static final String CHART_CONFIG_Y_LABEL = "CHART_CONFIG_Y_LABEL";
	
	public static final String TRANSITION_DIRECTION_FWO = "O";
	
	
	// domain Id for test set type
	
	public static final String TSET_TYPE_TEMPLATE_DOMAINID = "TSET_TYPE_TEMPLATE";
	
	public static final String TSET_TYPE_TESTSET_DOMAINID = "TSET_TYPE_TESTSET";
	//Release
	public static final String RELEASE_LINK_TYPE_NEW_REQUIREMENTS = "N";
	public static final String RELEASE_LINK_TYPE_OLD_REQUIREMENTS = "O";

	public static final String TEST_SET_NEW_REQUIREMENTS = "N";
	public static final String TEST_SET_OLD_REQUIREMENTS = "O";
	public static final String TEST_SET_DEFECTS = "D";
	
	public static final String TPLAN_STATUS_ACTIVE = "TPLAN_STATUS_ACTIVE";
	public static final String TSET_TYPE_TEMPLATE = "Template";
	public static final String TSET_TYPE_TEST_SET = "Test Set";
	public static final String TSET_TYPE_NEW_REQUIREMENTS = "New Requirements";
	public static final String TSET_TYPE_DEFECT_VERIFICATION = "Defect Verification";
	public static final String TSET_TYPE_REGRESSION = "Regression";
	
	public static final String TSET_TYPE_DV_CATEGORY = "TSET_TYPE";
	public static final String TRUN_STATUS_CATEGORY_ID = "TRUN_STATUS";
	public static final String TC_CON_STATUS_CATEGORY_ID = "TC_CON_STATUS";

	//Workflow default config
	public static final String RD_DIRECTION_FORWARD_LABEL = "Forward";
	public static final String RD_DIRECTION_BACKWARDTOSAMEUSER_LABEL = "BackwardToSameUser";
	public static final String RD_DIRECTION_BACKWARDTOANY_LABEL = "BackwardToAny";
	public static final String RD_DIRECTION_FORWARDWITHOPTIONS_LABEL = "ForwardWithOptions";

	public static final String RD_DIRECTION_FORWARD = "F";
	public static final String RD_DIRECTION_BACKWARDTOSAMEUSER = "B";
	public static final String RD_DIRECTION_BACKWARDTOANY = "C";
	public static final String RD_DIRECTION_FORWARDWITHOPTIONS = "S";
	
	//License Constants
	
	public static final String NEW_LICENSE_INSALLED="New License Installed Successfully";
	public static final String LICENSE_EXPIRED="License Expired";
	public static final String LICENSE_VALIDATION_SUCCESS="License Verification Successfull";
	public static final String LICENSE_VALIDATION_ERROR="Invalid License";
	public static final String LICENSE_INSTALLATION_ERROR="Invalid License";
	public static final String LICENSE_NOT_FOUND="License File Not Found";
	public static final String INVALID_KEYSTORE="Invalid Keystore";

	public static final String LOGIN_STATUS_SUCCESS = "Login Successful";
	public static final String LOGIN_STATUS_FAILED = "Login Failed";
}
