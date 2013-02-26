// license-header java merge-point
package com.tcs.mighty.workflowapp.entity.crud;

public interface DashboardFilterManageableService
{
    public com.tcs.mighty.workflowapp.entity.crud.DashboardFilterValueObject create(java.lang.String transactionStepFlag, java.lang.Long id, java.lang.Long attribute)
        throws Exception;

    public java.util.List read(java.lang.String transactionStepFlag, java.lang.Long id, java.lang.Long attribute)
        throws Exception;

    public java.util.List readAll()
        throws Exception;

    public java.util.Map readBackingLists()
        throws Exception;

    public com.tcs.mighty.workflowapp.entity.crud.DashboardFilterValueObject update(java.lang.String transactionStepFlag, java.lang.Long id, java.lang.Long attribute)
        throws Exception;

    public void delete(java.lang.Long[] ids)
        throws Exception;

}
