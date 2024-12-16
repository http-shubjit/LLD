
// 1. Single Responsibility Principle (SRP)
// Definition: A class should have only one reason to change, meaning it should only have one job or responsibility.

// Bad Example: In this example, UserService has multiple responsibilities: managing users and sending notifications.


// class UserService {
//     public void createUser(String username) {
//         // Logic to create user
//         System.out.println("User " + username + " created.");
//     }

//     public void deleteUser(String userId) {
//         // Logic to delete user
//         System.out.println("User " + userId + " deleted.");
//     }

//     public void notifyUser(String userId, String message) {
//         // Logic to send notification
//         System.out.println("Notification sent to " + userId + ": " + message);
//     }
// }

// public class S {
//     public static void main(String[] args) {
//         UserService userService = new UserService();
//         userService.createUser("Alice");
//         userService.notifyUser("1", "Welcome!");
//     }
// }



// Good Example:Here, responsibilities are separated into UserService for user management and NotificationService for notifications.


// class UserService {
//     public void createUser(String username) {
//         // Logic to create user
//         System.out.println("User " + username + " created.");
//     }

//     public void deleteUser(String userId) {
//         // Logic to delete user
//         System.out.println("User " + userId + " deleted.");
//     }
// }

// class NotificationService {
//     public void notifyUser(String userId, String message) {
//         // Logic to send notification
//         System.out.println("Notification sent to " + userId + ": " + message);
//     }
// }

// public class S {
//     public static void main(String[] args) {
//         UserService userService = new UserService();
//         NotificationService notificationService = new NotificationService();

//         userService.createUser("Alice");
//         notificationService.notifyUser("1", "Welcome!");
//     }
// }