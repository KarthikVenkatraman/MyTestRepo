package com.tcs.mighty.workflowapp.util;

public class Utilities {
	public static final java.lang.String getInstanceCsv(java.lang.Integer samplingPercentage)
	{
		java.util.Random r = new java.util.Random();
    	java.util.List instanceList = new java.util.ArrayList();
    	Integer randomNo;
    	for(int i=0;i<samplingPercentage.intValue();i++){
    		randomNo = new Integer(r.nextInt(100)+1);
    		while(instanceList.contains(randomNo)){
    			randomNo = new Integer(r.nextInt(100)+1);
    		}
    		
    		instanceList.add(randomNo);
    		
    	}

    	java.util.Collections.sort(instanceList);
    	
    	java.lang.String instanceCsv = instanceList.toString();

		instanceCsv = instanceCsv.substring(1, instanceCsv.length()-1)+", ";

		return instanceCsv;

	}
}
