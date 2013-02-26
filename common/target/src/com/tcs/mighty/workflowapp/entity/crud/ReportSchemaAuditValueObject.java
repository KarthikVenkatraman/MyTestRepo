// license-header java merge-point
package com.tcs.mighty.workflowapp.entity.crud;

public class ReportSchemaAuditValueObject
    implements java.io.Serializable
{
    private java.lang.String attributeName;

    public java.lang.String getAttributeName()
    {
        return this.attributeName;
    }

    public void setAttributeName(java.lang.String attributeName)
    {
        this.attributeName = attributeName;
    }

    private java.lang.String parentAttributeName;

    public java.lang.String getParentAttributeName()
    {
        return this.parentAttributeName;
    }

    public void setParentAttributeName(java.lang.String parentAttributeName)
    {
        this.parentAttributeName = parentAttributeName;
    }

    private java.lang.String attributeType;

    public java.lang.String getAttributeType()
    {
        return this.attributeType;
    }

    public void setAttributeType(java.lang.String attributeType)
    {
        this.attributeType = attributeType;
    }

    private java.lang.String isTypeChanged;

    public java.lang.String getIsTypeChanged()
    {
        return this.isTypeChanged;
    }

    public void setIsTypeChanged(java.lang.String isTypeChanged)
    {
        this.isTypeChanged = isTypeChanged;
    }

    private java.lang.String isNameChanged;

    public java.lang.String getIsNameChanged()
    {
        return this.isNameChanged;
    }

    public void setIsNameChanged(java.lang.String isNameChanged)
    {
        this.isNameChanged = isNameChanged;
    }

    private java.lang.String isInSync;

    public java.lang.String getIsInSync()
    {
        return this.isInSync;
    }

    public void setIsInSync(java.lang.String isInSync)
    {
        this.isInSync = isInSync;
    }

    private java.lang.String isDeleted;

    public java.lang.String getIsDeleted()
    {
        return this.isDeleted;
    }

    public void setIsDeleted(java.lang.String isDeleted)
    {
        this.isDeleted = isDeleted;
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

    private java.lang.Long businessEntity;

    public java.lang.Long getBusinessEntity()
    {
        return this.businessEntity;
    }

    public void setBusinessEntity(java.lang.Long businessEntity)
    {
        this.businessEntity = businessEntity;
    }

}