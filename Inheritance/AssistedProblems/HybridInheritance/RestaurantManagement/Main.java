package HybridInheritance.RestaurantManagement;

public class Main {
	public static void main(String[] args) {
        Chef chef = new Chef("Raj", 101);
        Waiter waiter = new Waiter("Aman", 202);

        chef.displayPerson();
        chef.performDuties();

        System.out.println("---");

        waiter.displayPerson();
        waiter.performDuties();
    }

}
