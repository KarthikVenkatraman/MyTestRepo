// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: ValueObject.vsl in andromda-java-cartridge.
//
package com.tcs.mighty.workflowapp.vo;

/**
 * 
 */
public class RefinedSearchAttributesVO
    implements java.io.Serializable
{
    /**
     * The serial version UID of this class. Needed for serialization.
     */
    private static final long serialVersionUID = -3080121544539928326L;

    public RefinedSearchAttributesVO()
    {
        this.appUserId = null;
        this.businessUnitIdOfUser = null;
        this.userId = null;
    }

    public RefinedSearchAttributesVO(java.lang.Long appUserId, java.lang.String businessUnitIdOfUser, java.lang.String userId)
    {
        this.appUserId = appUserId;
        this.businessUnitIdOfUser = businessUnitIdOfUser;
        this.userId = userId;
    }

    public RefinedSearchAttributesVO(java.util.Collection attributes, java.lang.Long businessEntityId, java.lang.Long appUserId, java.lang.String[] workflowStatus, java.sql.Timestamp txnCompletionTime, java.sql.Timestamp txnStartTime, java.lang.Long transactionId, java.lang.String roleNameCSV, java.lang.String dynamicSelectClause, java.lang.Long instanceId, java.lang.String businessEntityDisplayName, java.lang.String businessEntityName, java.util.Collection transactionSteps, int startIndex, int endIndex, java.lang.String sortClause, java.lang.String isNewSearch, java.lang.String businessUnitIdOfUser, java.lang.String filterBy, boolean isProcessOwner, boolean isAdminUser, java.lang.String initiatorUserId, java.lang.Long initiatorId, java.lang.String userId, java.lang.String[] viewableRoles, java.lang.String ownerRole, boolean canViewProcess, java.util.Collection totalAttributes)
    {
        this.attributes = attributes;
        this.businessEntityId = businessEntityId;
        this.appUserId = appUserId;
        this.workflowStatus = workflowStatus;
        this.txnCompletionTime = txnCompletionTime;
        this.txnStartTime = txnStartTime;
        this.transactionId = transactionId;
        this.roleNameCSV = roleNameCSV;
        this.dynamicSelectClause = dynamicSelectClause;
        this.instanceId = instanceId;
        this.businessEntityDisplayName = businessEntityDisplayName;
        this.businessEntityName = businessEntityName;
        this.transactionSteps = transactionSteps;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
        this.sortClause = sortClause;
        this.isNewSearch = isNewSearch;
        this.businessUnitIdOfUser = businessUnitIdOfUser;
        this.filterBy = filterBy;
        this.isProcessOwner = isProcessOwner;
        this.isAdminUser = isAdminUser;
        this.initiatorUserId = initiatorUserId;
        this.initiatorId = initiatorId;
        this.userId = userId;
        this.viewableRoles = viewableRoles;
        this.ownerRole = ownerRole;
        this.canViewProcess = canViewProcess;
		this.totalAttributes = totalAttributes;
    }

    /**
     * Copies constructor from other RefinedSearchAttributesVO
     *
     * @param otherBean, cannot be <code>null</code>
     * @throws java.lang.NullPointerException if the argument is <code>null</code>
     */
    public RefinedSearchAttributesVO(RefinedSearchAttributesVO otherBean)
    {
        this(otherBean.getAttributes(), otherBean.getBusinessEntityId(), otherBean.getAppUserId(), otherBean.getWorkflowStatus(), otherBean.getTxnCompletionTime(), otherBean.getTxnStartTime(), otherBean.getTransactionId(), otherBean.getRoleNameCSV(), otherBean.getDynamicSelectClause(), otherBean.getInstanceId(), otherBean.getBusinessEntityDisplayName(), otherBean.getBusinessEntityName(), otherBean.getTransactionSteps(), otherBean.getStartIndex(), otherBean.getEndIndex(), otherBean.getSortClause(), otherBean.getIsNewSearch(), otherBean.getBusinessUnitIdOfUser(), otherBean.getFilterBy(), otherBean.isIsProcessOwner(), otherBean.isIsAdminUser(), otherBean.getInitiatorUserId(), otherBean.getInitiatorId(), otherBean.getUserId(), otherBean.getViewableRoles(), otherBean.getOwnerRole(), otherBean.isCanViewProcess(), otherBean.getTotalAttributes());
    }

    /**
     * Copies all properties from the argument value object into this value object.
     */
    public void copy(RefinedSearchAttributesVO otherBean)
    {
        if (otherBean != null)
        {
            this.setAttributes(otherBean.getAttributes());
            this.setBusinessEntityId(otherBean.getBusinessEntityId());
            this.setAppUserId(otherBean.getAppUserId());
            this.setWorkflowStatus(otherBean.getWorkflowStatus());
            this.setTxnCompletionTime(otherBean.getTxnCompletionTime());
            this.setTxnStartTime(otherBean.getTxnStartTime());
            this.setTransactionId(otherBean.getTransactionId());
            this.setRoleNameCSV(otherBean.getRoleNameCSV());
            this.setDynamicSelectClause(otherBean.getDynamicSelectClause());
            this.setInstanceId(otherBean.getInstanceId());
            this.setBusinessEntityDisplayName(otherBean.getBusinessEntityDisplayName());
            this.setBusinessEntityName(otherBean.getBusinessEntityName());
            this.setTransactionSteps(otherBean.getTransactionSteps());
            this.setStartIndex(otherBean.getStartIndex());
            this.setEndIndex(otherBean.getEndIndex());
            this.setSortClause(otherBean.getSortClause());
            this.setIsNewSearch(otherBean.getIsNewSearch());
            this.setBusinessUnitIdOfUser(otherBean.getBusinessUnitIdOfUser());
            this.setFilterBy(otherBean.getFilterBy());
            this.setIsProcessOwner(otherBean.isIsProcessOwner());
            this.setIsAdminUser(otherBean.isIsAdminUser());
            this.setInitiatorUserId(otherBean.getInitiatorUserId());
            this.setInitiatorId(otherBean.getInitiatorId());
            this.setUserId(otherBean.getUserId());
            this.setViewableRoles(otherBean.getViewableRoles());
            this.setOwnerRole(otherBean.getOwnerRole());
            this.setCanViewProcess(otherBean.isCanViewProcess());
			this.setTotalAttributes(otherBean.getTotalAttributes());
        }
    }

    private java.util.Collection attributes;

    /**
     * 
     */
    public java.util.Collection getAttributes()
    {
        return this.attributes;
    }

    public void setAttributes(java.util.Collection attributes)
    {
        this.attributes = attributes;
    }

    private java.lang.Long businessEntityId;

    /**
     * 
     */
    public java.lang.Long getBusinessEntityId()
    {
        return this.businessEntityId;
    }

    public void setBusinessEntityId(java.lang.Long businessEntityId)
    {
        this.businessEntityId = businessEntityId;
    }

    private java.lang.Long appUserId;

    /**
     * 
     */
    public java.lang.Long getAppUserId()
    {
        return this.appUserId;
    }

    public void setAppUserId(java.lang.Long appUserId)
    {
        this.appUserId = appUserId;
    }

    private java.lang.String[] workflowStatus;

    /**
     * 
     */
    public java.lang.String[] getWorkflowStatus()
    {
        return this.workflowStatus;
    }

    public void setWorkflowStatus(java.lang.String[] workflowStatus)
    {
        this.workflowStatus = workflowStatus;
    }

    private java.sql.Timestamp txnCompletionTime;

    /**
     * 
     */
    public java.sql.Timestamp getTxnCompletionTime()
    {
        return this.txnCompletionTime;
    }

    public void setTxnCompletionTime(java.sql.Timestamp txnCompletionTime)
    {
        this.txnCompletionTime = txnCompletionTime;
    }

    private java.sql.Timestamp txnStartTime;

    /**
     * 
     */
    public java.sql.Timestamp getTxnStartTime()
    {
        return this.txnStartTime;
    }

    public void setTxnStartTime(java.sql.Timestamp txnStartTime)
    {
        this.txnStartTime = txnStartTime;
    }

    private java.lang.Long transactionId;

    /**
     * 
     */
    public java.lang.Long getTransactionId()
    {
        return this.transactionId;
    }

    public void setTransactionId(java.lang.Long transactionId)
    {
        this.transactionId = transactionId;
    }

    private java.lang.String roleNameCSV;

    /**
     * 
     */
    public java.lang.String getRoleNameCSV()
    {
        return this.roleNameCSV;
    }

    public void setRoleNameCSV(java.lang.String roleNameCSV)
    {
        this.roleNameCSV = roleNameCSV;
    }

    private java.lang.String dynamicSelectClause;

    /**
     * 
     */
    public java.lang.String getDynamicSelectClause()
    {
        return this.dynamicSelectClause;
    }

    public void setDynamicSelectClause(java.lang.String dynamicSelectClause)
    {
        this.dynamicSelectClause = dynamicSelectClause;
    }

    private java.lang.Long instanceId;

    /**
     * 
     */
    public java.lang.Long getInstanceId()
    {
        return this.instanceId;
    }

    public void setInstanceId(java.lang.Long instanceId)
    {
        this.instanceId = instanceId;
    }

    private java.lang.String businessEntityDisplayName;

    /**
     * 
     */
    public java.lang.String getBusinessEntityDisplayName()
    {
        return this.businessEntityDisplayName;
    }

    public void setBusinessEntityDisplayName(java.lang.String businessEntityDisplayName)
    {
        this.businessEntityDisplayName = businessEntityDisplayName;
    }

    private java.lang.String businessEntityName;

    /**
     * 
     */
    public java.lang.String getBusinessEntityName()
    {
        return this.businessEntityName;
    }

    public void setBusinessEntityName(java.lang.String businessEntityName)
    {
        this.businessEntityName = businessEntityName;
    }

    private java.util.Collection transactionSteps;

    /**
     * 
     */
    public java.util.Collection getTransactionSteps()
    {
        return this.transactionSteps;
    }

    public void setTransactionSteps(java.util.Collection transactionSteps)
    {
        this.transactionSteps = transactionSteps;
    }

    private int startIndex;

    /**
     * 
     */
    public int getStartIndex()
    {
        return this.startIndex;
    }

    public void setStartIndex(int startIndex)
    {
        this.startIndex = startIndex;
    }

    private int endIndex;

    /**
     * 
     */
    public int getEndIndex()
    {
        return this.endIndex;
    }

    public void setEndIndex(int endIndex)
    {
        this.endIndex = endIndex;
    }

    private java.lang.String sortClause;

    /**
     * 
     */
    public java.lang.String getSortClause()
    {
        return this.sortClause;
    }

    public void setSortClause(java.lang.String sortClause)
    {
        this.sortClause = sortClause;
    }

    private java.lang.String isNewSearch;

    /**
     * 
     */
    public java.lang.String getIsNewSearch()
    {
        return this.isNewSearch;
    }

    public void setIsNewSearch(java.lang.String isNewSearch)
    {
        this.isNewSearch = isNewSearch;
    }

    private java.lang.String businessUnitIdOfUser;

    /**
     * 
     */
    public java.lang.String getBusinessUnitIdOfUser()
    {
        return this.businessUnitIdOfUser;
    }

    public void setBusinessUnitIdOfUser(java.lang.String businessUnitIdOfUser)
    {
        this.businessUnitIdOfUser = businessUnitIdOfUser;
    }

    private java.lang.String filterBy;

    /**
     * 
     */
    public java.lang.String getFilterBy()
    {
        return this.filterBy;
    }

    public void setFilterBy(java.lang.String filterBy)
    {
        this.filterBy = filterBy;
    }

    private boolean isProcessOwner;

    /**
     * 
     */
    public boolean isIsProcessOwner()
    {
        return this.isProcessOwner;
    }

    public void setIsProcessOwner(boolean isProcessOwner)
    {
        this.isProcessOwner = isProcessOwner;
    }

    private boolean isAdminUser;

    /**
     * 
     */
    public boolean isIsAdminUser()
    {
        return this.isAdminUser;
    }

    public void setIsAdminUser(boolean isAdminUser)
    {
        this.isAdminUser = isAdminUser;
    }

    private java.lang.String initiatorUserId;

    /**
     * 
     */
    public java.lang.String getInitiatorUserId()
    {
        return this.initiatorUserId;
    }

    public void setInitiatorUserId(java.lang.String initiatorUserId)
    {
        this.initiatorUserId = initiatorUserId;
    }

    private java.lang.Long initiatorId;

    /**
     * 
     */
    public java.lang.Long getInitiatorId()
    {
        return this.initiatorId;
    }

    public void setInitiatorId(java.lang.Long initiatorId)
    {
        this.initiatorId = initiatorId;
    }

    private java.lang.String userId;

    /**
     * 
     */
    public java.lang.String getUserId()
    {
        return this.userId;
    }

    public void setUserId(java.lang.String userId)
    {
        this.userId = userId;
    }

    private java.lang.String[] viewableRoles;

    /**
     * 
     */
    public java.lang.String[] getViewableRoles()
    {
        return this.viewableRoles;
    }

    public void setViewableRoles(java.lang.String[] viewableRoles)
    {
        this.viewableRoles = viewableRoles;
    }

    private java.lang.String ownerRole;

    /**
     * 
     */
    public java.lang.String getOwnerRole()
    {
        return this.ownerRole;
    }

    public void setOwnerRole(java.lang.String ownerRole)
    {
        this.ownerRole = ownerRole;
    }

    private boolean canViewProcess;

    /**
     * 
     */
    public boolean isCanViewProcess()
    {
        return this.canViewProcess;
    }

    public void setCanViewProcess(boolean canViewProcess)
    {
        this.canViewProcess = canViewProcess;
    }
    
    private boolean isAllDisplayable;

    /**
     * 
     */
    public boolean getIsAllDisplayable()
    {
        return this.isAllDisplayable;
    }

    public void setIsAllDisplayable(boolean isAllDisplayable)
    {
        this.isAllDisplayable = isAllDisplayable;
    }

	 private java.util.Collection totalAttributes;

    /**
     * 
     */
    public java.util.Collection getTotalAttributes()
    {
        return this.totalAttributes;
    }

    public void setTotalAttributes(java.util.Collection totalAttributes)
    {
        this.totalAttributes = totalAttributes;
    }


}