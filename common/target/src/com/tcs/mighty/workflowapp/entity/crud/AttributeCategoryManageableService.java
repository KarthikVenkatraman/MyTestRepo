// license-header java merge-point
package com.tcs.mighty.workflowapp.entity.crud;

public interface AttributeCategoryManageableService
{
    public com.tcs.mighty.workflowapp.entity.crud.AttributeCategoryValueObject create(java.lang.String name, java.lang.String description, java.lang.Integer displayOrder, java.lang.String keyCategoryFlag, java.lang.Long id, java.lang.Long[] attributes, java.lang.Long[] transactionStep, java.lang.Long businessEntity)
        throws Exception;

    public java.util.List read(java.lang.String name, java.lang.String description, java.lang.Integer displayOrder, java.lang.String keyCategoryFlag, java.lang.Long id, java.lang.Long[] attributes, java.lang.Long[] transactionStep, java.lang.Long businessEntity)
        throws Exception;

    public java.util.List readAll()
        throws Exception;

    public java.util.Map readBackingLists()
        throws Exception;

    public com.tcs.mighty.workflowapp.entity.crud.AttributeCategoryValueObject update(java.lang.String name, java.lang.String description, java.lang.Integer displayOrder, java.lang.String keyCategoryFlag, java.lang.Long id, java.lang.Long[] attributes, java.lang.Long[] transactionStep, java.lang.Long businessEntity)
        throws Exception;

    public void delete(java.lang.Long[] ids)
        throws Exception;

}
