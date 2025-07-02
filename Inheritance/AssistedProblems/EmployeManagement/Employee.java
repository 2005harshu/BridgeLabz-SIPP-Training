package EmployeManagement;

public class Employee {
	private String name;
	private int age;
	private double salary;
	
	Employee(String name,int age,double salary){
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	
	public void displayDetails() {
		System.out.println("Employee name:"+name);
		System.out.println("Employee age:"+age);
		System.out.println("Employee salary:"+salary);
	}
}
