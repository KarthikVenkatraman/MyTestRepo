// license-header java merge-point
package com.tcs.mighty.workflowapp.entity.crud;

public class DashboardValueObject
    implements java.io.Serializable
{
    private java.lang.String viewFlag;

    public java.lang.String getViewFlag()
    {
        return this.viewFlag;
    }

    public void setViewFlag(java.lang.String viewFlag)
    {
        this.viewFlag = viewFlag;
    }

    private java.lang.String name;

    public java.lang.String getName()
    {
        return this.name;
    }

    public void setName(java.lang.String name)
    {
        this.name = name;
    }

    private java.lang.Long id;

    public java.lang.Long getId()
    {
        return this.id;
    }

    public void setId(java.lang.Long id)
    {
        this.id = id;
    }

    private java.lang.Long transaction;

    public java.lang.Long getTransaction()
    {
        return this.transaction;
    }

    public void setTransaction(java.lang.Long transaction)
    {
        this.transaction = transaction;
    }

    private java.lang.String transactionLabel;

    public java.lang.String getTransactionLabel()
    {
        return this.transactionLabel;
    }

    public void setTransactionLabel(java.lang.String transactionLabel)
    {
        this.transactionLabel = transactionLabel;
    }

    private java.lang.Long[] baseFilter;

    public java.lang.Long[] getBaseFilter()
    {
        return this.baseFilter;
    }

    public void setBaseFilter(java.lang.Long[] baseFilter)
    {
        this.baseFilter = baseFilter;
    }

    private java.lang.Long row;

    public java.lang.Long getRow()
    {
        return this.row;
    }

    public void setRow(java.lang.Long row)
    {
        this.row = row;
    }

    private java.lang.Long column;

    public java.lang.Long getColumn()
    {
        return this.column;
    }

    public void setColumn(java.lang.Long column)
    {
        this.column = column;
    }

    private java.lang.Long[] roles;

    public java.lang.Long[] getRoles()
    {
        return this.roles;
    }

    public void setRoles(java.lang.Long[] roles)
    {
        this.roles = roles;
    }

    private java.lang.String[] rolesLabels;

    public java.lang.String[] getRolesLabels()
    {
        return this.rolesLabels;
    }

    public void setRolesLabels(java.lang.String[] rolesLabels)
    {
        this.rolesLabels = rolesLabels;
    }

}