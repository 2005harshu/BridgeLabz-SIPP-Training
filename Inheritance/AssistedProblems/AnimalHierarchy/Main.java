package AnimalHierarchy;

public class Main {
	public static void main(String[] args) {
		Animal dog=new Dog("Dino",4);
		Animal cat =new Cat("Mumua",5);
		Animal bird=new Bird("Pupu",1);
		
		
		dog.makeSound();
		cat.makeSound();
		bird.makeSound();
	}
}
