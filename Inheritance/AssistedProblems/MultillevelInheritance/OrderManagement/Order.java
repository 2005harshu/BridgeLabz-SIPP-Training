package MultillevelInheritance.OrderManagement;

public class Order {
	String orderId;
    String orderDate;

    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Order placed.";
    }

}
