// license-header java merge-point
package com.tcs.mighty.workflowapp.entity.crud;

public class WorkflowTxnParamValueObject
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

    private java.lang.String key;

    public java.lang.String getKey()
    {
        return this.key;
    }

    public void setKey(java.lang.String key)
    {
        this.key = key;
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

    private java.lang.Long workflowTransaction;

    public java.lang.Long getWorkflowTransaction()
    {
        return this.workflowTransaction;
    }

    public void setWorkflowTransaction(java.lang.Long workflowTransaction)
    {
        this.workflowTransaction = workflowTransaction;
    }

}