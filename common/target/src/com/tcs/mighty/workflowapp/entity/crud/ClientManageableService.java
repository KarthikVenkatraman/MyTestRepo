// license-header java merge-point
package com.tcs.mighty.workflowapp.entity.crud;

public interface ClientManageableService
{
    public com.tcs.mighty.workflowapp.entity.crud.ClientValueObject create(java.lang.String name, java.lang.String description, java.lang.Long id, java.lang.Long[] businessEntity, java.lang.Long[] role, java.lang.Long[] businessUnit, java.lang.Long[] businessunitcategory)
        throws Exception;

    public java.util.List read(java.lang.String name, java.lang.String description, java.lang.Long id, java.lang.Long[] businessEntity, java.lang.Long[] role, java.lang.Long[] businessUnit, java.lang.Long[] businessunitcategory)
        throws Exception;

    public java.util.List readAll()
        throws Exception;

    public java.util.Map readBackingLists()
        throws Exception;

    public com.tcs.mighty.workflowapp.entity.crud.ClientValueObject update(java.lang.String name, java.lang.String description, java.lang.Long id, java.lang.Long[] businessEntity, java.lang.Long[] role, java.lang.Long[] businessUnit, java.lang.Long[] businessunitcategory)
        throws Exception;

    public void delete(java.lang.Long[] ids)
        throws Exception;

}
