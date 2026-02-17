package structural.facade;

public class PaymentService {
    public void deduct(String account, double amount) {
        System.out.println("Charging account " + account + " for $" + amount);
    }
}