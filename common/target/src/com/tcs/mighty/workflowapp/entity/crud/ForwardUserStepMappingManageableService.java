// license-header java merge-point
package com.tcs.mighty.workflowapp.entity.crud;

public interface ForwardUserStepMappingManageableService
{
    public com.tcs.mighty.workflowapp.entity.crud.ForwardUserStepMappingValueObject create(java.lang.Long id, java.lang.Long routingdefinition, java.lang.Long pendingTxnStep, java.lang.Long userTxnStep)
        throws Exception;

    public java.util.List read(java.lang.Long id, java.lang.Long routingdefinition, java.lang.Long pendingTxnStep, java.lang.Long userTxnStep)
        throws Exception;

    public java.util.List readAll()
        throws Exception;

    public java.util.Map readBackingLists()
        throws Exception;

    public com.tcs.mighty.workflowapp.entity.crud.ForwardUserStepMappingValueObject update(java.lang.Long id, java.lang.Long routingdefinition, java.lang.Long pendingTxnStep, java.lang.Long userTxnStep)
        throws Exception;

    public void delete(java.lang.Long[] ids)
        throws Exception;

}
