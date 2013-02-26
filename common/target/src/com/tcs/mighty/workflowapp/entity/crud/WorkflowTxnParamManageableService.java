// license-header java merge-point
package com.tcs.mighty.workflowapp.entity.crud;

public interface WorkflowTxnParamManageableService
{
    public com.tcs.mighty.workflowapp.entity.crud.WorkflowTxnParamValueObject create(java.lang.String value, java.lang.String key, java.lang.Long id, java.lang.Long workflowTransaction)
        throws Exception;

    public java.util.List read(java.lang.String value, java.lang.String key, java.lang.Long id, java.lang.Long workflowTransaction)
        throws Exception;

    public java.util.List readAll()
        throws Exception;

    public java.util.Map readBackingLists()
        throws Exception;

    public com.tcs.mighty.workflowapp.entity.crud.WorkflowTxnParamValueObject update(java.lang.String value, java.lang.String key, java.lang.Long id, java.lang.Long workflowTransaction)
        throws Exception;

    public void delete(java.lang.Long[] ids)
        throws Exception;

}
