package org.example.f_pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Map;

@Component
public class PaymentProviderFactory {
    @Autowired
    private  Map<String, PaymentProvider> providers;

    public PaymentProvider getPaymentProvider(String providerType) {
        return providers.get(providerType);
    }
}
