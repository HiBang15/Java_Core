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
		System.out.println("Default contructor invoked...");
		accountNumber = "Not Specified";
		accountHolderName = "Not Specified";
		accountType = "Not Specified";
		balance = 0.0;
	}
	public Account(String accountNumber, String accountHolderName, String accountType, double balance) {
		System.out.println("Parameterized Constructor Invoked");
		
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName; 
		this.accountType = accountType; 
		this.balance = balance;
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
	
	public void addDetails(String[] details) {
		System.out.println("Adding Account Details. Please wait...");
		for(int i=0; i<details.length;i++) {
			accDetails.add(details[i]);
		}
	}
	
	public void displayDetails(){

        System.out.println("All Account Details of Customer");
        System.out.println("-----------------------------------------");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Acount Holder Name: " + accountHolderName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: $" + balance);
    }
	
	
}
