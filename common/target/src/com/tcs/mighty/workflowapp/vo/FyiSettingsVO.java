// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: ValueObject.vsl in andromda-java-cartridge.
//
package com.tcs.mighty.workflowapp.vo;

/**
 * 
 */
public class FyiSettingsVO
    implements java.io.Serializable
{
    /**
     * The serial version UID of this class. Needed for serialization.
     */
    private static final long serialVersionUID = -8315496198569476048L;

    public FyiSettingsVO()
    {
        this.id = null;
    }

    public FyiSettingsVO(java.lang.Long id)
    {
        this.id = id;
    }

    public FyiSettingsVO(java.lang.String sendFyi, java.lang.String defaultRole, java.lang.String fyiMessage, java.lang.String notifyUsersCSV, java.lang.String notifyRoles, java.lang.String notifyPreviousSteps, java.lang.Long id)
    {
        this.sendFyi = sendFyi;
        this.defaultRole = defaultRole;
        this.fyiMessage = fyiMessage;
        this.notifyUsersCSV = notifyUsersCSV;
        this.notifyRoles = notifyRoles;
        this.notifyPreviousSteps = notifyPreviousSteps;
        this.id = id;
    }

    /**
     * Copies constructor from other FyiSettingsVO
     *
     * @param otherBean, cannot be <code>null</code>
     * @throws java.lang.NullPointerException if the argument is <code>null</code>
     */
    public FyiSettingsVO(FyiSettingsVO otherBean)
    {
        this(otherBean.getSendFyi(), otherBean.getDefaultRole(), otherBean.getFyiMessage(), otherBean.getNotifyUsersCSV(), otherBean.getNotifyRoles(), otherBean.getNotifyPreviousSteps(), otherBean.getId());
    }

    /**
     * Copies all properties from the argument value object into this value object.
     */
    public void copy(FyiSettingsVO otherBean)
    {
        if (otherBean != null)
        {
            this.setSendFyi(otherBean.getSendFyi());
            this.setDefaultRole(otherBean.getDefaultRole());
            this.setFyiMessage(otherBean.getFyiMessage());
            this.setNotifyUsersCSV(otherBean.getNotifyUsersCSV());
            this.setNotifyRoles(otherBean.getNotifyRoles());
            this.setNotifyPreviousSteps(otherBean.getNotifyPreviousSteps());
            this.setId(otherBean.getId());
        }
    }

    private java.lang.String sendFyi;

    /**
     * 
     */
    public java.lang.String getSendFyi()
    {
        return this.sendFyi;
    }

    public void setSendFyi(java.lang.String sendFyi)
    {
        this.sendFyi = sendFyi;
    }

    private java.lang.String defaultRole;

    /**
     * 
     */
    public java.lang.String getDefaultRole()
    {
        return this.defaultRole;
    }

    public void setDefaultRole(java.lang.String defaultRole)
    {
        this.defaultRole = defaultRole;
    }

    private java.lang.String fyiMessage;

    /**
     * 
     */
    public java.lang.String getFyiMessage()
    {
        return this.fyiMessage;
    }

    public void setFyiMessage(java.lang.String fyiMessage)
    {
        this.fyiMessage = fyiMessage;
    }

    private java.lang.String notifyUsersCSV;

    /**
     * 
     */
    public java.lang.String getNotifyUsersCSV()
    {
        return this.notifyUsersCSV;
    }

    public void setNotifyUsersCSV(java.lang.String notifyUsersCSV)
    {
        this.notifyUsersCSV = notifyUsersCSV;
    }

    private java.lang.String notifyRoles;

    /**
     * 
     */
    public java.lang.String getNotifyRoles()
    {
        return this.notifyRoles;
    }

    public void setNotifyRoles(java.lang.String notifyRoles)
    {
        this.notifyRoles = notifyRoles;
    }

    private java.lang.String notifyPreviousSteps;

    /**
     * 
     */
    public java.lang.String getNotifyPreviousSteps()
    {
        return this.notifyPreviousSteps;
    }

    public void setNotifyPreviousSteps(java.lang.String notifyPreviousSteps)
    {
        this.notifyPreviousSteps = notifyPreviousSteps;
    }

    private java.lang.Long id;

    /**
     * 
     */
    public java.lang.Long getId()
    {
        return this.id;
    }

    public void setId(java.lang.Long id)
    {
        this.id = id;
    }

}