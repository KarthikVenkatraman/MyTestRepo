// license-header java merge-point
package com.tcs.mighty.workflowapp.entity.crud;

public class InstanceAttributeMapValueObject
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

    private java.lang.Long instance;

    public java.lang.Long getInstance()
    {
        return this.instance;
    }

    public void setInstance(java.lang.Long instance)
    {
        this.instance = instance;
    }

    private java.lang.Long[] entityInstanceValues;

    public java.lang.Long[] getEntityInstanceValues()
    {
        return this.entityInstanceValues;
    }

    public void setEntityInstanceValues(java.lang.Long[] entityInstanceValues)
    {
        this.entityInstanceValues = entityInstanceValues;
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