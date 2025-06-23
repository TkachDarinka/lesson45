package order.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Order {
    private String dish;
    private double price;
    private LocalDateTime time;

    public String getDish() {
        return dish;
    }

    public void setDish(String dish) {
        this.dish = dish;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Double.compare(price, order.price) == 0 && Objects.equals(dish, order.dish) && Objects.equals(time, order.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dish, price, time);
    }

    @Override
    public String toString() {
        return "Order{" +
                "dish='" + dish + '\'' +
                ", price=" + price +
                ", time=" + time +
                '}';
    }
}
