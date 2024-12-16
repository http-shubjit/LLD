// 5. Dependency Inversion Principle (DIP)
// Definition: High-level modules should not depend on low-level modules; both should depend on abstractions.



// Good Example (Adhering to DIP)

// interface Notifier {
//     void sendNotification(String message);
// }

// // Low-level module for Email notifications
// class EmailNotifier implements Notifier {
//     @Override
//     public void sendNotification(String message) {
//         System.out.println("Sending Email: " + message);
//     }
// }

// // Low-level module for SMS notifications
// class SmsNotifier implements Notifier {
//     @Override
//     public void sendNotification(String message) {
//         System.out.println("Sending SMS: " + message);
//     }
// }

// // High-level module that depends on the abstraction
// class NotificationService {
//     private final Notifier notifier;

//     // Constructor injection for dependency inversion
//     public NotificationService(Notifier notifier) {
//         this.notifier = notifier;
//     }

//     public void notifyUser(String message) {
//         notifier.sendNotification(message); // Delegates notification sending to the notifier
//     }
// }

// // Main class to demonstrate DIP adherence
// public class D {
//     public static void main(String[] args) {
//         Notifier emailNotifier = new EmailNotifier();
//         NotificationService emailService = new NotificationService(emailNotifier);
//         emailService.notifyUser("Hello via Email!"); // Outputs: Sending Email: Hello via Email!

//         Notifier smsNotifier = new SmsNotifier();
//         NotificationService smsService = new NotificationService(smsNotifier);
//         smsService.notifyUser("Hello via SMS!"); // Outputs: Sending SMS: Hello via SMS!
//     }
// }


// Bad Example (Violating DIP)


// Low-level module for Email notifications
// class EmailNotifier {
//     public void sendEmail(String message) {
//         System.out.println("Sending Email: " + message);
//     }
// }

// // Low-level module for SMS notifications
// class SmsNotifier {
//     public void sendSms(String message) {
//         System.out.println("Sending SMS: " + message);
//     }
// }

// // High-level module that directly depends on low-level modules
// class NotificationService {
//     private final EmailNotifier emailNotifier;
//     private final SmsNotifier smsNotifier;

//     public NotificationService() {
//         this.emailNotifier = new EmailNotifier();
//         this.smsNotifier = new SmsNotifier();
//     }

//     public void notifyUserByEmail(String message) {
//         emailNotifier.sendEmail(message); // Directly depends on EmailNotifier
//     }

//     public void notifyUserBySms(String message) {
//         smsNotifier.sendSms(message); // Directly depends on SmsNotifier
//     }
// }

// // Main class to demonstrate DIP violation
// public class D {
//     public static void main(String[] args) {
//         NotificationService notificationService = new NotificationService();
//         notificationService.notifyUserByEmail("Hello via Email!"); // Outputs: Sending Email: Hello via Email!
//         notificationService.notifyUserBySms("Hello via SMS!"); // Outputs: Sending SMS: Hello via SMS!
//     }
// }
