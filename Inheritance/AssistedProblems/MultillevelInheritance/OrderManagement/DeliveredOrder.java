package MultillevelInheritance.OrderManagement;

public class DeliveredOrder extends ShippedOrder{
	 String deliveryDate;

	    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
	        super(orderId, orderDate, trackingNumber);
	        this.deliveryDate = deliveryDate;
	    }

	    @Override
	    public String getOrderStatus() {
	        return "Order delivered on " + deliveryDate;
	    }

}
