package bankpkg;

import java.util.ArrayList;
import java.util.Iterator;

public class Bank {
	String bankID; 
	String bankName; 
	String branch;
	
	private ArrayList bankDetails = new ArrayList();
	
	public final static float interestRate = 3.5F;
	
	public Bank() {
		bankID = "Not specified";
		bankName = "Not specified";
		branch = "Not specified";
	}
	
	public Bank(String bankID, String bankName, String branch) {
		this.bankID = bankID; 
		this.bankName = bankName; 
		this.branch = branch;
	}
	
	public void addBankDetails(String[] details) {
		System.out.println("Adding Bank Details. Please wait....");
		
		for(int i=0; i<details.length; i++) {
			bankDetails.add(details[i]);
		}
	}
	
	public void displayBankDetails() {
		System.out.println("Bank Details of Custormer ");
		System.out.println("Bank ID. Bank Name\t Branch Interest(%) ");
		System.out.println("----------------------------------------");
		
		Iterator iBank = bankDetails.iterator();
		while(iBank.hasNext()) {
			System.out.println(iBank.next()+" ");
		}
		System.out.println(interestRate);
		System.out.println(" ");
	}
}
