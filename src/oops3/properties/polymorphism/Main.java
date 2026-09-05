package oops3.properties.polymorphism;

public class Main {
    static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        shape.area();
        circle.area();
        triangle.area();
    }
}
