package order.service;

import order.model.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderService {

    private final List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        if (order != null) {
            orders.add(order);
        }
    }

    public List<Order> getAllOrders() {
        return new ArrayList<>(orders);
    }

    public int getSize() {
        return orders.size();
    }

    public Order getOrderByName(String name) {
        return orders.stream()
                .filter(order -> order.getDish().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }
}
