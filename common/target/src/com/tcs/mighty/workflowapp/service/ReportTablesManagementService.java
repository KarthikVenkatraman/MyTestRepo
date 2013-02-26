// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: SpringService.vsl in andromda-spring-cartridge.
//
package com.tcs.mighty.workflowapp.service;

/**
 * 
 */
public interface ReportTablesManagementService
{

    /**
     * 
     */
    public boolean generateReportTables(java.lang.Long businessEntityId);
 
    /**
     * 
     */
    public boolean populateDataIntoReportTables(long offset, long limit,java.lang.Long businessEntityId);

    /**
     * 
     */
    public boolean updateDataIntoReportTables(long offset, long limit,String lastUpdatedOn,java.lang.Long businessEntityId);

    /**
     * 
     */
    public long getInstanceCount(java.lang.Long businessEntityId);

    /**
     * 
     */
    public long getInstanceCountForUpdate(java.lang.Long businessEntityId);
    /**
     * 
     */
    public String getLastUpdatedOnForUpdate(java.lang.Long businessEntityId);
     /**
     * 
     */
    public boolean syncupReportSchema(java.lang.Long businessEntityId);

    /**
     * 
     */
    public java.util.Collection getReportSchemaHistoryDetails(java.lang.Long businessEntityId);
    
    
    public void populateReportTablesBatch(java.lang.Long businessEntityId);

}
