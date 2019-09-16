package NewBank;

public class Account {
	private String accountNumber; 
	private String firstName; 
	private String lastName; 
	private String accountType;
	private double balance;
	
	public Account() {
		System.out.println("Default Contructer Invoked..");
		accountNumber = "Not Specified";
		firstName  = "Not Specified";
		lastName   = "Not Specified";
		accountType = "Not Specified";
		balance = 0.0;
	}
	public Account(String accountNumber, String firstName, String lastName, 
			String accountType, double balance ) {
		this.accountNumber = accountNumber; 
		this.firstName = firstName; 
		this.lastName = lastName; 
		this.accountType = accountType; 
		this.balance = balance;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
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
	
}
