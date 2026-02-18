package behavioral.state;

public class Order {
    // 1. Holds the current state
    private OrderState currentState;

    public Order() {
        // Initial State
        this.currentState = new NewState();
    }

    // 2. Allows states to update the context
    public void setState(OrderState state) {
        this.currentState = state;
    }

    // 3. Delegation
    public void pay() {
        currentState.pay(this);
    }

    public void ship() {
        currentState.ship(this);
    }

    public void deliver() {
        currentState.deliver(this);
    }
}