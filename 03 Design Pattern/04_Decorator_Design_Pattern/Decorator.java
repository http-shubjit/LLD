 interface Shape {
    void draw();
}

 class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}

 class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}


 abstract class ShapeDecorator implements Shape {
    protected Shape Shapeinstance;

    public ShapeDecorator(Shape shapeObject) {
        this.Shapeinstance = shapeObject;
    }

    @Override
    public void draw() {
        Shapeinstance.draw();
    }
}


 class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape shapeObject) {
        super(shapeObject);
    }

    @Override
    public void draw() {
        Shapeinstance.draw();
        setRedBorder(Shapeinstance);
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Border Color: Red");
    }
}

public class Decorator {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border:");
        circle.draw();

        System.out.println("\nCircle of red border:");
        redCircle.draw();

        System.out.println("\nRectangle of red border:");
        redRectangle.draw();
    }
}
