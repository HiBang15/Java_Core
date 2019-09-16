package bankpkg;

import java.util.*;

public class Bank {
	String bankID; 
	String bankName; 
	String branch;
	
	private ArrayList bankDetails = new ArrayList();
	
	public final static float interestRate = 3.5F;
	
	public Bank() {
		bankID = "Not Specified";
		bankName = "Not Specified";
		branch   = "Not Specified";
	}
	
	public void addBankDetails(String[] details) {
		System.out.println("Adding Bank Detail....Please wait......");
		for(int i=0; i<details.length;i++) {
			bankDetails.add(details[i]);
		}
	}
	
	public void displayBankDetails() {
		System.out.println("Bank Detail Of Custormer.");
		System.out.println("BankID   Bank Name \t Branch  Interest(%");
		System.out.println("----------------------------------------");
		
		Iterator iBank = bankDetails.iterator();
		while(iBank.hasNext()) {
			System.out.print(iBank.next()+"  ");
		}
		System.out.print(interestRate);
		System.out.println("");
	}
}
