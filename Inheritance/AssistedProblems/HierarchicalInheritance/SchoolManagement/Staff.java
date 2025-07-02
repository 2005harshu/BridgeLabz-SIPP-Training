package HierarchicalInheritance.SchoolManagement;

public class Staff extends Person{
	String department;

    public Staff(String name, int age, String dept) {
        super(name, age);
        this.department = dept;
    }

    public void displayRole() {
        System.out.println("Role: Staff");
        System.out.println("Department: " + department);
    }

}
