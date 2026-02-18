package behavioral.state;

public interface OrderState {
    void pay(Order order);
    void ship(Order order);
    void deliver(Order order);
}
