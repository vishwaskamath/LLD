package behavioral.state;

public class ShippedState implements OrderState {
    @Override
    public void pay(Order order) {
        System.out.println("Error: Already paid and shipped.");
    }

    @Override
    public void ship(Order order) {
        System.out.println("Error: Already shipped.");
    }

    @Override
    public void deliver(Order order) {
        System.out.println("Order delivered to customer!");
        order.setState(new DeliveredState());
    }
}