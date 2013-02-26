// license-header java merge-point
package com.tcs.mighty.workflowapp.entity.crud;

public interface TransactionManageableService
{
    public com.tcs.mighty.workflowapp.entity.crud.TransactionValueObject create(java.lang.String name, java.lang.String description, java.util.Date startDate, java.util.Date endDate, java.lang.Long id, java.lang.Long[] routingDefinition, java.lang.Long[] transactionStep, java.lang.Long role, java.lang.Long ownerRole, java.lang.Long businessEntity, java.lang.Long[] dashboards)
        throws Exception;

    public java.util.List read(java.lang.String name, java.lang.String description, java.util.Date startDate, java.util.Date endDate, java.lang.Long id, java.lang.Long[] routingDefinition, java.lang.Long[] transactionStep, java.lang.Long role, java.lang.Long ownerRole, java.lang.Long businessEntity, java.lang.Long[] dashboards)
        throws Exception;

    public java.util.List readAll()
        throws Exception;

    public java.util.Map readBackingLists()
        throws Exception;

    public com.tcs.mighty.workflowapp.entity.crud.TransactionValueObject update(java.lang.String name, java.lang.String description, java.util.Date startDate, java.util.Date endDate, java.lang.Long id, java.lang.Long[] routingDefinition, java.lang.Long[] transactionStep, java.lang.Long role, java.lang.Long ownerRole, java.lang.Long businessEntity, java.lang.Long[] dashboards)
        throws Exception;

    public void delete(java.lang.Long[] ids)
        throws Exception;

}
