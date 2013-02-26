// license-header java merge-point
package com.tcs.mighty.workflowapp.entity.crud;

public interface InstanceAttributeMapManageableService
{
    public com.tcs.mighty.workflowapp.entity.crud.InstanceAttributeMapValueObject create(java.lang.Long id, java.lang.Long instance, java.lang.Long[] entityInstanceValues, java.lang.Long attribute)
        throws Exception;

    public java.util.List read(java.lang.Long id, java.lang.Long instance, java.lang.Long[] entityInstanceValues, java.lang.Long attribute)
        throws Exception;

    public java.util.List readAll()
        throws Exception;

    public java.util.Map readBackingLists()
        throws Exception;

    public com.tcs.mighty.workflowapp.entity.crud.InstanceAttributeMapValueObject update(java.lang.Long id, java.lang.Long instance, java.lang.Long[] entityInstanceValues, java.lang.Long attribute)
        throws Exception;

    public void delete(java.lang.Long[] ids)
        throws Exception;

}
