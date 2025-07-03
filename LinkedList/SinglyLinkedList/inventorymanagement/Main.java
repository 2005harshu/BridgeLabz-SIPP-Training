package inventorymanagement;

public class Main {
	 public static void main(String[] args) {
	        InventoryManagement inventory = new InventoryManagement();

	        inventory.addItem("Pen", 101, 50, 10.0, -1);
	        inventory.addItem("Notebook", 102, 20, 50.0, -1);
	        inventory.addItem("Pencil", 103, 100, 5.0, 0);

	        System.out.println("\nAll Items:");
	        inventory.displayAll();

	        inventory.updateQuantity(102, 30);
	        inventory.removeItem(101);

	        System.out.println("\nAfter Update and Removal:");
	        inventory.displayAll();

	        System.out.println("\nSearch Item 'Pencil':");
	        inventory.searchItem("Pencil");

	        System.out.println("\nTotal Inventory Value:");
	        inventory.calculateTotalValue();

	        System.out.println("\nInventory Sorted by Price:");
	        inventory.sortInventory("price");
	        inventory.displayAll();
	    }
}