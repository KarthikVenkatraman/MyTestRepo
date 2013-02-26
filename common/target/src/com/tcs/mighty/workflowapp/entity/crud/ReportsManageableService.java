// license-header java merge-point
package com.tcs.mighty.workflowapp.entity.crud;

public interface ReportsManageableService
{
    public com.tcs.mighty.workflowapp.entity.crud.ReportsValueObject create(java.lang.String name, java.lang.String displayName, java.lang.Long displayOrder, java.lang.Long id, java.lang.Long[] reportsParam, java.lang.Long reportType)
        throws Exception;

    public java.util.List read(java.lang.String name, java.lang.String displayName, java.lang.Long displayOrder, java.lang.Long id, java.lang.Long[] reportsParam, java.lang.Long reportType)
        throws Exception;

    public java.util.List readAll()
        throws Exception;

    public java.util.Map readBackingLists()
        throws Exception;

    public com.tcs.mighty.workflowapp.entity.crud.ReportsValueObject update(java.lang.String name, java.lang.String displayName, java.lang.Long displayOrder, java.lang.Long id, java.lang.Long[] reportsParam, java.lang.Long reportType)
        throws Exception;

    public void delete(java.lang.Long[] ids)
        throws Exception;

}
