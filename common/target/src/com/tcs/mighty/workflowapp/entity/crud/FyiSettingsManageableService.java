// license-header java merge-point
package com.tcs.mighty.workflowapp.entity.crud;

public interface FyiSettingsManageableService
{
    public com.tcs.mighty.workflowapp.entity.crud.FyiSettingsValueObject create(java.lang.String sendFYI, java.lang.String defaultRole, java.lang.String notifyUsersCSV, java.lang.String notifyRoles, java.lang.String notifyPreviousSteps, java.lang.String message, java.lang.Long id, java.lang.Long routingdefinition)
        throws Exception;

    public java.util.List read(java.lang.String sendFYI, java.lang.String defaultRole, java.lang.String notifyUsersCSV, java.lang.String notifyRoles, java.lang.String notifyPreviousSteps, java.lang.String message, java.lang.Long id, java.lang.Long routingdefinition)
        throws Exception;

    public java.util.List readAll()
        throws Exception;

    public java.util.Map readBackingLists()
        throws Exception;

    public com.tcs.mighty.workflowapp.entity.crud.FyiSettingsValueObject update(java.lang.String sendFYI, java.lang.String defaultRole, java.lang.String notifyUsersCSV, java.lang.String notifyRoles, java.lang.String notifyPreviousSteps, java.lang.String message, java.lang.Long id, java.lang.Long routingdefinition)
        throws Exception;

    public void delete(java.lang.Long[] ids)
        throws Exception;

}
