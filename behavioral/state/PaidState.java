package behavioral.state;

public class PaidState implements OrderState {
    @Override
    public void pay(Order order) {
        System.out.println("Error: Order is already paid.");
    }

    @Override
    public void ship(Order order) {
        System.out.println("Order shipped!");
        order.setState(new ShippedState());
    }

    @Override
    public void deliver(Order order) {
        System.out.println("Error: Can't deliver. It is just being shipped.");
    }
}