import org.springframework.stereotype.Repository;
import java.util.HashMap;
import java.util.Map;

@Repository
public class OrderRepository {
    private Map<String, Order> orders = new HashMap<>();
    private Map<String, DeliveryPartner> partners = new HashMap<>();

    public void addOrder(Order order) {
        orders.put(order.getOrderId(), order);
    }

    public void addPartner(DeliveryPartner partner) {
        partners.put(partner.getPartnerId(), partner);
    }

    public void assignOrderToPartner(String orderId, String partnerId) {
        Order order = orders.get(orderId);
        if (order != null) {
            order.setPartnerId(partnerId);
        }
    }

    public Order getOrderById(String orderId) {
        return orders.get(orderId);
    }

    public DeliveryPartner getPartnerById(String partnerId) {
        return partners.get(partnerId);
    }

    public int getOrderCountByPartnerId(String partnerId) {
        int count = 0;
        for (Order order : orders.values()) {
            if (order.getPartnerId() != null && order.getPartnerId().equals(partnerId)) {
                count++;
            }
        }
        return count;
    }

    // Implement other methods as needed
}
