package org.example.springherojava24.core.di;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Field Injection: Offers conciseness but comes with testability and design drawbacks. Use with caution, understanding the trade-offs.
 * If you use it, be sure to leverage Spring's testing utilities when writing unit tests.
 */
@Service
public class OrderServiceFieldInjection {
//    @Autowired
    @Value("Default Resource Name")
    private String resourceName;
    @Autowired
    private final PaymentService paymentService;


    @PostConstruct
    public void initialize() {
        System.out.println("LifecycleDemoBean (" + getScopeIdentifier() + "): @PostConstruct - Bean initialized. ResourceName: " + resourceName + " (should be set now)");
        // Simulate resource allocation
        System.out.println("LifecycleDemoBean (" + getScopeIdentifier() + "): Simulating resource allocation for " + resourceName);
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("LifecycleDemoBean (" + getScopeIdentifier() + "): @PreDestroy - Bean being destroyed. Cleaning up " + resourceName);
        // Simulate resource release
        System.out.println("LifecycleDemoBean (" + getScopeIdentifier() + "): Simulating resource release for " + resourceName);
    }

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
    private String getScopeIdentifier() {
        return this.toString().substring(this.toString().lastIndexOf('.') + 1);
    }

}
