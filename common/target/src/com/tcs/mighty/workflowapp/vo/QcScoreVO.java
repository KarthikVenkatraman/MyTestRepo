package com.tcs.mighty.workflowapp.vo;

public class QcScoreVO implements java.io.Serializable
{
    /**
     * The serial version UID of this class. Needed for serialization.
     */
	
    private static final long serialVersionUID = 7185824691686279704L;
    
    private java.util.Collection attributeList;
    private java.util.Collection attributeValueList;
	private java.util.Collection totalScoreAttributes;
	private Long selectedTotalScoreAttribute;
	private String stepName;
	private String stepId;
	private String qcStepFlag;

	public java.util.Collection getAttributeList() {
		return attributeList;
	}
	public void setAttributeList(java.util.Collection attributeList) {
		this.attributeList = attributeList;
	}
	public java.util.Collection getAttributeValueList() {
		return attributeValueList;
	}
	public void setAttributeValueList(java.util.Collection attributeValueList) {
		this.attributeValueList = attributeValueList;
	}
	public java.util.Collection getTotalScoreAttributes() {
		return totalScoreAttributes;
	}
	public void setTotalScoreAttributes(java.util.Collection totalScoreAttributes) {
		this.totalScoreAttributes = totalScoreAttributes;
	}
	public Long getSelectedTotalScoreAttribute() {
		return selectedTotalScoreAttribute;
	}
	public void setSelectedTotalScoreAttribute(Long selectedTotalScoreAttribute) {
		this.selectedTotalScoreAttribute = selectedTotalScoreAttribute;
	}
	public String getStepName() {
		return stepName;
	}
	public void setStepName(String stepName) {
		this.stepName = stepName;
	}
	public String getStepId() {
		return stepId;
	}
	public void setStepId(String stepId) {
		this.stepId = stepId;
	}
	public String getQcStepFlag() {
		return qcStepFlag;
	}
	public void setQcStepFlag(String qcStepFlag) {
		this.qcStepFlag = qcStepFlag;
	}
	
    
	
}