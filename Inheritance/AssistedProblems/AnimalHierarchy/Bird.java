package AnimalHierarchy;

//subclass
public class Bird extends Animal {
	Bird(String name,int age){
		super(name,age);
	}
	
	@Override
	void makeSound() {
		System.out.println(name+" says: chirp chirp !!");
	}
}
