package org.example.springherojava24.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Constructor Injection: Generally preferred for mandatory dependencies. It makes your components more robust, easier to test, and allows for final fields.
 */
@Service
public class OrderService {
    private final PaymentService paymentService;

    @Autowired // tells spring to use constructor for Di
    public OrderService(PaymentService paymentService) {
        System.out.println("OrderService Constructor Called - Injecting PaymentService!");

        this.paymentService = paymentService;
    }

    public void placeOrder(String orderId,double amount) {
        System.out.println("Placing order: " + orderId);
        String paymentResult = paymentService.processPayment(amount);
        System.out.println("Order " + orderId + " status: " + paymentResult);

    }

}
