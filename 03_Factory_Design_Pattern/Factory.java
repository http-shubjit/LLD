// Without Factory Design Pattern

// interface Shape {
//     public void draw();
// }

// class Circle implements Shape {
//     public void draw() {
//         System.out.println("Drawing a Circle");
//     }
// }

// class Rectangle implements Shape {
//     public void draw() {
//         System.out.println("Drawing a Rectangle");
//     }
// }

// class Square implements Shape {
//     public void draw() {
//         System.out.println("Drawing a Square");
//     }
// }
// public class Factory {
//     public static void main(String[] args) {
//         Shape circle = new Circle();
//         Shape rectangle = new Rectangle();
//         Shape square = new Square();

//         circle.draw();
//         rectangle.draw();
//         square.draw();
//     }
// }


// With Factory Design Pattern

//  interface Shape {
//     void draw();
// }

// class Circle implements Shape {
//     @Override
//     public void draw() {
//         System.out.println("Drawing a Circle");
//     }
// }

// class Rectangle implements Shape {
//     @Override
//     public void draw() {
//         System.out.println("Drawing a Rectangle");
//     }
// }

// class Square implements Shape {
//     @Override
//     public void draw() {
//         System.out.println("Drawing a Square");
//     }
// }



// interface ShapeFactory {
//     public Shape createShape();
// }


// class CircleFactory implements ShapeFactory {
//     @Override
//     public Shape createShape() {
//         return new Circle();
//     }
// }

// // Factory class for Rectangle
// class RectangleFactory implements ShapeFactory {
//     @Override
//     public Shape createShape() {
//         return new Rectangle();
//     }
// }

// // Factory class for Square
// class SquareFactory implements ShapeFactory {
//     @Override
//     public Shape createShape() {
//         return new Square();
//     }
// }



// public class Factory {
//     public static void main(String[] args) {
//         ShapeFactory circleFactory = new CircleFactory();
//         ShapeFactory rectangleFactory = new RectangleFactory();
//         ShapeFactory squareFactory = new SquareFactory();

//         Shape shape1 = circleFactory.createShape();
//         shape1.draw();

//         Shape shape2 = rectangleFactory.createShape();
//         shape2.draw();

//         Shape shape3 = squareFactory.createShape();
//         shape3.draw();

        
//     }
// }
