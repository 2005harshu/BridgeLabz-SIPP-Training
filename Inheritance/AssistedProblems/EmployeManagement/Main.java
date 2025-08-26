package EmployeManagement;

public class Main {
	public static void main(String[] args) {
        Employee e1 = new Manager("Aditi", 101, 85000, 5);
        Employee e2 = new Developer("Rahul", 102, 75000, "Java");
        Employee e3 = new Intern("Sneha", 103, 15000, 6);

        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();
    }

}
