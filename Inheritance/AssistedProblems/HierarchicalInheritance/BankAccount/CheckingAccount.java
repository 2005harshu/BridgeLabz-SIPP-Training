package HierarchicalInheritance.BankAccount;

public class CheckingAccount extends BankAccount {
	 double withdrawalLimit;

	    public CheckingAccount(String accNum, double balance, double limit) {
	        super(accNum, balance);
	        this.withdrawalLimit = limit;
	    }

	    public void displayAccountType() {
	        System.out.println("Account Type: Checking Account");
	        System.out.println("Withdrawal Limit: ₹" + withdrawalLimit);
	    }

}
