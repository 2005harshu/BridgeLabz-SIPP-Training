package Level_1;

import java.util.*;
class EmployeeMain {
	 public static void main(String[] args) {
		 	
		 	Scanner sc =new Scanner(System.in);
		 	
		 	System.out.print("Enter Employee name: ");
		 	String name=sc.nextLine();
		 	System.out.print("Enter Employee ID: ");
		 	int id=sc.nextInt();
		 	System.out.print("Enter Employee Salary: ");
		 	double salary=sc.nextDouble();
	        // Creating an Employee object
	        Employee emp = new Employee(name,id,salary);

	        // Displaying details
	        emp.displayDetails();
	    }
}
