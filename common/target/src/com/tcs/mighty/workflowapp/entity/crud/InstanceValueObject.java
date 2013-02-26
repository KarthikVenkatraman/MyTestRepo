// license-header java merge-point
package com.tcs.mighty.workflowapp.entity.crud;

public class InstanceValueObject
    implements java.io.Serializable
{
    private java.sql.Timestamp lastUpdatedOn;

    public java.sql.Timestamp getLastUpdatedOn()
    {
        return this.lastUpdatedOn;
    }

    public void setLastUpdatedOn(java.sql.Timestamp lastUpdatedOn)
    {
        this.lastUpdatedOn = lastUpdatedOn;
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

    private java.lang.Long[] instanceAttributeMap;

    public java.lang.Long[] getInstanceAttributeMap()
    {
        return this.instanceAttributeMap;
    }

    public void setInstanceAttributeMap(java.lang.Long[] instanceAttributeMap)
    {
        this.instanceAttributeMap = instanceAttributeMap;
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

    
    private java.lang.Long submittedUser;

    public java.lang.Long getSubmittedUser()
    {
        return this.submittedUser;
    }

    public void setSubmittedUser(java.lang.Long submittedUser)
    {
        this.submittedUser = submittedUser;
    }

    private java.lang.String submittedUserLabel;

    public java.lang.String getSubmittedUserLabel()
    {
        return this.submittedUserLabel;
    }

    public void setSubmittedUserLabel(java.lang.String submittedUserLabel)
    {
        this.submittedUserLabel = submittedUserLabel;
    }

    
}