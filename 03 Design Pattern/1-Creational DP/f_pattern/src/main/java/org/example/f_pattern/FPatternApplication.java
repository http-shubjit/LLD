package org.example.f_pattern;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class FPatternApplication implements CommandLineRunner {
	@Autowired
	PaymentProviderFactory paymentProviderFactory;

	public static void main(String[] args) {
		SpringApplication.run(FPatternApplication.class, args);

	}
	@Override
	public void run(String... args) throws Exception {
		log.info("Hello spring boot");
		PaymentProvider p1=paymentProviderFactory.getPaymentProvider("payPalPaymentProvider");
p1.acceptPayment();
	}

}
