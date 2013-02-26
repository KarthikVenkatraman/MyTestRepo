// license-header java merge-point
package com.tcs.mighty.workflowapp.entity.crud;

public interface ReportsParamManageableService
{
    public com.tcs.mighty.workflowapp.entity.crud.ReportsParamValueObject create(java.lang.String value, java.lang.Long id, java.lang.Long reports, java.lang.Long key)
        throws Exception;

    public java.util.List read(java.lang.String value, java.lang.Long id, java.lang.Long reports, java.lang.Long key)
        throws Exception;

    public java.util.List readAll()
        throws Exception;

    public java.util.Map readBackingLists()
        throws Exception;

    public com.tcs.mighty.workflowapp.entity.crud.ReportsParamValueObject update(java.lang.String value, java.lang.Long id, java.lang.Long reports, java.lang.Long key)
        throws Exception;

    public void delete(java.lang.Long[] ids)
        throws Exception;

}
