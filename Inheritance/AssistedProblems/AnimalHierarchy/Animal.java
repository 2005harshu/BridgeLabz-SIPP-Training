package AnimalHierarchy;

// Superclass
public class Animal {
	String name;
	int age;
	
	//constructor
	Animal(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	//method to be overridden
	void makeSound() {
		System.out.println("Animal makes sound !!");
	}
}
