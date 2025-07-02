package EmployeManagement;

public class Intern extends Employee {
	 int durationMonths;

	    public Intern(String name, int id, double salary, int months) {
	        super(name, id, salary);
	        this.durationMonths = months;
	    }

	    @Override
	    public void displayDetails() {
	        super.displayDetails();
	        System.out.println("Internship Duration: " + durationMonths + " months");
	    }

}
