// license-header java merge-point
package com.tcs.mighty.workflowapp.entity.crud;

public interface UsrAttrValueManageableService
{
    public com.tcs.mighty.workflowapp.entity.crud.UsrAttrValueValueObject create(java.lang.String freeText, java.lang.Long id, java.lang.Long attributevalue)
        throws Exception;

    public java.util.List read(java.lang.String freeText, java.lang.Long id, java.lang.Long attributevalue)
        throws Exception;

    public java.util.List readAll()
        throws Exception;

    public java.util.Map readBackingLists()
        throws Exception;

    public com.tcs.mighty.workflowapp.entity.crud.UsrAttrValueValueObject update(java.lang.String freeText, java.lang.Long id, java.lang.Long attributevalue)
        throws Exception;

    public void delete(java.lang.Long[] ids)
        throws Exception;

}
