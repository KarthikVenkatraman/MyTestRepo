// license-header java merge-point
package com.tcs.mighty.workflowapp.entity.crud;

public interface RoleManageableService
{
    public com.tcs.mighty.workflowapp.entity.crud.RoleValueObject create(java.lang.String name, java.lang.String description, java.lang.String isAdmin, java.lang.String canViewReports, java.lang.Long id, java.lang.Long client, java.lang.Long[] transaction, java.lang.Long[] transactionSteps, java.lang.Long[] appuser, java.lang.Long[] workflowTransactions)
        throws Exception;

    public java.util.List read(java.lang.String name, java.lang.String description, java.lang.String isAdmin, java.lang.String canViewReports, java.lang.Long id, java.lang.Long client, java.lang.Long[] transaction, java.lang.Long[] transactionSteps, java.lang.Long[] appuser, java.lang.Long[] workflowTransactions)
        throws Exception;

    public java.util.List readAll()
        throws Exception;

    public java.util.Map readBackingLists()
        throws Exception;

    public com.tcs.mighty.workflowapp.entity.crud.RoleValueObject update(java.lang.String name, java.lang.String description, java.lang.String isAdmin, java.lang.String canViewReports, java.lang.Long id, java.lang.Long client, java.lang.Long[] transaction, java.lang.Long[] transactionSteps, java.lang.Long[] appuser, java.lang.Long[] workflowTransactions)
        throws Exception;

    public void delete(java.lang.Long[] ids)
        throws Exception;

}
