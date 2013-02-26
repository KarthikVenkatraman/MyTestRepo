// license-header java merge-point
package com.tcs.mighty.workflowapp.entity.crud;

public class RoutingDefinitionValueObject
    implements java.io.Serializable
{
    private java.lang.String routingCriterion;

    public java.lang.String getRoutingCriterion()
    {
        return this.routingCriterion;
    }

    public void setRoutingCriterion(java.lang.String routingCriterion)
    {
        this.routingCriterion = routingCriterion;
    }

    private java.lang.Long previousStepsRequired;

    public java.lang.Long getPreviousStepsRequired()
    {
        return this.previousStepsRequired;
    }

    public void setPreviousStepsRequired(java.lang.Long previousStepsRequired)
    {
        this.previousStepsRequired = previousStepsRequired;
    }

    private java.lang.String transitionDirection;

    public java.lang.String getTransitionDirection()
    {
        return this.transitionDirection;
    }

    public void setTransitionDirection(java.lang.String transitionDirection)
    {
        this.transitionDirection = transitionDirection;
    }

    private java.lang.String deleteParallelFlow;

    public java.lang.String getDeleteParallelFlow()
    {
        return this.deleteParallelFlow;
    }

    public void setDeleteParallelFlow(java.lang.String deleteParallelFlow)
    {
        this.deleteParallelFlow = deleteParallelFlow;
    }

    private java.lang.Integer escalateAfter;

    public java.lang.Integer getEscalateAfter()
    {
        return this.escalateAfter;
    }

    public void setEscalateAfter(java.lang.Integer escalateAfter)
    {
        this.escalateAfter = escalateAfter;
    }

    private java.lang.String pendingStepsOverride;

    public java.lang.String getPendingStepsOverride()
    {
        return this.pendingStepsOverride;
    }

    public void setPendingStepsOverride(java.lang.String pendingStepsOverride)
    {
        this.pendingStepsOverride = pendingStepsOverride;
    }

    private java.lang.String buttonName;

    public java.lang.String getButtonName()
    {
        return this.buttonName;
    }

    public void setButtonName(java.lang.String buttonName)
    {
        this.buttonName = buttonName;
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

    private java.lang.Long[] pendingTxnStep;

    public java.lang.Long[] getPendingTxnStep()
    {
        return this.pendingTxnStep;
    }

    public void setPendingTxnStep(java.lang.Long[] pendingTxnStep)
    {
        this.pendingTxnStep = pendingTxnStep;
    }

    private java.lang.String[] pendingTxnStepLabels;

    public java.lang.String[] getPendingTxnStepLabels()
    {
        return this.pendingTxnStepLabels;
    }

    public void setPendingTxnStepLabels(java.lang.String[] pendingTxnStepLabels)
    {
        this.pendingTxnStepLabels = pendingTxnStepLabels;
    }

    
    private java.lang.String pendingTxnStepLabelsStrRep;

    public java.lang.String getPendingTxnStepLabelsStrRep()
    {
        return this.pendingTxnStepLabelsStrRep;
    }

    public void setPendingTxnStepLabelsStrRep(java.lang.String pendingTxnStepLabelsStrRep)
    {
        this.pendingTxnStepLabelsStrRep = pendingTxnStepLabelsStrRep;
    }

    private java.lang.String pendingTxnStepIdsStrRep;

    public java.lang.String getPendingTxnStepIdsStrRep()
    {
        return this.pendingTxnStepIdsStrRep;
    }

    public void setPendingTxnStepIdsStrRep(java.lang.String pendingTxnStepIdsStrRep)
    {
        this.pendingTxnStepIdsStrRep = pendingTxnStepIdsStrRep;
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

    
    private java.lang.Long completedTxnStep;

    public java.lang.Long getCompletedTxnStep()
    {
        return this.completedTxnStep;
    }

    public void setCompletedTxnStep(java.lang.Long completedTxnStep)
    {
        this.completedTxnStep = completedTxnStep;
    }

    private java.lang.String completedTxnStepLabel;

    public java.lang.String getCompletedTxnStepLabel()
    {
        return this.completedTxnStepLabel;
    }

    public void setCompletedTxnStepLabel(java.lang.String completedTxnStepLabel)
    {
        this.completedTxnStepLabel = completedTxnStepLabel;
    }

    
}