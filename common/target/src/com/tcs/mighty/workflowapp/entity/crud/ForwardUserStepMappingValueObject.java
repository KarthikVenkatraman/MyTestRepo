// license-header java merge-point
package com.tcs.mighty.workflowapp.entity.crud;

public class ForwardUserStepMappingValueObject
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

    private java.lang.Long routingdefinition;

    public java.lang.Long getRoutingdefinition()
    {
        return this.routingdefinition;
    }

    public void setRoutingdefinition(java.lang.Long routingdefinition)
    {
        this.routingdefinition = routingdefinition;
    }

    private java.lang.Long pendingTxnStep;

    public java.lang.Long getPendingTxnStep()
    {
        return this.pendingTxnStep;
    }

    public void setPendingTxnStep(java.lang.Long pendingTxnStep)
    {
        this.pendingTxnStep = pendingTxnStep;
    }

    private java.lang.String pendingTxnStepLabel;

    public java.lang.String getPendingTxnStepLabel()
    {
        return this.pendingTxnStepLabel;
    }

    public void setPendingTxnStepLabel(java.lang.String pendingTxnStepLabel)
    {
        this.pendingTxnStepLabel = pendingTxnStepLabel;
    }

    
    private java.lang.Long userTxnStep;

    public java.lang.Long getUserTxnStep()
    {
        return this.userTxnStep;
    }

    public void setUserTxnStep(java.lang.Long userTxnStep)
    {
        this.userTxnStep = userTxnStep;
    }

    private java.lang.String userTxnStepLabel;

    public java.lang.String getUserTxnStepLabel()
    {
        return this.userTxnStepLabel;
    }

    public void setUserTxnStepLabel(java.lang.String userTxnStepLabel)
    {
        this.userTxnStepLabel = userTxnStepLabel;
    }

    
}