// license-header java merge-point
package com.tcs.mighty.workflowapp.entity.crud;

public interface BusinessUnitCategoryManageableService
{
    public com.tcs.mighty.workflowapp.entity.crud.BusinessUnitCategoryValueObject create(java.lang.String name, java.lang.String description, java.lang.Long id, java.lang.Long client, java.lang.Long[] businessUnit, java.lang.Long parentBusinessUnitCategory, java.lang.Long[] subBusinessUnitCategory)
        throws Exception;

    public java.util.List read(java.lang.String name, java.lang.String description, java.lang.Long id, java.lang.Long client, java.lang.Long[] businessUnit, java.lang.Long parentBusinessUnitCategory, java.lang.Long[] subBusinessUnitCategory)
        throws Exception;

    public java.util.List readAll()
        throws Exception;

    public java.util.Map readBackingLists(java.lang.Long clientId)
        throws Exception;

    public com.tcs.mighty.workflowapp.entity.crud.BusinessUnitCategoryValueObject update(java.lang.String name, java.lang.String description, java.lang.Long id, java.lang.Long client, java.lang.Long[] businessUnit, java.lang.Long parentBusinessUnitCategory, java.lang.Long[] subBusinessUnitCategory)
        throws Exception;

    public void delete(java.lang.Long[] ids)
        throws Exception;

}
