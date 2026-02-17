package structural.facade;

public class InventoryService {
    public boolean checkStock(String productId) {
        System.out.println("Checking stock for " + productId + "...");
        return true; // Pretend it's always in stock
    }
}