// license-header java merge-point
package com.tcs.mighty.workflowapp.entity.crud;

public interface MailingOptionsManageableService
{
    public com.tcs.mighty.workflowapp.entity.crud.MailingOptionsValueObject create(java.lang.String sendMails, java.lang.String sendToDefaultUser, java.lang.String sendToDefaultRoles, java.lang.String toUsersCSV, java.lang.String toRolesCSV, java.lang.String toPrevStepsCSV, java.lang.String ccUsersCSV, java.lang.String ccRolesCSV, java.lang.String ccPrevStepsCSV, java.lang.String subject, java.lang.String salutation, java.lang.String msgBody, java.lang.String signature, java.lang.Long id, java.lang.Long routingdefinition)
        throws Exception;

    public java.util.List read(java.lang.String sendMails, java.lang.String sendToDefaultUser, java.lang.String sendToDefaultRoles, java.lang.String toUsersCSV, java.lang.String toRolesCSV, java.lang.String toPrevStepsCSV, java.lang.String ccUsersCSV, java.lang.String ccRolesCSV, java.lang.String ccPrevStepsCSV, java.lang.String subject, java.lang.String salutation, java.lang.String msgBody, java.lang.String signature, java.lang.Long id, java.lang.Long routingdefinition)
        throws Exception;

    public java.util.List readAll()
        throws Exception;

    public java.util.Map readBackingLists()
        throws Exception;

    public com.tcs.mighty.workflowapp.entity.crud.MailingOptionsValueObject update(java.lang.String sendMails, java.lang.String sendToDefaultUser, java.lang.String sendToDefaultRoles, java.lang.String toUsersCSV, java.lang.String toRolesCSV, java.lang.String toPrevStepsCSV, java.lang.String ccUsersCSV, java.lang.String ccRolesCSV, java.lang.String ccPrevStepsCSV, java.lang.String subject, java.lang.String salutation, java.lang.String msgBody, java.lang.String signature, java.lang.Long id, java.lang.Long routingdefinition)
        throws Exception;

    public void delete(java.lang.Long[] ids)
        throws Exception;

}
