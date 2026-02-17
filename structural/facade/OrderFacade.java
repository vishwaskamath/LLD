package structural.facade;

public class OrderFacade {
    // 1. Has-A relationships with all the complex parts
    private final InventoryService inventory;
    private final PaymentService payment;
    private final ShippingService shipping;

    // Constructor Injection (Standard SDE-2 practice)
    public OrderFacade() {
        this.inventory = new InventoryService();
        this.payment = new PaymentService();
        this.shipping = new ShippingService();
    }

    // 2. The "One Button" Method
    // This orchestrates the complex logic
    public void placeOrder(String productId, double amount) {
        System.out.println("--- Order Processing Started ---");

        if (inventory.checkStock(productId)) {
            payment.deduct("User123", amount);
            shipping.shipProduct(productId);
            System.out.println("--- Order Completed Successfully ---");
        } else {
            System.out.println("Order Failed: Out of Stock");
        }
    }
}