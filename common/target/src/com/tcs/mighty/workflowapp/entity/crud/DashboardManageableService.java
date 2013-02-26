// license-header java merge-point
package com.tcs.mighty.workflowapp.entity.crud;

public interface DashboardManageableService
{
    public com.tcs.mighty.workflowapp.entity.crud.DashboardValueObject create(java.lang.String viewFlag, java.lang.String name, java.lang.Long id, java.lang.Long transaction, java.lang.Long[] baseFilter, java.lang.Long row, java.lang.Long column, java.lang.Long[] roles)
        throws Exception;

    public java.util.List read(java.lang.String viewFlag, java.lang.String name, java.lang.Long id, java.lang.Long transaction, java.lang.Long[] baseFilter, java.lang.Long row, java.lang.Long column, java.lang.Long[] roles)
        throws Exception;

    public java.util.List readAll()
        throws Exception;

    public java.util.Map readBackingLists()
        throws Exception;

    public com.tcs.mighty.workflowapp.entity.crud.DashboardValueObject update(java.lang.String viewFlag, java.lang.String name, java.lang.Long id, java.lang.Long transaction, java.lang.Long[] baseFilter, java.lang.Long row, java.lang.Long column, java.lang.Long[] roles)
        throws Exception;

    public void delete(java.lang.Long[] ids)
        throws Exception;

}
