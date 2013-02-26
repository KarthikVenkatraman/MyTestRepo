// license-header java merge-point
package com.tcs.mighty.workflowapp.entity.crud;

public interface AttributeValueManageableService
{
    public com.tcs.mighty.workflowapp.entity.crud.AttributeValueValueObject create(java.lang.String value, java.lang.Integer displayOrder, java.lang.Long id, java.lang.Long attribute, java.lang.Long[] followUpAttributes, java.lang.Long[] parentAttributeValues, java.lang.Long[] childAttributeValues)
        throws Exception;

    public java.util.List read(java.lang.String value, java.lang.Integer displayOrder, java.lang.Long id, java.lang.Long attribute, java.lang.Long[] followUpAttributes, java.lang.Long[] parentAttributeValues, java.lang.Long[] childAttributeValues)
        throws Exception;

    public java.util.List readAll()
        throws Exception;

    public java.util.Map readBackingLists()
        throws Exception;

    public com.tcs.mighty.workflowapp.entity.crud.AttributeValueValueObject update(java.lang.String value, java.lang.Integer displayOrder, java.lang.Long id, java.lang.Long attribute, java.lang.Long[] followUpAttributes, java.lang.Long[] parentAttributeValues, java.lang.Long[] childAttributeValues)
        throws Exception;

    public void delete(java.lang.Long[] ids)
        throws Exception;

}
