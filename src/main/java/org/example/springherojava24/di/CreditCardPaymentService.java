package org.example.springherojava24.di;

import org.springframework.stereotype.Service;

@Service("CreditCArdPayment")
public class CreditCardPaymentService implements PaymentService{
    public CreditCardPaymentService() {
        System.out.printf("creditpaymentserice bean created\n");
    }

    @Override
    public String processPayment(double amount) {
        return "Credit card payment of $" + String.format("%.2f", amount) + " processed successfully.";
    }
}
