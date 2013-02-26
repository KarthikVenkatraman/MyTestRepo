// license-header java merge-point
package com.tcs.mighty.workflowapp.entity.crud;

public interface BusinessEntityManageableService
{
    public com.tcs.mighty.workflowapp.entity.crud.BusinessEntityValueObject create(java.lang.String name, java.lang.String displayName, java.lang.String description, java.lang.Long id, java.lang.Long client, java.lang.Long[] attributeCategories, java.lang.Long[] entityInstance, java.lang.Long[] transaction)
        throws Exception;

    public java.util.List read(java.lang.String name, java.lang.String displayName, java.lang.String description, java.lang.Long id, java.lang.Long client, java.lang.Long[] attributeCategories, java.lang.Long[] entityInstance, java.lang.Long[] transaction)
        throws Exception;

    public java.util.List readAll()
        throws Exception;

    public java.util.Map readBackingLists()
        throws Exception;

    public com.tcs.mighty.workflowapp.entity.crud.BusinessEntityValueObject update(java.lang.String name, java.lang.String displayName, java.lang.String description, java.lang.Long id, java.lang.Long client, java.lang.Long[] attributeCategories, java.lang.Long[] entityInstance, java.lang.Long[] transaction)
        throws Exception;

    public void delete(java.lang.Long[] ids)
        throws Exception;

}
