package behavioral.state;

public class NewState implements OrderState {
    @Override
    public void pay(Order order) {
        System.out.println("Payment successful.");
        // Transition to the next state
        order.setState(new PaidState());
    }

    @Override
    public void ship(Order order) {
        System.out.println("Error: Can't ship. Please pay first.");
    }

    @Override
    public void deliver(Order order) {
        System.out.println("Error: Can't deliver. It hasn't been shipped yet.");
    }
}