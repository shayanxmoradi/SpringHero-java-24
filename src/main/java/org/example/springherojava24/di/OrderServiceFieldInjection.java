package org.example.springherojava24.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Field Injection: Offers conciseness but comes with testability and design drawbacks. Use with caution, understanding the trade-offs.
 * If you use it, be sure to leverage Spring's testing utilities when writing unit tests.
 */
@Service
public class OrderServiceFieldInjection {
    @Autowired
    private final PaymentService paymentService;

     // tells spring to use constructor for Di
    public OrderServiceFieldInjection(PaymentService paymentService) {
        System.out.println("OrderService field injection Called - Injecting PaymentService!");

        this.paymentService = paymentService;
    }

    public void placeOrder(String orderId,double amount) {
        System.out.println("Placing order: " + orderId);
        String paymentResult = paymentService.processPayment(amount);
        System.out.println("Order " + orderId + " status: " + paymentResult);

    }

}
