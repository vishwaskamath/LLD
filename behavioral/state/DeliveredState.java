package behavioral.state;

public class DeliveredState implements OrderState {
    @Override
    public void pay(Order order) {
        System.out.println("Error: Order is finished.");
    }

    @Override
    public void ship(Order order) {
        System.out.println("Error: Order is finished.");
    }

    @Override
    public void deliver(Order order) {
        System.out.println("Error: Order is already delivered.");
    }
}