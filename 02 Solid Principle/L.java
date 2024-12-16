// // 3. Liskov Substitution Principle (LSP)
// // Definition:A subclasses must extend the functionality of their parent class in a way that logically aligns with the behavior expected from the parent class, ensuring that any method or property defined in the parent class can be overridden or implemented by the subclass without introducing errors or unexpected behavio


// // Bad Example (Violating LSP) :
// // class Bird {
// //     public void fly() {
// //         System.out.println("I can fly.");
// //     }
// // }

// // // Invalid subclass
// // class Penguin extends Bird {
// //     @Override
// //     public void fly() {
// //         throw new UnsupportedOperationException("Penguins can't fly!");
// //     }
// // }

// // // Main class to demonstrate LSP violation
// // public class L {
// //     public static void letBirdsFly(Bird bird) {
// //         bird.fly(); // This will cause an issue if the bird cannot fly
// //     }

// //     public static void main(String[] args) {
// //         Bird myPenguin = new Penguin();
// //         letBirdsFly(myPenguin); // This will throw an exception
       
// //     }
// // }


// // Good Example (Adhering to LSP)

//  class Bird {
//      public void fly() {
//          System.out.println("I can fly.");
//      } 
// }

// class Sparrow extends Bird { 
//     public void fly() {
//         System.out.println("Sparrow can fly.");
//     }
// }


// public class L {
//     public static void letBirdMakeSound(Bird bird) {
//        bird.fly();
//     }

//     public static void main(String[] args) {
//         Bird mySparrow = new Sparrow();
//         letBirdMakeSound(mySparrow); // Outputs: Chirp and I can fly.

//             }
// }