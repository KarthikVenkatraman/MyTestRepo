// license-header java merge-point
package com.tcs.mighty.workflowapp.entity.crud;

public interface WorkflowTransactionManageableService
{
    public com.tcs.mighty.workflowapp.entity.crud.WorkflowTransactionValueObject create(java.sql.Timestamp entryTime, java.sql.Timestamp completionTime, java.lang.String comments, java.lang.String status, java.lang.String escalateFlag, java.lang.Integer escalateAfter, java.lang.Float weightage, java.lang.Long id, java.lang.Long[] claimableRoles, java.lang.Long businessKey, java.lang.Long transaction, java.lang.Long pendingTxnStep, java.lang.Long completedTxnStep, java.lang.Long sourceRole, java.lang.Long targetRole, java.lang.Long sourceUser, java.lang.Long targetUser, java.lang.Long[] workflowTxnParams)
        throws Exception;

    public java.util.List read(java.sql.Timestamp entryTime, java.sql.Timestamp completionTime, java.lang.String comments, java.lang.String status, java.lang.String escalateFlag, java.lang.Integer escalateAfter, java.lang.Float weightage, java.lang.Long id, java.lang.Long[] claimableRoles, java.lang.Long businessKey, java.lang.Long transaction, java.lang.Long pendingTxnStep, java.lang.Long completedTxnStep, java.lang.Long sourceRole, java.lang.Long targetRole, java.lang.Long sourceUser, java.lang.Long targetUser, java.lang.Long[] workflowTxnParams)
        throws Exception;

    public java.util.List readAll()
        throws Exception;

    public java.util.Map readBackingLists()
        throws Exception;

    public com.tcs.mighty.workflowapp.entity.crud.WorkflowTransactionValueObject update(java.sql.Timestamp entryTime, java.sql.Timestamp completionTime, java.lang.String comments, java.lang.String status, java.lang.String escalateFlag, java.lang.Integer escalateAfter, java.lang.Float weightage, java.lang.Long id, java.lang.Long[] claimableRoles, java.lang.Long businessKey, java.lang.Long transaction, java.lang.Long pendingTxnStep, java.lang.Long completedTxnStep, java.lang.Long sourceRole, java.lang.Long targetRole, java.lang.Long sourceUser, java.lang.Long targetUser, java.lang.Long[] workflowTxnParams)
        throws Exception;

    public void delete(java.lang.Long[] ids)
        throws Exception;

}
