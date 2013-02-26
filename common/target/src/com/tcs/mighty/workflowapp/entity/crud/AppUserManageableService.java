// license-header java merge-point
package com.tcs.mighty.workflowapp.entity.crud;

public interface AppUserManageableService
{
    public com.tcs.mighty.workflowapp.entity.crud.AppUserValueObject create(java.lang.String userId, java.lang.String name, java.lang.String emailId, java.lang.String password, java.lang.String deleteFlag, java.lang.String adminFlag, java.lang.Long id, java.lang.Long[] instances, java.lang.Long[] role, java.lang.Long businessUnit)
        throws Exception;

    public java.util.List read(java.lang.String userId, java.lang.String name, java.lang.String emailId, java.lang.String password, java.lang.String deleteFlag, java.lang.String adminFlag, java.lang.Long id, java.lang.Long[] instances, java.lang.Long[] role, java.lang.Long businessUnit,java.lang.Long clientId)
        throws Exception;

    public java.util.List readAll()
        throws Exception;

    public java.util.Map readBackingLists(java.lang.Long clientId)
        throws Exception;

    public com.tcs.mighty.workflowapp.entity.crud.AppUserValueObject update(java.lang.String userId, java.lang.String name, java.lang.String emailId, java.lang.String password, java.lang.String deleteFlag, java.lang.String adminFlag, java.lang.Long id, java.lang.Long[] instances, java.lang.Long[] role, java.lang.Long businessUnit)
        throws Exception;

    public void delete(java.lang.Long[] ids)
        throws Exception;

}
