// license-header java merge-point
package com.tcs.mighty.workflowapp.entity.crud;

public class AttributeValueValueObject
    implements java.io.Serializable
{
    private java.lang.String value;

    public java.lang.String getValue()
    {
        return this.value;
    }

    public void setValue(java.lang.String value)
    {
        this.value = value;
    }

    private java.lang.Integer displayOrder;

    public java.lang.Integer getDisplayOrder()
    {
        return this.displayOrder;
    }

    public void setDisplayOrder(java.lang.Integer displayOrder)
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

    private java.lang.Long attribute;

    public java.lang.Long getAttribute()
    {
        return this.attribute;
    }

    public void setAttribute(java.lang.Long attribute)
    {
        this.attribute = attribute;
    }

    private java.lang.Long[] followUpAttributes;

    public java.lang.Long[] getFollowUpAttributes()
    {
        return this.followUpAttributes;
    }

    public void setFollowUpAttributes(java.lang.Long[] followUpAttributes)
    {
        this.followUpAttributes = followUpAttributes;
    }

    private java.lang.Long[] parentAttributeValues;

    public java.lang.Long[] getParentAttributeValues()
    {
        return this.parentAttributeValues;
    }

    public void setParentAttributeValues(java.lang.Long[] parentAttributeValues)
    {
        this.parentAttributeValues = parentAttributeValues;
    }

    private java.lang.Long[] childAttributeValues;

    public java.lang.Long[] getChildAttributeValues()
    {
        return this.childAttributeValues;
    }

    public void setChildAttributeValues(java.lang.Long[] childAttributeValues)
    {
        this.childAttributeValues = childAttributeValues;
    }

}