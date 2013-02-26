// license-header java merge-point
package com.tcs.mighty.workflowapp.entity.crud;

public interface ReportSchemaAuditManageableService
{
    public com.tcs.mighty.workflowapp.entity.crud.ReportSchemaAuditValueObject create(java.lang.String attributeName, java.lang.String parentAttributeName, java.lang.String attributeType, java.lang.String isTypeChanged, java.lang.String isNameChanged, java.lang.String isInSync, java.lang.String isDeleted, java.lang.Long id, java.lang.Long businessEntity)
        throws Exception;

    public java.util.List read(java.lang.String attributeName, java.lang.String parentAttributeName, java.lang.String attributeType, java.lang.String isTypeChanged, java.lang.String isNameChanged, java.lang.String isInSync, java.lang.String isDeleted, java.lang.Long id, java.lang.Long businessEntity)
        throws Exception;

    public java.util.List readAll()
        throws Exception;

    public java.util.Map readBackingLists()
        throws Exception;

    public com.tcs.mighty.workflowapp.entity.crud.ReportSchemaAuditValueObject update(java.lang.String attributeName, java.lang.String parentAttributeName, java.lang.String attributeType, java.lang.String isTypeChanged, java.lang.String isNameChanged, java.lang.String isInSync, java.lang.String isDeleted, java.lang.Long id, java.lang.Long businessEntity)
        throws Exception;

    public void delete(java.lang.Long[] ids)
        throws Exception;

}
