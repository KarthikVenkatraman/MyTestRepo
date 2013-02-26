// license-header java merge-point
package com.tcs.mighty.workflowapp.entity.crud;

public interface RoutingDefinitionManageableService
{
    public com.tcs.mighty.workflowapp.entity.crud.RoutingDefinitionValueObject create(java.lang.String routingCriterion, java.lang.Long previousStepsRequired, java.lang.String transitionDirection, java.lang.String deleteParallelFlow, java.lang.Integer escalateAfter, java.lang.String pendingStepsOverride, java.lang.String buttonName, java.lang.Long id, java.lang.Long[] pendingTxnStep, java.lang.Long transaction, java.lang.Long completedTxnStep)
        throws Exception;

    public java.util.List read(java.lang.String routingCriterion, java.lang.Long previousStepsRequired, java.lang.String transitionDirection, java.lang.String deleteParallelFlow, java.lang.Integer escalateAfter, java.lang.String pendingStepsOverride, java.lang.String buttonName, java.lang.Long id, java.lang.Long[] pendingTxnStep, java.lang.Long transaction, java.lang.Long completedTxnStep)
        throws Exception;

    public java.util.List readAll()
        throws Exception;

    public java.util.Map readBackingLists()
        throws Exception;

    public com.tcs.mighty.workflowapp.entity.crud.RoutingDefinitionValueObject update(java.lang.String routingCriterion, java.lang.Long previousStepsRequired, java.lang.String transitionDirection, java.lang.String deleteParallelFlow, java.lang.Integer escalateAfter, java.lang.String pendingStepsOverride, java.lang.String buttonName, java.lang.Long id, java.lang.Long[] pendingTxnStep, java.lang.Long transaction, java.lang.Long completedTxnStep)
        throws Exception;

    public void delete(java.lang.Long[] ids)
        throws Exception;

}
