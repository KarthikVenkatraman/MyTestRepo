package com.tcs.mighty.workflowapp.vo;

import java.sql.Timestamp;

public class AbgBatchImportVO {
	
	String batch_name;
	String doc_class;
	String doc_type;
	String date;
	String row_id;
	
	java.util.Collection errorList;
	
	
	 public java.util.Collection getErrorList()
	    {
	        return this.errorList;
	    }

	    public void setErrorList(java.util.Collection errorList)
	    {
	        this.errorList = errorList;
	    }

	
	
	public String getBatch_name() {
		return batch_name;
	}
	public void setBatch_name(String batchName) {
		batch_name = batchName;
	}
	public String getDoc_class() {
		return doc_class;
	}
	public void setDoc_class(String docClass) {
		doc_class = docClass;
	}
	public String getDoc_type() {
		return doc_type;
	}
	public void setDoc_type(String docType) {
		doc_type = docType;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getRow_id() {
		return row_id;
	}
	public void setRow_id(String rowId) {
		row_id = rowId;
	}
	
	
	
	
	
	
	

}
