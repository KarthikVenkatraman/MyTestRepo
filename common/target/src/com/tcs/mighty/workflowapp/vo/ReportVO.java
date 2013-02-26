// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: ValueObject.vsl in andromda-java-cartridge.
//
package com.tcs.mighty.workflowapp.vo;

/**
 * 
 */
public class ReportVO
    implements java.io.Serializable
{
    /**
     * The serial version UID of this class. Needed for serialization.
     */
    private static final long serialVersionUID = 5660558977086938349L;

    public ReportVO()
    {
    }

    public ReportVO(java.lang.String processName, java.lang.String stepName, java.lang.Long processInstanceId, java.lang.String status, java.sql.Timestamp entryTime, java.sql.Timestamp completionTime, java.lang.Double stepTat, java.lang.Double txnTat, java.lang.Integer stepSla, java.lang.Integer txnSla, java.lang.String targetUser, java.lang.String targetRole, java.lang.String keyFields, java.lang.String businessKey, java.lang.String stepNo, java.sql.Timestamp processCompletionTime, java.lang.String stepAction, java.lang.Long stepId)
    {
        this.processName = processName;
        this.stepName = stepName;
        this.processInstanceId = processInstanceId;
        this.status = status;
        this.entryTime = entryTime;
        this.completionTime = completionTime;
        this.stepTat = stepTat;
        this.txnTat = txnTat;
        this.stepSla = stepSla;
        this.txnSla = txnSla;
        this.targetUser = targetUser;
        this.targetRole = targetRole;
        this.keyFields = keyFields;
        this.businessKey = businessKey;
        this.stepNo = stepNo;
        this.processCompletionTime = processCompletionTime;
        this.stepAction = stepAction;
        this.stepId = stepId;
    }

    /**
     * Copies constructor from other ReportVO
     *
     * @param otherBean, cannot be <code>null</code>
     * @throws java.lang.NullPointerException if the argument is <code>null</code>
     */
    public ReportVO(ReportVO otherBean)
    {
        this(otherBean.getProcessName(), otherBean.getStepName(), otherBean.getProcessInstanceId(), otherBean.getStatus(), otherBean.getEntryTime(), otherBean.getCompletionTime(), otherBean.getStepTat(), otherBean.getTxnTat(), otherBean.getStepSla(), otherBean.getTxnSla(), otherBean.getTargetUser(), otherBean.getTargetRole(), otherBean.getKeyFields(), otherBean.getBusinessKey(), otherBean.getStepNo(), otherBean.getProcessCompletionTime(), otherBean.getStepAction(), otherBean.getStepId());
    }

    /**
     * Copies all properties from the argument value object into this value object.
     */
    public void copy(ReportVO otherBean)
    {
        if (otherBean != null)
        {
            this.setProcessName(otherBean.getProcessName());
            this.setStepName(otherBean.getStepName());
            this.setProcessInstanceId(otherBean.getProcessInstanceId());
            this.setStatus(otherBean.getStatus());
            this.setEntryTime(otherBean.getEntryTime());
            this.setCompletionTime(otherBean.getCompletionTime());
            this.setStepTat(otherBean.getStepTat());
            this.setTxnTat(otherBean.getTxnTat());
            this.setStepSla(otherBean.getStepSla());
            this.setTxnSla(otherBean.getTxnSla());
            this.setTargetUser(otherBean.getTargetUser());
            this.setTargetRole(otherBean.getTargetRole());
            this.setKeyFields(otherBean.getKeyFields());
            this.setBusinessKey(otherBean.getBusinessKey());
            this.setStepNo(otherBean.getStepNo());
            this.setProcessCompletionTime(otherBean.getProcessCompletionTime());
            this.setStepAction(otherBean.getStepAction());
            this.setStepId(otherBean.getStepId());
        }
    }

    private java.lang.String processName;

    /**
     * 
     */
    public java.lang.String getProcessName()
    {
        return this.processName;
    }

    public void setProcessName(java.lang.String processName)
    {
        this.processName = processName;
    }

    private java.lang.String stepName;

    /**
     * 
     */
    public java.lang.String getStepName()
    {
        return this.stepName;
    }

    public void setStepName(java.lang.String stepName)
    {
        this.stepName = stepName;
    }

    private java.lang.Long processInstanceId;

    /**
     * 
     */
    public java.lang.Long getProcessInstanceId()
    {
        return this.processInstanceId;
    }

    public void setProcessInstanceId(java.lang.Long processInstanceId)
    {
        this.processInstanceId = processInstanceId;
    }

    private java.lang.String status;

    /**
     * 
     */
    public java.lang.String getStatus()
    {
        return this.status;
    }

    public void setStatus(java.lang.String status)
    {
        this.status = status;
    }

    private java.sql.Timestamp entryTime;

    /**
     * 
     */
    public java.sql.Timestamp getEntryTime()
    {
        return this.entryTime;
    }

    public void setEntryTime(java.sql.Timestamp entryTime)
    {
        this.entryTime = entryTime;
    }

    private java.sql.Timestamp completionTime;

    /**
     * 
     */
    public java.sql.Timestamp getCompletionTime()
    {
        return this.completionTime;
    }

    public void setCompletionTime(java.sql.Timestamp completionTime)
    {
        this.completionTime = completionTime;
    }

    private java.lang.Double stepTat;

    /**
     * 
     */
    public java.lang.Double getStepTat()
    {
        return this.stepTat;
    }

    public void setStepTat(java.lang.Double stepTat)
    {
        this.stepTat = stepTat;
    }

    private java.lang.Double txnTat;

    /**
     * 
     */
    public java.lang.Double getTxnTat()
    {
        return this.txnTat;
    }

    public void setTxnTat(java.lang.Double txnTat)
    {
        this.txnTat = txnTat;
    }

    private java.lang.Integer stepSla;

    /**
     * 
     */
    public java.lang.Integer getStepSla()
    {
        return this.stepSla;
    }

    public void setStepSla(java.lang.Integer stepSla)
    {
        this.stepSla = stepSla;
    }

    private java.lang.Integer txnSla;

    /**
     * 
     */
    public java.lang.Integer getTxnSla()
    {
        return this.txnSla;
    }

    public void setTxnSla(java.lang.Integer txnSla)
    {
        this.txnSla = txnSla;
    }

    private java.lang.String targetUser;

    /**
     * 
     */
    public java.lang.String getTargetUser()
    {
        return this.targetUser;
    }

    public void setTargetUser(java.lang.String targetUser)
    {
        this.targetUser = targetUser;
    }

    private java.lang.String targetRole;

    /**
     * 
     */
    public java.lang.String getTargetRole()
    {
        return this.targetRole;
    }

    public void setTargetRole(java.lang.String targetRole)
    {
        this.targetRole = targetRole;
    }

    private java.lang.String keyFields;

    /**
     * 
     */
    public java.lang.String getKeyFields()
    {
        return this.keyFields;
    }

    public void setKeyFields(java.lang.String keyFields)
    {
        this.keyFields = keyFields;
    }

    private java.lang.String businessKey;

    /**
     * 
     */
    public java.lang.String getBusinessKey()
    {
        return this.businessKey;
    }

    public void setBusinessKey(java.lang.String businessKey)
    {
        this.businessKey = businessKey;
    }

    private java.lang.String stepNo;

    /**
     * 
     */
    public java.lang.String getStepNo()
    {
        return this.stepNo;
    }

    public void setStepNo(java.lang.String stepNo)
    {
        this.stepNo = stepNo;
    }

    private java.sql.Timestamp processCompletionTime;

    /**
     * 
     */
    public java.sql.Timestamp getProcessCompletionTime()
    {
        return this.processCompletionTime;
    }

    public void setProcessCompletionTime(java.sql.Timestamp processCompletionTime)
    {
        this.processCompletionTime = processCompletionTime;
    }

    private java.lang.String stepAction;

    /**
     * 
     */
    public java.lang.String getStepAction()
    {
        return this.stepAction;
    }

    public void setStepAction(java.lang.String stepAction)
    {
        this.stepAction = stepAction;
    }

    private java.lang.Long stepId;

    /**
     * 
     */
    public java.lang.Long getStepId()
    {
        return this.stepId;
    }

    public void setStepId(java.lang.Long stepId)
    {
        this.stepId = stepId;
    }

	private java.util.Map keyFieldMap;

	public java.util.Map getKeyFieldMap(){
		return keyFieldMap;
	}

	public void setKeyFieldMap(java.util.Map keyFieldMap){
		this.keyFieldMap = keyFieldMap;
	}

	private java.lang.String key1;

    /**
     * <p>
     * The key string specific to business
     * </p>
     */
    public java.lang.String getKey1()
    {
        return this.key1;
    }

    public void setKey1(java.lang.String key1)
    {
        this.key1 = key1;
    }

    private java.lang.String key2;

    /**
     * <p>
     * The key string specific to business
     * </p>
     */
    public java.lang.String getKey2()
    {
        return this.key2;
    }

    public void setKey2(java.lang.String key2)
    {
        this.key2 = key2;
    }

    private java.lang.String key3;

    /**
     * <p>
     * The key string specific to business
     * </p>
     */
    public java.lang.String getKey3()
    {
        return this.key3;
    }

    public void setKey3(java.lang.String key3)
    {
        this.key3 = key3;
    }

    private java.lang.String key4;

    /**
     * <p>
     * The key string specific to business
     * </p>
     */
    public java.lang.String getKey4()
    {
        return this.key4;
    }

    public void setKey4(java.lang.String key4)
    {
        this.key4 = key4;
    }

    private java.lang.String key5;

    /**
     * <p>
     * The key string specific to business
     * </p>
     */
    public java.lang.String getKey5()
    {
        return this.key5;
    }

    public void setKey5(java.lang.String key5)
    {
        this.key5 = key5;
    }

    private java.lang.String key6;

    /**
     * 
     */
    public java.lang.String getKey6()
    {
        return this.key6;
    }

    public void setKey6(java.lang.String key6)
    {
        this.key6 = key6;
    }

    private java.lang.String key7;

    /**
     * 
     */
    public java.lang.String getKey7()
    {
        return this.key7;
    }

    public void setKey7(java.lang.String key7)
    {
        this.key7 = key7;
    }

    private java.lang.String key8;

    /**
     * 
     */
    public java.lang.String getKey8()
    {
        return this.key8;
    }

    public void setKey8(java.lang.String key8)
    {
        this.key8 = key8;
    }

    private java.lang.String key9;

    /**
     * 
     */
    public java.lang.String getKey9()
    {
        return this.key9;
    }

    public void setKey9(java.lang.String key9)
    {
        this.key9 = key9;
    }

    private java.lang.String key10;

    /**
     * 
     */
    public java.lang.String getKey10()
    {
        return this.key10;
    }

    public void setKey10(java.lang.String key10)
    {
        this.key10 = key10;
    }

    private java.lang.String key11;

    /**
     * 
     */
    public java.lang.String getKey11()
    {
        return this.key11;
    }

    public void setKey11(java.lang.String key11)
    {
        this.key11 = key11;
    }

    private java.lang.String key12;

    /**
     * 
     */
    public java.lang.String getKey12()
    {
        return this.key12;
    }

    public void setKey12(java.lang.String key12)
    {
        this.key12 = key12;
    }

    private java.lang.String key13;

    /**
     * 
     */
    public java.lang.String getKey13()
    {
        return this.key13;
    }

    public void setKey13(java.lang.String key13)
    {
        this.key13 = key13;
    }

    private java.lang.String key14;

    /**
     * 
     */
    public java.lang.String getKey14()
    {
        return this.key14;
    }

    public void setKey14(java.lang.String key14)
    {
        this.key14 = key14;
    }

    private java.lang.String key15;

    /**
     * 
     */
    public java.lang.String getKey15()
    {
        return this.key15;
    }

    public void setKey15(java.lang.String key15)
    {
        this.key15 = key15;
    }

}