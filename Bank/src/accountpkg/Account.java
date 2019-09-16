package accountpkg;

import java.util.ArrayList;
import java.util.Iterator;

public class Account {
	private String accountNumber;
	private String accountHolderName;
	private String accountType;
	private double balance;
	
	private ArrayList accDetails = new ArrayList();
	
	public Account() {
		System.out.println("Default contructoer Invoked...");
		accountNumber = "Not Specified!";
		accountHolderName = "Not Specified!";
		accountType = "Not Specified!";
		balance = 0.0;
	}
	
	public Account(String accountNumber, String accountHolderName,
			String accountType, double balance ) {
		System.out.println("Parameterized Contructor Invoked!");
		
		this.accountNumber     = accountNumber;
		this.accountHolderName = accountHolderName;
		this.accountType	   = accountType; 
		this.balance		   = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public ArrayList getAccDetails() {
		return accDetails;
	}

	public void setAccDetails(ArrayList accDetails) {
		this.accDetails = accDetails;
	}
	
	public void displayDetails() {
		System.out.println("All Account Details of Custormer");
		System.out.println("--------------------------------");
		
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Account Holder Name: "+accountHolderName);
		System.out.println("Account Type: "+accountType);
		System.out.println("Balance: "+balance);
		
	}

}
