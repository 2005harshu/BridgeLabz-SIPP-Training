package HierarchicalInheritance.BankAccount;

public class SavingsAccount extends BankAccount {
	 double interestRate;

	    public SavingsAccount(String accNum, double balance, double interestRate) {
	        super(accNum, balance);
	        this.interestRate = interestRate;
	    }

	    public void displayAccountType() {
	        System.out.println("Account Type: Savings Account");
	        System.out.println("Interest Rate: " + interestRate + "%");
	    }

}
