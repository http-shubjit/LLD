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

 interface Shape {
    void draw();
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Square");
    }
}



interface ShapeFactory {
    public Shape createCircleShape();
    
    public Shape createRectangleShape();
    
    public Shape createSquareShape();
}


class createShapeFactory implements ShapeFactory {
    @Override
    public Shape createCircleShape() {
        return new Circle();
    }
    
    @Override
    public Shape createRectangleShape() {
        return new Rectangle();
    }

    @Override
    public Shape createSquareShape() {
        return new Square();
    }
}





public class Factory {
    public static void main(String[] args) {
        createShapeFactory createShape = new createShapeFactory();
        

        Shape shape1 = createShape.createCircleShape();
        shape1.draw();

        Shape shape2 = createShape.createRectangleShape();
        shape2.draw();

        Shape shape3 = createShape.createSquareShape();
        shape3.draw();

        
    }
}
