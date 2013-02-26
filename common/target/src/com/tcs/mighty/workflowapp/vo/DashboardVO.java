// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: ValueObject.vsl in andromda-java-cartridge.
//
package com.tcs.mighty.workflowapp.vo;

/**
 * 
 */
public class DashboardVO
    implements java.io.Serializable
{
    /**
     * The serial version UID of this class. Needed for serialization.
     */
    private static final long serialVersionUID = -4139221593258802665L;

    public DashboardVO()
    {
    }

    public DashboardVO(java.lang.Long transactionId, java.lang.Long businessEntityId, java.lang.Long dashboardId, java.lang.String dashboardName, com.tcs.mighty.workflowapp.vo.DashboardFilterVO row, com.tcs.mighty.workflowapp.vo.DashboardFilterVO column, java.lang.String viewFlag, java.util.Collection baseFilterAttributeValues, java.lang.Long[] baseFilterAsIds, java.lang.String roleIdCSV, java.lang.String roleNameCSV, java.lang.Long[] roles)
    {
        this.transactionId = transactionId;
        this.businessEntityId = businessEntityId;
        this.dashboardId = dashboardId;
        this.dashboardName = dashboardName;
        this.row = row;
        this.column = column;
        this.viewFlag = viewFlag;
        this.baseFilterAttributeValues = baseFilterAttributeValues;
        this.baseFilterAsIds = baseFilterAsIds;
        this.roleIdCSV = roleIdCSV;
        this.roleNameCSV = roleNameCSV;
        this.roles = roles;
    }

    /**
     * Copies constructor from other DashboardVO
     *
     * @param otherBean, cannot be <code>null</code>
     * @throws java.lang.NullPointerException if the argument is <code>null</code>
     */
    public DashboardVO(DashboardVO otherBean)
    {
        this(otherBean.getTransactionId(), otherBean.getBusinessEntityId(), otherBean.getDashboardId(), otherBean.getDashboardName(), otherBean.getRow(), otherBean.getColumn(), otherBean.getViewFlag(), otherBean.getBaseFilterAttributeValues(), otherBean.getBaseFilterAsIds(), otherBean.getRoleIdCSV(), otherBean.getRoleNameCSV(), otherBean.getRoles());
    }

    /**
     * Copies all properties from the argument value object into this value object.
     */
    public void copy(DashboardVO otherBean)
    {
        if (otherBean != null)
        {
            this.setTransactionId(otherBean.getTransactionId());
            this.setBusinessEntityId(otherBean.getBusinessEntityId());
            this.setDashboardId(otherBean.getDashboardId());
            this.setDashboardName(otherBean.getDashboardName());
            this.setRow(otherBean.getRow());
            this.setColumn(otherBean.getColumn());
            this.setViewFlag(otherBean.getViewFlag());
            this.setBaseFilterAttributeValues(otherBean.getBaseFilterAttributeValues());
            this.setBaseFilterAsIds(otherBean.getBaseFilterAsIds());
            this.setRoleIdCSV(otherBean.getRoleIdCSV());
            this.setRoleNameCSV(otherBean.getRoleNameCSV());
            this.setRoles(otherBean.getRoles());
        }
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

    private java.lang.Long dashboardId;

    /**
     * 
     */
    public java.lang.Long getDashboardId()
    {
        return this.dashboardId;
    }

    public void setDashboardId(java.lang.Long dashboardId)
    {
        this.dashboardId = dashboardId;
    }

    private java.lang.String dashboardName;

    /**
     * 
     */
    public java.lang.String getDashboardName()
    {
        return this.dashboardName;
    }

    public void setDashboardName(java.lang.String dashboardName)
    {
        this.dashboardName = dashboardName;
    }

    private com.tcs.mighty.workflowapp.vo.DashboardFilterVO row;

    /**
     * 
     */
    public com.tcs.mighty.workflowapp.vo.DashboardFilterVO getRow()
    {
        return this.row;
    }

    public void setRow(com.tcs.mighty.workflowapp.vo.DashboardFilterVO row)
    {
        this.row = row;
    }

    private com.tcs.mighty.workflowapp.vo.DashboardFilterVO column;

    /**
     * 
     */
    public com.tcs.mighty.workflowapp.vo.DashboardFilterVO getColumn()
    {
        return this.column;
    }

    public void setColumn(com.tcs.mighty.workflowapp.vo.DashboardFilterVO column)
    {
        this.column = column;
    }

    private java.lang.String viewFlag;

    /**
     * 
     */
    public java.lang.String getViewFlag()
    {
        return this.viewFlag;
    }

    public void setViewFlag(java.lang.String viewFlag)
    {
        this.viewFlag = viewFlag;
    }

    private java.util.Collection baseFilterAttributeValues;

    /**
     * 
     */
    public java.util.Collection getBaseFilterAttributeValues()
    {
        return this.baseFilterAttributeValues;
    }

    public void setBaseFilterAttributeValues(java.util.Collection baseFilterAttributeValues)
    {
        this.baseFilterAttributeValues = baseFilterAttributeValues;
    }

    private java.lang.Long[] baseFilterAsIds;

    /**
     * 
     */
    public java.lang.Long[] getBaseFilterAsIds()
    {
        return this.baseFilterAsIds;
    }

    public void setBaseFilterAsIds(java.lang.Long[] baseFilterAsIds)
    {
        this.baseFilterAsIds = baseFilterAsIds;
    }

    private java.lang.String roleIdCSV;

    /**
     * 
     */
    public java.lang.String getRoleIdCSV()
    {
        return this.roleIdCSV;
    }

    public void setRoleIdCSV(java.lang.String roleIdCSV)
    {
        this.roleIdCSV = roleIdCSV;
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

    private java.lang.Long[] roles;

    /**
     * 
     */
    public java.lang.Long[] getRoles()
    {
        return this.roles;
    }

    public void setRoles(java.lang.Long[] roles)
    {
        this.roles = roles;
    }

}