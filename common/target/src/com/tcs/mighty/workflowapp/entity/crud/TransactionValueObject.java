// license-header java merge-point
package com.tcs.mighty.workflowapp.entity.crud;

public class TransactionValueObject
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

    private java.util.Date startDate;

    public java.util.Date getStartDate()
    {
        return this.startDate;
    }

    public void setStartDate(java.util.Date startDate)
    {
        this.startDate = startDate;
    }

    private java.util.Date endDate;

    public java.util.Date getEndDate()
    {
        return this.endDate;
    }

    public void setEndDate(java.util.Date endDate)
    {
        this.endDate = endDate;
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

    private java.lang.Long[] routingDefinition;

    public java.lang.Long[] getRoutingDefinition()
    {
        return this.routingDefinition;
    }

    public void setRoutingDefinition(java.lang.Long[] routingDefinition)
    {
        this.routingDefinition = routingDefinition;
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

    private java.lang.Long role;

    public java.lang.Long getRole()
    {
        return this.role;
    }

    public void setRole(java.lang.Long role)
    {
        this.role = role;
    }

    private java.lang.String roleLabel;

    public java.lang.String getRoleLabel()
    {
        return this.roleLabel;
    }

    public void setRoleLabel(java.lang.String roleLabel)
    {
        this.roleLabel = roleLabel;
    }

    private java.lang.Long ownerRole;

    public java.lang.Long getOwnerRole()
    {
        return this.ownerRole;
    }

    public void setOwnerRole(java.lang.Long ownerRole)
    {
        this.ownerRole = ownerRole;
    }

    private java.lang.String ownerRoleLabel;

    public java.lang.String getOwnerRoleLabel()
    {
        return this.ownerRoleLabel;
    }

    public void setOwnerRoleLabel(java.lang.String ownerRoleLabel)
    {
        this.ownerRoleLabel = ownerRoleLabel;
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

    private java.lang.Long[] dashboards;

    public java.lang.Long[] getDashboards()
    {
        return this.dashboards;
    }

    public void setDashboards(java.lang.Long[] dashboards)
    {
        this.dashboards = dashboards;
    }

}