package HierarchicalInheritance.BankAccount;

public class Main {
	public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount("SA123", 15000, 3.5);
        CheckingAccount c = new CheckingAccount("CA456", 25000, 10000);
        FixedDepositAccount f = new FixedDepositAccount("FD789", 50000, 12);

        s.displayInfo();
        s.displayAccountType();
        System.out.println("----");

        c.displayInfo();
        c.displayAccountType();
        System.out.println("----");

        f.displayInfo();
        f.displayAccountType();
    }

}
