public class Order {
    private String orderId;
    private String deliveryTime;
    private String partnerId;

    public Order() {
    }

    public Order(String orderId, String deliveryTime) {
        this.orderId = orderId;
        this.deliveryTime = deliveryTime;
        this.partnerId = null;
    }

    // Getters and setters
}
