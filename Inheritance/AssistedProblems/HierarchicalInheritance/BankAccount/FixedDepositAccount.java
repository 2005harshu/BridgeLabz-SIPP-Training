package HierarchicalInheritance.BankAccount;

public class FixedDepositAccount extends BankAccount {
	  int depositTermMonths;

	    public FixedDepositAccount(String accNum, double balance, int term) {
	        super(accNum, balance);
	        this.depositTermMonths = term;
	    }

	    public void displayAccountType() {
	        System.out.println("Account Type: Fixed Deposit Account");
	        System.out.println("Deposit Term: " + depositTermMonths + " months");
	    }

}
