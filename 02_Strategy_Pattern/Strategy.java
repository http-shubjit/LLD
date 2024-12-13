// Without Strategy Pattern :

// class ShoppingCart {

//     public void checkout(int amount, String paymentMethod) {

//this is not a professional behaviour

//         if (paymentMethod.equalsIgnoreCase("CreditCard")) {
//             payWithCreditCard(amount);
//         } else if (paymentMethod.equalsIgnoreCase("PayPal")) {
//             payWithPayPal(amount);
//         } else {
//             System.out.println("Invalid payment method.");
//         }
//     }

//     private void payWithCreditCard(int amount) {
//         System.out.println("Paid " + amount + " using Credit Card.");
//     }

//     private void payWithPayPal(int amount) {
//         System.out.println("Paid " + amount + " using PayPal.");
//     }
// }

// //clientside code
// public class Strategy {
//     public static void main(String[] args) {
//         ShoppingCart cart = new ShoppingCart();

//         // Pay using Credit Card
//         cart.checkout(100, "CreditCard");

//         // Pay using PayPal
//         cart.checkout(200, "PayPal");

//         // Invalid payment method
//         cart.checkout(150, "Bitcoin");
//     }
// }

// Solution Using Strategy Pattern

//  interface PaymentStrategy {
//     void pay(int amount);
// }

//  class CreditCardPayment implements PaymentStrategy {
//     @Override
//     public void pay(int amount) {
//         System.out.println("Paid " + amount + " using Credit Card.");
//     }
// }

//  class PayPalPayment implements PaymentStrategy {
//     @Override
//     public void pay(int amount) {
//         System.out.println("Paid " + amount + " using PayPal.");
//     }
// }

// class ShoppingCart {
//     private PaymentStrategy paymentStrategy;

//     public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
//         this.paymentStrategy = paymentStrategy;
//     }

//     public void checkout(int amount) {
//         paymentStrategy.pay(amount);
//     }
// }

// public class Strategy {

//      public static void main(String[] args) {
//          ShoppingCart sc = new ShoppingCart();

//          sc.setPaymentStrategy(new CreditCardPayment());
//          sc.checkout(100);
//          sc.setPaymentStrategy(new PayPalPayment());
//          sc.checkout(200);
//      }
// }


//its more professionally