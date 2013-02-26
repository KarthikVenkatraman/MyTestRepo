// license-header java merge-point
package com.tcs.mighty.workflowapp.entity.crud;

public interface ProcessSequenceManageableService
{
    public com.tcs.mighty.workflowapp.entity.crud.ProcessSequenceValueObject create(java.lang.Long currentValue, java.lang.Long id, java.lang.Long transaction, java.lang.Long attribute)
        throws Exception;

    public java.util.List read(java.lang.Long currentValue, java.lang.Long id, java.lang.Long transaction, java.lang.Long attribute)
        throws Exception;

    public java.util.List readAll()
        throws Exception;

    public java.util.Map readBackingLists()
        throws Exception;

    public com.tcs.mighty.workflowapp.entity.crud.ProcessSequenceValueObject update(java.lang.Long currentValue, java.lang.Long id, java.lang.Long transaction, java.lang.Long attribute)
        throws Exception;

    public void delete(java.lang.Long[] ids)
        throws Exception;

}
