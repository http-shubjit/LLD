package org.example.f_pattern;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class StripePaymentProvider implements   PaymentProvider{
    @Override
    public void acceptPayment() {
        System.out.println("StripePaymentProvider");
    }
}
