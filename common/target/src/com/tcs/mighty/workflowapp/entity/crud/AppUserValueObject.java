// license-header java merge-point
package com.tcs.mighty.workflowapp.entity.crud;

public class AppUserValueObject
    implements java.io.Serializable
{
    private java.lang.String userId;

    public java.lang.String getUserId()
    {
        return this.userId;
    }

    public void setUserId(java.lang.String userId)
    {
        this.userId = userId;
    }

    private java.lang.String name;

    public java.lang.String getName()
    {
        return this.name;
    }

    public void setName(java.lang.String name)
    {
        this.name = name;
    }

    private java.lang.String emailId;

    public java.lang.String getEmailId()
    {
        return this.emailId;
    }

    public void setEmailId(java.lang.String emailId)
    {
        this.emailId = emailId;
    }

    private java.lang.String password;

    public java.lang.String getPassword()
    {
        return this.password;
    }

    public void setPassword(java.lang.String password)
    {
        this.password = password;
    }

    private java.lang.String deleteFlag;

    public java.lang.String getDeleteFlag()
    {
        return this.deleteFlag;
    }

    public void setDeleteFlag(java.lang.String deleteFlag)
    {
        this.deleteFlag = deleteFlag;
    }

    private java.lang.String adminFlag;

    public java.lang.String getAdminFlag()
    {
        return this.adminFlag;
    }

    public void setAdminFlag(java.lang.String adminFlag)
    {
        this.adminFlag = adminFlag;
    }

    private java.lang.Long id;

    public java.lang.Long getId()
    {
        return this.id;
    }

    public void setId(java.lang.Long id)
    {
        this.id = id;
    }

    private java.lang.Long[] instances;

    public java.lang.Long[] getInstances()
    {
        return this.instances;
    }

    public void setInstances(java.lang.Long[] instances)
    {
        this.instances = instances;
    }

    private java.lang.Long[] role;

    public java.lang.Long[] getRole()
    {
        return this.role;
    }

    public void setRole(java.lang.Long[] role)
    {
        this.role = role;
    }

    private java.lang.String[] roleLabels;

    public java.lang.String[] getRoleLabels()
    {
        return this.roleLabels;
    }

    public void setRoleLabels(java.lang.String[] roleLabels)
    {
        this.roleLabels = roleLabels;
    }

    
    private java.lang.String roleLabelsStrRep;

    public java.lang.String getRoleLabelsStrRep()
    {
        return this.roleLabelsStrRep;
    }

    public void setRoleLabelsStrRep(java.lang.String roleLabelsStrRep)
    {
        this.roleLabelsStrRep = roleLabelsStrRep;
    }

    private java.lang.String roleIdsStrRep;

    public java.lang.String getRoleIdsStrRep()
    {
        return this.roleIdsStrRep;
    }

    public void setRoleIdsStrRep(java.lang.String roleIdsStrRep)
    {
        this.roleIdsStrRep = roleIdsStrRep;
    }

    private java.lang.Long businessUnit;

    public java.lang.Long getBusinessUnit()
    {
        return this.businessUnit;
    }

    public void setBusinessUnit(java.lang.Long businessUnit)
    {
        this.businessUnit = businessUnit;
    }

    private java.lang.String businessUnitLabel;

    public java.lang.String getBusinessUnitLabel()
    {
        return this.businessUnitLabel;
    }

    public void setBusinessUnitLabel(java.lang.String businessUnitLabel)
    {
        this.businessUnitLabel = businessUnitLabel;
    }

    
    private java.lang.Long[] usrattrvalmap;

    public java.lang.Long[] getUsrattrvalmap()
    {
        return this.usrattrvalmap;
    }

    public void setUsrattrvalmap(java.lang.Long[] usrattrvalmap)
    {
        this.usrattrvalmap = usrattrvalmap;
    }
    
    public boolean equals(Object ob){
    	

    	System.out.println("Source:"+this.name);
    	
    	if( !(ob instanceof com.tcs.mighty.workflowapp.entity.crud.AppUserValueObject ) )
    			return false;
    	
    	com.tcs.mighty.workflowapp.entity.crud.AppUserValueObject appUserValueObject = ( com.tcs.mighty.workflowapp.entity.crud.AppUserValueObject )ob;
    	
    	if(appUserValueObject == null)
    		return false;
    	if(this.id.equals(appUserValueObject.id))
    	{
    		System.out.println("Source:"+true);
    		return true;
    	}
    	else    	
    		return false;
    }
    
	 public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			return result;
		}
    
    

    
}