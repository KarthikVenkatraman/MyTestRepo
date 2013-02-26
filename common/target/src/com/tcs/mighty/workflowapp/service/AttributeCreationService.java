// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: SpringService.vsl in andromda-spring-cartridge.
//
package com.tcs.mighty.workflowapp.service;

/**
 * 
 */
public interface AttributeCreationService
{

    /**
     * 
     */
    public com.tcs.mighty.workflowapp.vo.BusinessEntityVO fetchSchemaTemplate(java.lang.Long businessEntityId);

    /**
     * 
     */
    public com.tcs.mighty.workflowapp.vo.StatusVO saveSchemaTemplate(java.util.Collection schemaTemplate);

    /**
     * 
     */
    public com.tcs.mighty.workflowapp.vo.StatusVO saveAttributeCategory(com.tcs.mighty.workflowapp.vo.AttributeCategoryVO categoryVO);

    /**
     * 
     */
    public com.tcs.mighty.workflowapp.vo.StatusVO saveAttribute(com.tcs.mighty.workflowapp.vo.AttributeVO attributeVO);

    /**
     * 
     */
    public com.tcs.mighty.workflowapp.vo.StatusVO saveAttributeValue(com.tcs.mighty.workflowapp.vo.AttributeValueVO attributeValueVO);

    /**
     * 
     */
    public com.tcs.mighty.workflowapp.vo.AttributeCategoryCreationDetailsVO populateAttributeCategoryCreationDetails(java.lang.Long businessEntityId);

    /**
     * 
     */
    public com.tcs.mighty.workflowapp.vo.AttributeValueCreationDetailsVO populateAttributeValueCreationDetails(java.lang.Long businessEntityId);

    /**
     * 
     */
    public com.tcs.mighty.workflowapp.vo.AttributeCreationDetailsVO populateAttributeCreationDetails(java.lang.String exclusionCSV, java.lang.Long businessEntityId);

    /**
     * 
     */
    public java.util.Collection fetchAllEntities(java.lang.Long clientId);

    /**
     * 
     */
    public java.lang.Boolean checkForAttributeInDecisionLogic(java.lang.String attributeId);

    /**
     * 
     */
    public java.lang.Boolean checkForAttributeCategoryInDecisionLogic(java.lang.String attributeCategoryId);

    /**
     * 
     */
    public java.lang.Boolean checkForAttributeValueInDecisionLogic(java.lang.String attributeValueId);

    /**
     * 
     */
    public java.util.Collection fetchAllTransactionsOfClientForInitiate(java.lang.String appUserRoles, java.lang.Long clientId);

    /**
     * 
     */
    public java.util.Collection fetchAllTransactionsOfClientForSearch(java.lang.Long clientId);

    /**
     * 
     */
    public boolean checkForAttributeValuesToBeUnique(java.lang.String attributeId, java.lang.String clientId);

    
    
    public java.util.Collection fetchQcDetails(java.lang.Long transactionId,java.lang.Long businessEntityId);
    
    
    public com.tcs.mighty.workflowapp.vo.StatusVO saveQcDetails(java.util.Collection qcRules);

    
    public com.tcs.mighty.workflowapp.vo.QcScoreVO getQcAttributesForStep(java.lang.String stepName);


    public java.util.Collection getQcSteps(String txnId);
    
    
    public boolean saveQcScores( com.tcs.mighty.workflowapp.vo.QcScoreVO qcScoreVO);
}
