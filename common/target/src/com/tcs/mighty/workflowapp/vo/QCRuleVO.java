package com.tcs.mighty.workflowapp.vo;

public class QCRuleVO implements java.io.Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	java.lang.String stepName;
	java.lang.Long stepId;
	java.lang.String attributeName;
	java.lang.Long attributeId;
	java.lang.String value;
	java.lang.Long attributeValueFk;
	java.lang.String ruleType;
	java.lang.String activeFlag;
	java.lang.Long count;
	java.lang.Long ruleId;
	
	public java.lang.Long getRuleId() {
		return ruleId;
	}
	public void setRuleId(java.lang.Long ruleId) {
		this.ruleId = ruleId;
	}
	public java.lang.String getStepName() {
		return stepName;
	}
	public void setStepName(java.lang.String stepName) {
		this.stepName = stepName;
	}
	public java.lang.Long getStepId() {
		return stepId;
	}
	public void setStepId(java.lang.Long stepId) {
		this.stepId = stepId;
	}
	public java.lang.String getAttributeName() {
		return attributeName;
	}
	public void setAttributeName(java.lang.String attributeName) {
		this.attributeName = attributeName;
	}
	public java.lang.Long getAttributeId() {
		return attributeId;
	}
	public void setAttributeId(java.lang.Long attributeId) {
		this.attributeId = attributeId;
	}
	public java.lang.String getValue() {
		return value;
	}
	public void setValue(java.lang.String value) {
		this.value = value;
	}
	public java.lang.Long getAttributeValueFk() {
		return attributeValueFk;
	}
	public void setAttributeValueFk(java.lang.Long attributeValueFk) {
		this.attributeValueFk = attributeValueFk;
	}
	public java.lang.String getRuleType() {
		return ruleType;
	}
	public void setRuleType(java.lang.String ruleType) {
		this.ruleType = ruleType;
	}
	public java.lang.String getActiveFlag() {
		return activeFlag;
	}
	public void setActiveFlag(java.lang.String activeFlag) {
		this.activeFlag = activeFlag;
	}
	public java.lang.Long getCount() {
		return count;
	}
	public void setCount(java.lang.Long count) {
		this.count = count;
	}
	
	
	
	
	

}
