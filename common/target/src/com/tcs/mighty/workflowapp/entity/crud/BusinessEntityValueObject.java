// license-header java merge-point
package com.tcs.mighty.workflowapp.entity.crud;

public class BusinessEntityValueObject
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

    private java.lang.String displayName;

    public java.lang.String getDisplayName()
    {
        return this.displayName;
    }

    public void setDisplayName(java.lang.String displayName)
    {
        this.displayName = displayName;
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

    private java.lang.Long id;

    public java.lang.Long getId()
    {
        return this.id;
    }

    public void setId(java.lang.Long id)
    {
        this.id = id;
    }

    private java.lang.Long client;

    public java.lang.Long getClient()
    {
        return this.client;
    }

    public void setClient(java.lang.Long client)
    {
        this.client = client;
    }

    private java.lang.String clientLabel;

    public java.lang.String getClientLabel()
    {
        return this.clientLabel;
    }

    public void setClientLabel(java.lang.String clientLabel)
    {
        this.clientLabel = clientLabel;
    }

    
    private java.lang.Long[] attributeCategories;

    public java.lang.Long[] getAttributeCategories()
    {
        return this.attributeCategories;
    }

    public void setAttributeCategories(java.lang.Long[] attributeCategories)
    {
        this.attributeCategories = attributeCategories;
    }

    private java.lang.String[] attributeCategoriesLabels;

    public java.lang.String[] getAttributeCategoriesLabels()
    {
        return this.attributeCategoriesLabels;
    }

    public void setAttributeCategoriesLabels(java.lang.String[] attributeCategoriesLabels)
    {
        this.attributeCategoriesLabels = attributeCategoriesLabels;
    }

    
    private java.lang.String attributeCategoriesLabelsStrRep;

    public java.lang.String getAttributeCategoriesLabelsStrRep()
    {
        return this.attributeCategoriesLabelsStrRep;
    }

    public void setAttributeCategoriesLabelsStrRep(java.lang.String attributeCategoriesLabelsStrRep)
    {
        this.attributeCategoriesLabelsStrRep = attributeCategoriesLabelsStrRep;
    }

    private java.lang.String attributeCategoriesIdsStrRep;

    public java.lang.String getAttributeCategoriesIdsStrRep()
    {
        return this.attributeCategoriesIdsStrRep;
    }

    public void setAttributeCategoriesIdsStrRep(java.lang.String attributeCategoriesIdsStrRep)
    {
        this.attributeCategoriesIdsStrRep = attributeCategoriesIdsStrRep;
    }

    private java.lang.Long[] entityInstance;

    public java.lang.Long[] getEntityInstance()
    {
        return this.entityInstance;
    }

    public void setEntityInstance(java.lang.Long[] entityInstance)
    {
        this.entityInstance = entityInstance;
    }

    private java.lang.Long[] transaction;

    public java.lang.Long[] getTransaction()
    {
        return this.transaction;
    }

    public void setTransaction(java.lang.Long[] transaction)
    {
        this.transaction = transaction;
    }

    private java.lang.String[] transactionLabels;

    public java.lang.String[] getTransactionLabels()
    {
        return this.transactionLabels;
    }

    public void setTransactionLabels(java.lang.String[] transactionLabels)
    {
        this.transactionLabels = transactionLabels;
    }

    
    private java.lang.String transactionLabelsStrRep;

    public java.lang.String getTransactionLabelsStrRep()
    {
        return this.transactionLabelsStrRep;
    }

    public void setTransactionLabelsStrRep(java.lang.String transactionLabelsStrRep)
    {
        this.transactionLabelsStrRep = transactionLabelsStrRep;
    }

    private java.lang.String transactionIdsStrRep;

    public java.lang.String getTransactionIdsStrRep()
    {
        return this.transactionIdsStrRep;
    }

    public void setTransactionIdsStrRep(java.lang.String transactionIdsStrRep)
    {
        this.transactionIdsStrRep = transactionIdsStrRep;
    }

}