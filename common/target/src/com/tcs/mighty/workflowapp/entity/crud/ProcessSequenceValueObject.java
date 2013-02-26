// license-header java merge-point
package com.tcs.mighty.workflowapp.entity.crud;

public class ProcessSequenceValueObject
    implements java.io.Serializable
{
    private java.lang.Long currentValue;

    public java.lang.Long getCurrentValue()
    {
        return this.currentValue;
    }

    public void setCurrentValue(java.lang.Long currentValue)
    {
        this.currentValue = currentValue;
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

    
    private java.lang.Long attribute;

    public java.lang.Long getAttribute()
    {
        return this.attribute;
    }

    public void setAttribute(java.lang.Long attribute)
    {
        this.attribute = attribute;
    }

}