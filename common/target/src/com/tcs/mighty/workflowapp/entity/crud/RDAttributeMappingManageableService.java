// license-header java merge-point
package com.tcs.mighty.workflowapp.entity.crud;

public interface RDAttributeMappingManageableService
{
    public com.tcs.mighty.workflowapp.entity.crud.RDAttributeMappingValueObject create(java.lang.String freeText, java.lang.Long id, java.lang.Long attribute, java.lang.Long[] attributevalue, java.lang.Long routingdefinition)
        throws Exception;

    public java.util.List read(java.lang.String freeText, java.lang.Long id, java.lang.Long attribute, java.lang.Long[] attributevalue, java.lang.Long routingdefinition)
        throws Exception;

    public java.util.List readAll()
        throws Exception;

    public java.util.Map readBackingLists()
        throws Exception;

    public com.tcs.mighty.workflowapp.entity.crud.RDAttributeMappingValueObject update(java.lang.String freeText, java.lang.Long id, java.lang.Long attribute, java.lang.Long[] attributevalue, java.lang.Long routingdefinition)
        throws Exception;

    public void delete(java.lang.Long[] ids)
        throws Exception;

}
