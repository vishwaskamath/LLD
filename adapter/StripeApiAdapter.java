package adapter;

public class StripeApiAdapter implements PaymentProcessor {

    // 1. Composition: The Adapter "HAS-A" StripeApi
    private final StripeApi stripeApi;

    public StripeApiAdapter(StripeApi stripeApi) {
        this.stripeApi = stripeApi;
    }

    // 2. Implementation: We satisfy the App's contract
    @Override
    public void pay(double dollars) {
        // 3. Translation Logic
        // Convert input (Dollars -> Cents)
        int cents = (int) (dollars * 100);

        // 4. Delegation
        // Call the incompatible method
        stripeApi.makePayment(cents);
    }
}