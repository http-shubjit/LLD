// 2. Open-Closed Principle (OCP)
// Definition:you can add new functionality without changing existing code.

// Bad Example:This design requires changes to the processPayment method whenever a new payment type is added.

// class PaymentProcessor {
//     public void processPayment(String paymentType) {
//         if (paymentType.equals("CreditCard")) {
//             // Process credit card payment
//             System.out.println("Processing credit card payment.");
//         } else if (paymentType.equals("PayPal")) {
//             // Process PayPal payment
//             System.out.println("Processing PayPal payment.");
//         }
//         // Adding new payment types requires modifying this method.
//     }
// }

// public class O {
//     public static void main(String[] args) {
//         PaymentProcessor processor = new PaymentProcessor();
//         processor.processPayment("CreditCard");
//         processor.processPayment("PayPal");
//     }
// }


// Good Example:In this example, new payment methods can be added by creating new subclasses without changing existing code.


// abstract class Payment {
//     public abstract void process();
// }

// class CreditCardPayment extends Payment {
//     @Override
//     public void process() {
//         System.out.println("Processing credit card payment.");
//     }
// }

// class PayPalPayment extends Payment {
//     @Override
//     public void process() {
//         System.out.println("Processing PayPal payment.");
//     }
// }

// class PaymentProcessor {
//     public void processPayment(Payment payment) {
//         payment.process(); // New payment types can be added without modifying this method.
//     }
// }

// public class O {
//     public static void main(String[] args) {
//         PaymentProcessor processor = new PaymentProcessor();
        
//         Payment creditCard = new CreditCardPayment();
//         processor.processPayment(creditCard);
        
//         Payment payPal = new PayPalPayment();
//         processor.processPayment(payPal);
//     }
// }

