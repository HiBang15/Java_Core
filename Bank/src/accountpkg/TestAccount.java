package accountpkg;

import bankpkg.Bank;
import java.util.Scanner;

public class TestAccount {
	public static void main(String[] args) {
		try {
			String[] accountDetails = new String[5];
			String[] bankDetails    = new String[3];
			
			
			// Accept the account details
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the Account Number: ");
			accountDetails[0] = input.nextLine();
			System.out.println("Enter Name: ");
			accountDetails[1] = input.nextLine();
			System.out.println("Enter Account Type: ");
			accountDetails[2] = input.nextLine();
			System.out.println("Enter Balance: ");
			accountDetails[3] = input.nextLine();
			System.out.println("Enter Number of day: ");
			accountDetails[4] = input.nextLine();
			
			// Accept the bank details
            System.out.print("Enter Bank ID: ");
            bankDetails[0] = input.nextLine(); //accepts bank id
            System.out.print("Enter Bank Name: ");
            bankDetails[1] = input.nextLine(); //accepts bank name
            System.out.print("Enter Branch: ");
            bankDetails[2] = input.nextLine(); //accepts branch
            
            System.out.println("-----------------------------------------");
            //Declare and instantiate object of type SavingsAccount
            SavingsAccount objAccount1 = new SavingsAccount(accountDetails[0],
                    accountDetails[1], accountDetails[2],
                    Double.parseDouble(accountDetails[3]),
                    Integer.parseInt(accountDetails[4]));

            // Display the details of objAccount1 object
            objAccount1.displayDetails();
            System.out.println("-----------------------------------------");
            
         // Display the details of objAccount1 object
            objAccount1.displayDetails();
            System.out.println("-----------------------------------------");

            // Declare and instantiate object of type Bank
            Bank objBank1 = new Bank();

            // Add the bank details of objBank1 object
            objBank1.addBankDetails(bankDetails);

            // Display bank details of objBank1 object
            objBank1.displayBankDetails();

            //Check account balance
            objAccount1.checkBalance(accountDetails[0]);

            // Deposit cash into the account
            System.out.print("Enter Deposit Amount: ");
            double deposit = Double.parseDouble(input.nextLine());
            // Invoke the depositCash() method
            objAccount1.depositCash(accountDetails[0], deposit);

            // Withdraw cash from the account
            System.out.print("Enter Withdrawal Amount: ");
            double withdraw = Double.parseDouble(input.nextLine());
            // Invoke the withdrawCash() method
            objAccount1.withdrawCash(accountDetails[0], withdraw);
		}catch(ArrayIndexOutOfBoundsException ex) {
            // Display an error message when exception is raised
            System.out.println("Error: Array Index Out of Bounds");
        }catch(NumberFormatException ex) {
            // Display an error message when exception is raised
            System.out.println("Error: Illegal Argument, " + ex.getMessage());
        }
	}
}
