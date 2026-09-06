package oops3.properties.polymorphism;

public class Main {
    static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Shapes triangle = new Triangle();  // it prints the method defined in the triangle class
//        shape.area();
//        circle.area();
        triangle.area();


        Shapes s = new Shapes();
        Shapes t = new Circle();

        Shapes.greet();

//        s.greet();  // output of shapes class
//        t.greet();  // output of shapes class
    }
}
