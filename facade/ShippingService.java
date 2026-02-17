package facade;

public class ShippingService {
    public void shipProduct(String productId) {
        System.out.println("Generating shipping label for " + productId + "...");
    }
}