// license-header java merge-point
package com.tcs.mighty.workflowapp.entity.crud;

public class ReportsValueObject
    implements java.io.Serializable
{
    private java.lang.String name;

    public java.lang.String getName()
    {
        return this.name;
    }

    public void setName(java.lang.String name)
    {
        this.name = name;
    }

    private java.lang.String displayName;

    public java.lang.String getDisplayName()
    {
        return this.displayName;
    }

    public void setDisplayName(java.lang.String displayName)
    {
        this.displayName = displayName;
    }

    private java.lang.Long displayOrder;

    public java.lang.Long getDisplayOrder()
    {
        return this.displayOrder;
    }

    public void setDisplayOrder(java.lang.Long displayOrder)
    {
        this.displayOrder = displayOrder;
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

    private java.lang.Long[] reportsParam;

    public java.lang.Long[] getReportsParam()
    {
        return this.reportsParam;
    }

    public void setReportsParam(java.lang.Long[] reportsParam)
    {
        this.reportsParam = reportsParam;
    }

    private java.lang.Long reportType;

    public java.lang.Long getReportType()
    {
        return this.reportType;
    }

    public void setReportType(java.lang.Long reportType)
    {
        this.reportType = reportType;
    }

}