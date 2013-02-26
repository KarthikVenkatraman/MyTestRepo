// license-header java merge-point
package com.tcs.mighty.workflowapp.entity.crud;

public class StepAttributeMapValueObject
    implements java.io.Serializable
{
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

    private java.lang.Long[] attributeValue;

    public java.lang.Long[] getAttributeValue()
    {
        return this.attributeValue;
    }

    public void setAttributeValue(java.lang.Long[] attributeValue)
    {
        this.attributeValue = attributeValue;
    }

    private java.lang.Long transactionStep;

    public java.lang.Long getTransactionStep()
    {
        return this.transactionStep;
    }

    public void setTransactionStep(java.lang.Long transactionStep)
    {
        this.transactionStep = transactionStep;
    }

    private java.lang.String transactionStepLabel;

    public java.lang.String getTransactionStepLabel()
    {
        return this.transactionStepLabel;
    }

    public void setTransactionStepLabel(java.lang.String transactionStepLabel)
    {
        this.transactionStepLabel = transactionStepLabel;
    }

    
}