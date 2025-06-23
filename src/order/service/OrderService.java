package order.service;

import order.model.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderService {

    private final List<Order> orders = new ArrayList<>();
    public void addOrder(Order order){
        //todo
    }
    public List<Order> getAllOrders() {
        return null; //TODO
    }

    public int getSize() {
        return orders.size();
    }

    public Order getOrderByName(String name) {
        return null;
    }
}
