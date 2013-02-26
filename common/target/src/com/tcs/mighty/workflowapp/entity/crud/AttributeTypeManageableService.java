// license-header java merge-point
package com.tcs.mighty.workflowapp.entity.crud;

public interface AttributeTypeManageableService
{
    public com.tcs.mighty.workflowapp.entity.crud.AttributeTypeValueObject create(java.lang.String name, java.lang.String description, java.lang.Long id)
        throws Exception;

    public java.util.List read(java.lang.String name, java.lang.String description, java.lang.Long id)
        throws Exception;

    public java.util.List readAll()
        throws Exception;

    public com.tcs.mighty.workflowapp.entity.crud.AttributeTypeValueObject update(java.lang.String name, java.lang.String description, java.lang.Long id)
        throws Exception;

    public void delete(java.lang.Long[] ids)
        throws Exception;

}
