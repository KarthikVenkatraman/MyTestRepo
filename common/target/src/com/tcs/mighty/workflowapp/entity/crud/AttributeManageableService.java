// license-header java merge-point
package com.tcs.mighty.workflowapp.entity.crud;

public interface AttributeManageableService
{
    public com.tcs.mighty.workflowapp.entity.crud.AttributeValueObject create(java.lang.String columnNameInExcel, java.lang.String validatorPattern, java.lang.String isUnique, java.lang.String isSearchField, java.lang.String mandatory, java.lang.String displayedOnSearch, java.lang.String name, java.lang.Integer displayOrder, java.lang.String displayName, java.lang.String followUp, java.lang.String sorted, java.lang.String entityNameFlag, java.lang.String validationMsg, java.lang.String helpText, java.lang.String inputSize, java.lang.String delimiter, java.lang.String isPrimaryKey, java.lang.String alertOnChange, java.lang.String alertOnValues, java.lang.String prefixForAutoGen, java.lang.Long startValueForAutoGen, java.lang.Long id, java.lang.Long attributeCategory, java.lang.Long parentAttribute, java.lang.Long childAttribute, java.lang.Long[] attributeValues, java.lang.Long parentAttributeValue, java.lang.Long attributeType, java.lang.Long[] usrprocattrvalmap)
        throws Exception;

    public java.util.List read(java.lang.String columnNameInExcel, java.lang.String validatorPattern, java.lang.String isUnique, java.lang.String isSearchField, java.lang.String mandatory, java.lang.String displayedOnSearch, java.lang.String name, java.lang.Integer displayOrder, java.lang.String displayName, java.lang.String followUp, java.lang.String sorted, java.lang.String entityNameFlag, java.lang.String validationMsg, java.lang.String helpText, java.lang.String inputSize, java.lang.String delimiter, java.lang.String isPrimaryKey, java.lang.String alertOnChange, java.lang.String alertOnValues, java.lang.String prefixForAutoGen, java.lang.Long startValueForAutoGen, java.lang.Long id, java.lang.Long attributeCategory, java.lang.Long parentAttribute, java.lang.Long childAttribute, java.lang.Long[] attributeValues, java.lang.Long parentAttributeValue, java.lang.Long attributeType, java.lang.Long[] usrprocattrvalmap)
        throws Exception;

    public java.util.List readAll()
        throws Exception;

    public java.util.Map readBackingLists()
        throws Exception;

    public com.tcs.mighty.workflowapp.entity.crud.AttributeValueObject update(java.lang.String columnNameInExcel, java.lang.String validatorPattern, java.lang.String isUnique, java.lang.String isSearchField, java.lang.String mandatory, java.lang.String displayedOnSearch, java.lang.String name, java.lang.Integer displayOrder, java.lang.String displayName, java.lang.String followUp, java.lang.String sorted, java.lang.String entityNameFlag, java.lang.String validationMsg, java.lang.String helpText, java.lang.String inputSize, java.lang.String delimiter, java.lang.String isPrimaryKey, java.lang.String alertOnChange, java.lang.String alertOnValues, java.lang.String prefixForAutoGen, java.lang.Long startValueForAutoGen, java.lang.Long id, java.lang.Long attributeCategory, java.lang.Long parentAttribute, java.lang.Long childAttribute, java.lang.Long[] attributeValues, java.lang.Long parentAttributeValue, java.lang.Long attributeType, java.lang.Long[] usrprocattrvalmap)
        throws Exception;

    public void delete(java.lang.Long[] ids)
        throws Exception;

}
