package HybridInheritance.RestaurantManagement;

public class Person {
	 String name;
	    int id;

	    public Person(String name, int id) {
	        this.name = name;
	        this.id = id;
	    }

	    public void displayPerson() {
	        System.out.println("Name: " + name + ", ID: " + id);
	    }

}
