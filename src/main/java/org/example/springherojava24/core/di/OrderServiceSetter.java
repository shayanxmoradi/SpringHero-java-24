package org.example.springherojava24.core.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Setter Injection: Can be used for optional dependencies or in specific cases like resolving circular dependencies (which should ideally be redesigned).
 */
@Service
public class OrderServiceSetter {
    private  PaymentService paymentService;
@Autowired
    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    // tells spring to use constructor for Di
    public OrderServiceSetter(PaymentService paymentService) {
        System.out.println("OrderService setter Called - Injecting PaymentService!");

    }

    public void placeOrder(String orderId,double amount) {
        System.out.println("Placing order: " + orderId);
        String paymentResult = paymentService.processPayment(amount);
        System.out.println("Order " + orderId + " status: " + paymentResult);

    }

}
