// license-header java merge-point
package com.tcs.mighty.workflowapp.entity.crud;

public class TransactionStepValueObject
    implements java.io.Serializable
{
    private java.lang.Integer stepNumber;

    public java.lang.Integer getStepNumber()
    {
        return this.stepNumber;
    }

    public void setStepNumber(java.lang.Integer stepNumber)
    {
        this.stepNumber = stepNumber;
    }

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

    private java.lang.Integer weightage;

    public java.lang.Integer getWeightage()
    {
        return this.weightage;
    }

    public void setWeightage(java.lang.Integer weightage)
    {
        this.weightage = weightage;
    }

    private java.lang.String decisionLogic;

    public java.lang.String getDecisionLogic()
    {
        return this.decisionLogic;
    }

    public void setDecisionLogic(java.lang.String decisionLogic)
    {
        this.decisionLogic = decisionLogic;
    }

    private java.lang.String isRoundRobin;

    public java.lang.String getIsRoundRobin()
    {
        return this.isRoundRobin;
    }

    public void setIsRoundRobin(java.lang.String isRoundRobin)
    {
        this.isRoundRobin = isRoundRobin;
    }

    private java.lang.String isDelegatable;

    public java.lang.String getIsDelegatable()
    {
        return this.isDelegatable;
    }

    public void setIsDelegatable(java.lang.String isDelegatable)
    {
        this.isDelegatable = isDelegatable;
    }

    private java.lang.String isToBu;

    public java.lang.String getIsToBu()
    {
        return this.isToBu;
    }

    public void setIsToBu(java.lang.String isToBu)
    {
        this.isToBu = isToBu;
    }

    private java.lang.String toDoList;

    public java.lang.String getToDoList()
    {
        return this.toDoList;
    }

    public void setToDoList(java.lang.String toDoList)
    {
        this.toDoList = toDoList;
    }

    private java.lang.String endPointReference;

    public java.lang.String getEndPointReference()
    {
        return this.endPointReference;
    }

    public void setEndPointReference(java.lang.String endPointReference)
    {
        this.endPointReference = endPointReference;
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

    private java.lang.Long[] attributeCategory;

    public java.lang.Long[] getAttributeCategory()
    {
        return this.attributeCategory;
    }

    public void setAttributeCategory(java.lang.Long[] attributeCategory)
    {
        this.attributeCategory = attributeCategory;
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

    
    private java.lang.Long[] completedStepRd;

    public java.lang.Long[] getCompletedStepRd()
    {
        return this.completedStepRd;
    }

    public void setCompletedStepRd(java.lang.Long[] completedStepRd)
    {
        this.completedStepRd = completedStepRd;
    }

    private java.lang.Long[] role;

    public java.lang.Long[] getRole()
    {
        return this.role;
    }

    public void setRole(java.lang.Long[] role)
    {
        this.role = role;
    }

    private java.lang.String[] roleLabels;

    public java.lang.String[] getRoleLabels()
    {
        return this.roleLabels;
    }

    public void setRoleLabels(java.lang.String[] roleLabels)
    {
        this.roleLabels = roleLabels;
    }

    
    private java.lang.String roleLabelsStrRep;

    public java.lang.String getRoleLabelsStrRep()
    {
        return this.roleLabelsStrRep;
    }

    public void setRoleLabelsStrRep(java.lang.String roleLabelsStrRep)
    {
        this.roleLabelsStrRep = roleLabelsStrRep;
    }

    private java.lang.String roleIdsStrRep;

    public java.lang.String getRoleIdsStrRep()
    {
        return this.roleIdsStrRep;
    }

    public void setRoleIdsStrRep(java.lang.String roleIdsStrRep)
    {
        this.roleIdsStrRep = roleIdsStrRep;
    }

}