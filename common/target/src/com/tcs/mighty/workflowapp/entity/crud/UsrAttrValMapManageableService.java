// license-header java merge-point
package com.tcs.mighty.workflowapp.entity.crud;

public interface UsrAttrValMapManageableService
{
    public com.tcs.mighty.workflowapp.entity.crud.UsrAttrValMapValueObject create(java.lang.Long id, java.lang.Long attribute, java.lang.Long businessentity, java.lang.Long appuser, java.lang.Long[] usrattrvalue)
        throws Exception;

    public java.util.List read(java.lang.Long id, java.lang.Long attribute, java.lang.Long businessentity, java.lang.Long appuser, java.lang.Long[] usrattrvalue)
        throws Exception;

    public java.util.List readAll()
        throws Exception;

    public java.util.Map readBackingLists()
        throws Exception;

    public com.tcs.mighty.workflowapp.entity.crud.UsrAttrValMapValueObject update(java.lang.Long id, java.lang.Long attribute, java.lang.Long businessentity, java.lang.Long appuser, java.lang.Long[] usrattrvalue)
        throws Exception;

    public void delete(java.lang.Long[] ids)
        throws Exception;

}
