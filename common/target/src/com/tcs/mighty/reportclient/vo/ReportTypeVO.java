// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: ValueObject.vsl in andromda-java-cartridge.
//
package com.tcs.mighty.reportclient.vo;

/**
 * 
 */
public class ReportTypeVO
    implements java.io.Serializable
{
    /**
     * The serial version UID of this class. Needed for serialization.
     */
    private static final long serialVersionUID = -3159320049513220931L;

    public ReportTypeVO()
    {
        this.name = null;
        this.displayName = null;
        this.displayOrder = null;
        this.id = null;
    }

    public ReportTypeVO(java.lang.String name, java.lang.String displayName, java.lang.Long displayOrder, java.lang.Long id)
    {
        this.name = name;
        this.displayName = displayName;
        this.displayOrder = displayOrder;
        this.id = id;
    }

    /**
     * Copies constructor from other ReportTypeVO
     *
     * @param otherBean, cannot be <code>null</code>
     * @throws java.lang.NullPointerException if the argument is <code>null</code>
     */
    public ReportTypeVO(ReportTypeVO otherBean)
    {
        this(otherBean.getName(), otherBean.getDisplayName(), otherBean.getDisplayOrder(), otherBean.getId());
    }

    /**
     * Copies all properties from the argument value object into this value object.
     */
    public void copy(ReportTypeVO otherBean)
    {
        if (otherBean != null)
        {
            this.setName(otherBean.getName());
            this.setDisplayName(otherBean.getDisplayName());
            this.setDisplayOrder(otherBean.getDisplayOrder());
            this.setId(otherBean.getId());
        }
    }

    private java.lang.String name;

    /**
     * 
     */
    public java.lang.String getName()
    {
        return this.name;
    }

    public void setName(java.lang.String name)
    {
        this.name = name;
    }

    private java.lang.String displayName;

    /**
     * 
     */
    public java.lang.String getDisplayName()
    {
        return this.displayName;
    }

    public void setDisplayName(java.lang.String displayName)
    {
        this.displayName = displayName;
    }

    private java.lang.Long displayOrder;

    /**
     * 
     */
    public java.lang.Long getDisplayOrder()
    {
        return this.displayOrder;
    }

    public void setDisplayOrder(java.lang.Long displayOrder)
    {
        this.displayOrder = displayOrder;
    }

    private java.lang.Long id;

    /**
     * 
     */
    public java.lang.Long getId()
    {
        return this.id;
    }

    public void setId(java.lang.Long id)
    {
        this.id = id;
    }

	private java.lang.String reportTypeId;

    /**
     * 
     */
    public java.lang.String getReportTypeId()
    {
        return this.reportTypeId;
    }

    public void setReportTypeId(java.lang.String reportTypeId)
    {
        this.reportTypeId = reportTypeId;
    }

}