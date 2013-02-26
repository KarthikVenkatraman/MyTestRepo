// license-header java merge-point
package com.tcs.mighty.workflowapp.entity.crud;

public interface BusinessUnitManageableService
{
    public com.tcs.mighty.workflowapp.entity.crud.BusinessUnitValueObject create(java.lang.String name, java.lang.String description, java.lang.String addressLine1, java.lang.String addressLine2, java.lang.String addressLine3, java.lang.String pinCode, java.lang.String emailId, java.lang.String telephoneNo, java.lang.String voipPhoneNo, java.lang.String businessUnitId, java.lang.Long id, java.lang.Long client, java.lang.Long[] appuser, java.lang.Long parentBusinessUnit, java.lang.Long[] subBusinessUnit, java.lang.Long businessUnitCategory)
        throws Exception;

    public java.util.List read(java.lang.String name, java.lang.String description, java.lang.String addressLine1, java.lang.String addressLine2, java.lang.String addressLine3, java.lang.String pinCode, java.lang.String emailId, java.lang.String telephoneNo, java.lang.String voipPhoneNo, java.lang.String businessUnitId, java.lang.Long id, java.lang.Long client, java.lang.Long[] appuser, java.lang.Long parentBusinessUnit, java.lang.Long[] subBusinessUnit, java.lang.Long businessUnitCategory)
        throws Exception;

    public java.util.List readAll()
        throws Exception;

    public java.util.Map readBackingLists(java.lang.Long clientId)
        throws Exception;

    public com.tcs.mighty.workflowapp.entity.crud.BusinessUnitValueObject update(java.lang.String name, java.lang.String description, java.lang.String addressLine1, java.lang.String addressLine2, java.lang.String addressLine3, java.lang.String pinCode, java.lang.String emailId, java.lang.String telephoneNo, java.lang.String voipPhoneNo, java.lang.String businessUnitId, java.lang.Long id, java.lang.Long client, java.lang.Long[] appuser, java.lang.Long parentBusinessUnit, java.lang.Long[] subBusinessUnit, java.lang.Long businessUnitCategory)
        throws Exception;

    public void delete(java.lang.Long[] ids)
        throws Exception;

}
