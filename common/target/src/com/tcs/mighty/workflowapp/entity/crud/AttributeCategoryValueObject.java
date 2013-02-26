// license-header java merge-point
package com.tcs.mighty.workflowapp.entity.crud;

public class AttributeCategoryValueObject
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

    private java.lang.String description;

    public java.lang.String getDescription()
    {
        return this.description;
    }

    public void setDescription(java.lang.String description)
    {
        this.description = description;
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

    private java.lang.String keyCategoryFlag;

    public java.lang.String getKeyCategoryFlag()
    {
        return this.keyCategoryFlag;
    }

    public void setKeyCategoryFlag(java.lang.String keyCategoryFlag)
    {
        this.keyCategoryFlag = keyCategoryFlag;
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

    private java.lang.Long[] attributes;

    public java.lang.Long[] getAttributes()
    {
        return this.attributes;
    }

    public void setAttributes(java.lang.Long[] attributes)
    {
        this.attributes = attributes;
    }

    private java.lang.Long[] transactionStep;

    public java.lang.Long[] getTransactionStep()
    {
        return this.transactionStep;
    }

    public void setTransactionStep(java.lang.Long[] transactionStep)
    {
        this.transactionStep = transactionStep;
    }

    private java.lang.String[] transactionStepLabels;

    public java.lang.String[] getTransactionStepLabels()
    {
        return this.transactionStepLabels;
    }

    public void setTransactionStepLabels(java.lang.String[] transactionStepLabels)
    {
        this.transactionStepLabels = transactionStepLabels;
    }

    
    private java.lang.String transactionStepLabelsStrRep;

    public java.lang.String getTransactionStepLabelsStrRep()
    {
        return this.transactionStepLabelsStrRep;
    }

    public void setTransactionStepLabelsStrRep(java.lang.String transactionStepLabelsStrRep)
    {
        this.transactionStepLabelsStrRep = transactionStepLabelsStrRep;
    }

    private java.lang.String transactionStepIdsStrRep;

    public java.lang.String getTransactionStepIdsStrRep()
    {
        return this.transactionStepIdsStrRep;
    }

    public void setTransactionStepIdsStrRep(java.lang.String transactionStepIdsStrRep)
    {
        this.transactionStepIdsStrRep = transactionStepIdsStrRep;
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

    private java.lang.String businessEntityLabel;

    public java.lang.String getBusinessEntityLabel()
    {
        return this.businessEntityLabel;
    }

    public void setBusinessEntityLabel(java.lang.String businessEntityLabel)
    {
        this.businessEntityLabel = businessEntityLabel;
    }

    
}