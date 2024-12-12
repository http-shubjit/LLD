// // 4. Interface Segregation Principle (ISP)
// // Definition: Clients should not be forced to depend on interfaces they do not use. It’s better to have many small interfaces than a large one.



// // Bad Example (Violating ISP)

// // interface Animal {
// //     void fly();

// //     void eat();
// // }

// // // Class for a Bird that can fly and eat
// // class Eagle implements Animal {
// //     @Override
// //     public void fly() {
// //         System.out.println("Eagle is flying.");
// //     }

// //     @Override
// //     public void eat() {
// //         System.out.println("Eagle is eating.");
// //     }
// // }

// // // Invalid class for a Fish that cannot fly but must implement the full
// // // interface
// // class Shark implements Animal {
// //     @Override
// //     public void fly() {
// //         throw new UnsupportedOperationException("Sharks can't fly!");
// //     }

// //     @Override
// //     public void eat() {
// //         System.out.println("Shark is eating.");
// //     }
// // }

// // // Main class to demonstrate ISP violation
// // public class I {
// //     public static void main(String[] args) {
// //         Animal eagle = new Eagle();
// //         eagle.fly(); // Outputs: Eagle is flying.
// //         eagle.eat(); // Outputs: Eagle is eating.

// //         Animal shark = new Shark();

// //         try {
// //             shark.fly(); // This will throw an exception
// //         } catch (UnsupportedOperationException e) {
// //             System.out.println(e.getMessage()); // Outputs: Sharks can't fly!
// //         }

// //         shark.eat(); // Outputs: Shark is eating.
// //     }
// // }


// // Good Example (Adhering to ISP)

// interface Flyable {
//     void fly();
// }
// interface Eatable {
//     void eat();
// }

// class Sparrow implements Flyable, Eatable {
//     @Override
//     public void fly() {
//         System.out.println("Sparrow is flying.");
//     }

//     @Override
//     public void eat() {
//         System.out.println("Sparrow is eating.");
//     }
// }

// // Class for a Fish that can eat but cannot fly
// class Goldfish implements Eatable {
//     @Override
//     public void eat() {
//         System.out.println("Goldfish is eating.");
//     }
// }

// // Main class to demonstrate ISP adherence
// public class I {
//     public static void main(String[] args) {
//         Sparrow sparrow = new Sparrow();
//         sparrow.fly(); // Outputs: Sparrow is flying.
//         sparrow.eat(); // Outputs: Sparrow is eating.

//         Goldfish goldfish = new Goldfish();
//         goldfish.eat(); // Outputs: Goldfish is eating.
//     }
// }
