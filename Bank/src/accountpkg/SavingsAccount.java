package accountpkg;

import bankpkg.Bank;
import bankpkg.ITransaction;

import java.text.*;
import java.util.*;

public class SavingsAccount extends Account implements ITransaction{
	private double dailyInterest;
	private int daysOfYear;
	
	public SavingsAccount(String accountNumber, String accountHolderName, String accountType,
			double balance, int daysOfYear) {
		super(accountNumber, accountHolderName, accountType,balance);
		this.daysOfYear = daysOfYear;
	}
	
    public double calculateInterest() {
        
        dailyInterest = (super.getBalance() * bankpkg.Bank.interestRate / 100)/ daysOfYear;

        return new Formatter().decimalFormat(dailyInterest);
    }
//	@Override
//    public void displayDetails() {
//
//        // Invoke super class method
//        super.displayDetails();
//
//        // Invoke calcuntln("Daily Interest is: $" + calculateInterest());
//        System.out.prilateInterest();
//        System.out.println("-----------------------------------------");
//    }
	@Override
    public void checkBalance(String accountNumber) {
        System.out.println("-----------------------------------------");
        System.out.println("Available balance: $" + super.getBalance());
        System.out.println("-----------------------------------------");
    }
	 @Override
	  public void depositCash(String accountNumber, double amount) {
	        // Add the value of amount to the existing balance
	        super.setBalance(super.getBalance() + amount);
	        System.out.println("-------------------------------------");

	        // Invoke nested class method formatDate() using the class instance
	        System.out.println("Date-Time:" + new Formatter().formatDate());
	        System.out.println("Amount deposited: $" + amount);
	        System.out.println("Balance after deposit: $" + super.getBalance());
	        System.out.println("-----------------------------------------");

	  }
	 @Override
	    public void withdrawCash(String accoutNumber, double amount) {
	        // Deduct the value of amount from the existing balance
	        super.setBalance(super.getBalance() - amount);
	        System.out.println("-----------------------------------------");

	        // Invoke nested class method formatDate() using the class instance
	        System.out.println("Date-Time:" + new Formatter().formatDate());
	        System.out.println("Amount withdrawn: $" + amount);
	        System.out.println("Balance after withdrawal: $" + super.getBalance());
	        System.out.println("-----------------------------------------");
	    }
	 class Formatter {

	        /**
	         * Formats the date
	         *
	         * @return String
	         */
	        public String formatDate() {

	            // creating Calendar class instance
	            Calendar objNow = Calendar.getInstance();

	            // creating SimpleDateFormat class instance to set the date format
	            SimpleDateFormat objFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	            // return the formatted date using the format() method
	            return objFormat.format(objNow.getTime());
	        }

	        public double decimalFormat(double value) {

	            // Instantiate class DecimalFormat to get two digit precision
	            DecimalFormat twoDForm = new DecimalFormat("#.00");

	            // Return the two digit precision value
	            return Double.valueOf(twoDForm.format(value));
	        }
	    }

}
