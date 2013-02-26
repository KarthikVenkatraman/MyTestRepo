// license-header java merge-point
package com.tcs.mighty.workflowapp.entity.crud;

public interface StepAttributeMapManageableService
{
    public com.tcs.mighty.workflowapp.entity.crud.StepAttributeMapValueObject create(java.lang.Long id, java.lang.Long attribute, java.lang.Long[] attributeValue, java.lang.Long transactionStep)
        throws Exception;

    public java.util.List read(java.lang.Long id, java.lang.Long attribute, java.lang.Long[] attributeValue, java.lang.Long transactionStep)
        throws Exception;

    public java.util.List readAll()
        throws Exception;

    public java.util.Map readBackingLists()
        throws Exception;

    public com.tcs.mighty.workflowapp.entity.crud.StepAttributeMapValueObject update(java.lang.Long id, java.lang.Long attribute, java.lang.Long[] attributeValue, java.lang.Long transactionStep)
        throws Exception;

    public void delete(java.lang.Long[] ids)
        throws Exception;

}
