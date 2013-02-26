// license-header java merge-point
package com.tcs.mighty.workflowapp.entity.crud;

public interface InstanceAttributeValueManageableService
{
    public com.tcs.mighty.workflowapp.entity.crud.InstanceAttributeValueValueObject create(java.lang.String freeText, java.lang.Long id, java.lang.Long instanceAttributeMap, java.lang.Long attributeValue)
        throws Exception;

    public java.util.List read(java.lang.String freeText, java.lang.Long id, java.lang.Long instanceAttributeMap, java.lang.Long attributeValue)
        throws Exception;

    public java.util.List readAll()
        throws Exception;

    public java.util.Map readBackingLists()
        throws Exception;

    public com.tcs.mighty.workflowapp.entity.crud.InstanceAttributeValueValueObject update(java.lang.String freeText, java.lang.Long id, java.lang.Long instanceAttributeMap, java.lang.Long attributeValue)
        throws Exception;

    public void delete(java.lang.Long[] ids)
        throws Exception;

}
