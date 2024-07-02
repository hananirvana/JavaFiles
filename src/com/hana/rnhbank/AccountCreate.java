package com.hana.rnhbank;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class AccountCreate {
	
	public static Map<String, Integer> customerInfo = new HashMap<String, Integer>();
	
	public static int accNo1;
	public static int accNo;
	
	
	public static void main(String[] args) {
		
		System.out.println("Customer database ====:"+ customerInfo.toString());
		
		System.out.println("Acc info: "+customerInfo.get("Hana") );
		
		for (Entry<String, Integer> entry : customerInfo.entrySet()) {
            if (entry.getValue().equals(accNo)) {
                System.out.println("Acc info: "+ entry.getKey());
            }
        }
	
		
	}
	
	
	public static int generateRandomAccNum() {		
		int min = 1000000000;
		int max = 1000999999;
		
		int r = (int)(Math.random()*(max-min+1)+min);
		//System.out.println("Random account number is:"+ r);
		return r;
	}
	
	
	/*
	 * public static void storeCustInfo() {
	 * 
	 * String name = "Hana"; accNo = generateRandomAccNum(); customerInfo.put(name,
	 * accNo);
	 * 
	 * String name1 = "Ryan"; accNo1 = generateRandomAccNum();
	 * customerInfo.put(name1, accNo1); }
	 */
	
	public static void storeCustomerAccInfo(String name) {
		int accNum = generateRandomAccNum();
		String customerName = name;
		customerInfo.put(customerName, accNum);
	}
	

}
