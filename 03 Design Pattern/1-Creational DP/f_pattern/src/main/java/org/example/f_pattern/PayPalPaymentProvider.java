package org.example.f_pattern;

import org.springframework.stereotype.Service;

@Service
public class PayPalPaymentProvider implements PaymentProvider {
    @Override
    public void acceptPayment() {
        System.out.println("PayPalPaymentProvider");
    }
}
