// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: ValueObject.vsl in andromda-java-cartridge.
//
package com.tcs.mighty.reportclient.vo;

/**
 * 
 */
public class ReportColumnLabelVO
    implements java.io.Serializable
{
    /**
     * The serial version UID of this class. Needed for serialization.
     */
    private static final long serialVersionUID = 1441996263907706341L;

    public ReportColumnLabelVO()
    {
        this.columnOrder = null;
        this.displayName = null;
        this.name = null;
    }

    public ReportColumnLabelVO(java.lang.Long columnOrder, java.lang.String displayName, java.lang.String name)
    {
        this.columnOrder = columnOrder;
        this.displayName = displayName;
        this.name = name;
    }

    public ReportColumnLabelVO(java.lang.Long columnOrder, java.lang.String displayName, java.lang.Long id, java.lang.String name)
    {
        this.columnOrder = columnOrder;
        this.displayName = displayName;
        this.id = id;
        this.name = name;
    }

    /**
     * Copies constructor from other ReportColumnLabelVO
     *
     * @param otherBean, cannot be <code>null</code>
     * @throws java.lang.NullPointerException if the argument is <code>null</code>
     */
    public ReportColumnLabelVO(ReportColumnLabelVO otherBean)
    {
        this(otherBean.getColumnOrder(), otherBean.getDisplayName(), otherBean.getId(), otherBean.getName());
    }

    /**
     * Copies all properties from the argument value object into this value object.
     */
    public void copy(ReportColumnLabelVO otherBean)
    {
        if (otherBean != null)
        {
            this.setColumnOrder(otherBean.getColumnOrder());
            this.setDisplayName(otherBean.getDisplayName());
            this.setId(otherBean.getId());
            this.setName(otherBean.getName());
        }
    }

    private java.lang.Long columnOrder;

    /**
     * 
     */
    public java.lang.Long getColumnOrder()
    {
        return this.columnOrder;
    }

    public void setColumnOrder(java.lang.Long columnOrder)
    {
        this.columnOrder = columnOrder;
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

	private java.lang.String labelId;
    /**
     * 
     */
    public java.lang.String getLabelId()
    {
        return this.labelId;
    }

    public void setLabelId(java.lang.String labelId)
    {
        this.labelId = labelId;
    }
}