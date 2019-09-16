package bankpkg;

public interface ITransaction {
	public void checkBalance(String accountNumber);
	public void depositCash(String accountNumber, double amount);
	public void withdrawCash(String accountNumber, double amount);
}
