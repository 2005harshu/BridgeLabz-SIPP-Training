package MultillevelInheritance.OrderManagement;

public class Main {
	public static void main(String[] args) {
        Order o1 = new Order("ORD101", "2025-06-28");
        ShippedOrder o2 = new ShippedOrder("ORD102", "2025-06-27", "TRK999888");
        DeliveredOrder o3 = new DeliveredOrder("ORD103", "2025-06-25", "TRK123456", "2025-06-28");

        System.out.println(o1.getOrderStatus());
        System.out.println(o2.getOrderStatus());
        System.out.println(o3.getOrderStatus());
    }

}
