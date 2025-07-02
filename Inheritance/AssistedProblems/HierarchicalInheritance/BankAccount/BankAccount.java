package HierarchicalInheritance.BankAccount;

public class BankAccount {
	 String accountNumber;
	    double balance;

	    public BankAccount(String accNum, double balance) {
	        this.accountNumber = accNum;
	        this.balance = balance;
	    }

	    public void displayInfo() {
	        System.out.println("Account Number: " + accountNumber);
	        System.out.println("Balance: ₹" + balance);
	    }

}
