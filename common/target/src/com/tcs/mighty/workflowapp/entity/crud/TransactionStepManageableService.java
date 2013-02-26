// license-header java merge-point
package com.tcs.mighty.workflowapp.entity.crud;

public interface TransactionStepManageableService
{
    public com.tcs.mighty.workflowapp.entity.crud.TransactionStepValueObject create(java.lang.Integer stepNumber, java.lang.String name, java.lang.String description, java.lang.Integer weightage, java.lang.String decisionLogic, java.lang.String isRoundRobin, java.lang.String isDelegatable, java.lang.String isToBu, java.lang.String toDoList, java.lang.String endPointReference, java.lang.Long id, java.lang.Long[] attributeCategory, java.lang.Long transaction, java.lang.Long[] completedStepRd, java.lang.Long[] role)
        throws Exception;

    public java.util.List read(java.lang.Integer stepNumber, java.lang.String name, java.lang.String description, java.lang.Integer weightage, java.lang.String decisionLogic, java.lang.String isRoundRobin, java.lang.String isDelegatable, java.lang.String isToBu, java.lang.String toDoList, java.lang.String endPointReference, java.lang.Long id, java.lang.Long[] attributeCategory, java.lang.Long transaction, java.lang.Long[] completedStepRd, java.lang.Long[] role)
        throws Exception;

    public java.util.List readAll()
        throws Exception;

    public java.util.Map readBackingLists()
        throws Exception;

    public com.tcs.mighty.workflowapp.entity.crud.TransactionStepValueObject update(java.lang.Integer stepNumber, java.lang.String name, java.lang.String description, java.lang.Integer weightage, java.lang.String decisionLogic, java.lang.String isRoundRobin, java.lang.String isDelegatable, java.lang.String isToBu, java.lang.String toDoList, java.lang.String endPointReference, java.lang.Long id, java.lang.Long[] attributeCategory, java.lang.Long transaction, java.lang.Long[] completedStepRd, java.lang.Long[] role)
        throws Exception;

    public void delete(java.lang.Long[] ids)
        throws Exception;

}
