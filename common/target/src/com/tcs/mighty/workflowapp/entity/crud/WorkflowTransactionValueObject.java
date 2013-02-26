// license-header java merge-point
package com.tcs.mighty.workflowapp.entity.crud;

public class WorkflowTransactionValueObject
    implements java.io.Serializable
{
    private java.sql.Timestamp entryTime;

    public java.sql.Timestamp getEntryTime()
    {
        return this.entryTime;
    }

    public void setEntryTime(java.sql.Timestamp entryTime)
    {
        this.entryTime = entryTime;
    }

    private java.sql.Timestamp completionTime;

    public java.sql.Timestamp getCompletionTime()
    {
        return this.completionTime;
    }

    public void setCompletionTime(java.sql.Timestamp completionTime)
    {
        this.completionTime = completionTime;
    }

    private java.lang.String comments;

    public java.lang.String getComments()
    {
        return this.comments;
    }

    public void setComments(java.lang.String comments)
    {
        this.comments = comments;
    }

    private java.lang.String status;

    public java.lang.String getStatus()
    {
        return this.status;
    }

    public void setStatus(java.lang.String status)
    {
        this.status = status;
    }

    private java.lang.String escalateFlag;

    public java.lang.String getEscalateFlag()
    {
        return this.escalateFlag;
    }

    public void setEscalateFlag(java.lang.String escalateFlag)
    {
        this.escalateFlag = escalateFlag;
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

    private java.lang.Float weightage;

    public java.lang.Float getWeightage()
    {
        return this.weightage;
    }

    public void setWeightage(java.lang.Float weightage)
    {
        this.weightage = weightage;
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

    private java.lang.Long[] claimableRoles;

    public java.lang.Long[] getClaimableRoles()
    {
        return this.claimableRoles;
    }

    public void setClaimableRoles(java.lang.Long[] claimableRoles)
    {
        this.claimableRoles = claimableRoles;
    }

    private java.lang.String[] claimableRolesLabels;

    public java.lang.String[] getClaimableRolesLabels()
    {
        return this.claimableRolesLabels;
    }

    public void setClaimableRolesLabels(java.lang.String[] claimableRolesLabels)
    {
        this.claimableRolesLabels = claimableRolesLabels;
    }

    
    private java.lang.String claimableRolesLabelsStrRep;

    public java.lang.String getClaimableRolesLabelsStrRep()
    {
        return this.claimableRolesLabelsStrRep;
    }

    public void setClaimableRolesLabelsStrRep(java.lang.String claimableRolesLabelsStrRep)
    {
        this.claimableRolesLabelsStrRep = claimableRolesLabelsStrRep;
    }

    private java.lang.String claimableRolesIdsStrRep;

    public java.lang.String getClaimableRolesIdsStrRep()
    {
        return this.claimableRolesIdsStrRep;
    }

    public void setClaimableRolesIdsStrRep(java.lang.String claimableRolesIdsStrRep)
    {
        this.claimableRolesIdsStrRep = claimableRolesIdsStrRep;
    }

    private java.lang.Long businessKey;

    public java.lang.Long getBusinessKey()
    {
        return this.businessKey;
    }

    public void setBusinessKey(java.lang.Long businessKey)
    {
        this.businessKey = businessKey;
    }

    private java.lang.String businessKeyLabel;

    public java.lang.String getBusinessKeyLabel()
    {
        return this.businessKeyLabel;
    }

    public void setBusinessKeyLabel(java.lang.String businessKeyLabel)
    {
        this.businessKeyLabel = businessKeyLabel;
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

    
    private java.lang.Long sourceRole;

    public java.lang.Long getSourceRole()
    {
        return this.sourceRole;
    }

    public void setSourceRole(java.lang.Long sourceRole)
    {
        this.sourceRole = sourceRole;
    }

    private java.lang.String sourceRoleLabel;

    public java.lang.String getSourceRoleLabel()
    {
        return this.sourceRoleLabel;
    }

    public void setSourceRoleLabel(java.lang.String sourceRoleLabel)
    {
        this.sourceRoleLabel = sourceRoleLabel;
    }

    
    private java.lang.Long targetRole;

    public java.lang.Long getTargetRole()
    {
        return this.targetRole;
    }

    public void setTargetRole(java.lang.Long targetRole)
    {
        this.targetRole = targetRole;
    }

    private java.lang.String targetRoleLabel;

    public java.lang.String getTargetRoleLabel()
    {
        return this.targetRoleLabel;
    }

    public void setTargetRoleLabel(java.lang.String targetRoleLabel)
    {
        this.targetRoleLabel = targetRoleLabel;
    }

    
    private java.lang.Long sourceUser;

    public java.lang.Long getSourceUser()
    {
        return this.sourceUser;
    }

    public void setSourceUser(java.lang.Long sourceUser)
    {
        this.sourceUser = sourceUser;
    }

    private java.lang.String sourceUserLabel;

    public java.lang.String getSourceUserLabel()
    {
        return this.sourceUserLabel;
    }

    public void setSourceUserLabel(java.lang.String sourceUserLabel)
    {
        this.sourceUserLabel = sourceUserLabel;
    }

    
    private java.lang.Long targetUser;

    public java.lang.Long getTargetUser()
    {
        return this.targetUser;
    }

    public void setTargetUser(java.lang.Long targetUser)
    {
        this.targetUser = targetUser;
    }

    private java.lang.String targetUserLabel;

    public java.lang.String getTargetUserLabel()
    {
        return this.targetUserLabel;
    }

    public void setTargetUserLabel(java.lang.String targetUserLabel)
    {
        this.targetUserLabel = targetUserLabel;
    }

    
    private java.lang.Long[] workflowTxnParams;

    public java.lang.Long[] getWorkflowTxnParams()
    {
        return this.workflowTxnParams;
    }

    public void setWorkflowTxnParams(java.lang.Long[] workflowTxnParams)
    {
        this.workflowTxnParams = workflowTxnParams;
    }

}