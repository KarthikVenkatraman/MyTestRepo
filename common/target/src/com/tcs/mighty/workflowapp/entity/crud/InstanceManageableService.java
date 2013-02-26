// license-header java merge-point
package com.tcs.mighty.workflowapp.entity.crud;

public interface InstanceManageableService
{
    public com.tcs.mighty.workflowapp.entity.crud.InstanceValueObject create(java.sql.Timestamp lastUpdatedOn, java.lang.Long id, java.lang.Long[] instanceAttributeMap, java.lang.Long businessEntity, java.lang.Long submittedUser)
        throws Exception;

    public java.util.List read(java.sql.Timestamp lastUpdatedOn, java.lang.Long id, java.lang.Long[] instanceAttributeMap, java.lang.Long businessEntity, java.lang.Long submittedUser)
        throws Exception;

    public java.util.List readAll()
        throws Exception;

    public java.util.Map readBackingLists()
        throws Exception;

    public com.tcs.mighty.workflowapp.entity.crud.InstanceValueObject update(java.sql.Timestamp lastUpdatedOn, java.lang.Long id, java.lang.Long[] instanceAttributeMap, java.lang.Long businessEntity, java.lang.Long submittedUser)
        throws Exception;

    public void delete(java.lang.Long[] ids)
        throws Exception;

}
