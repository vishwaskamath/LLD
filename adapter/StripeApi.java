package adapter;

// Pretend this class comes from a .jar file. YOU CANNOT CHANGE THIS CODE.
public class StripeApi {

    public void makePayment(int amountInCents) {
        System.out.println("Calling Stripe API...");
        System.out.println("Stripe charged: " + amountInCents + " cents");
    }
}