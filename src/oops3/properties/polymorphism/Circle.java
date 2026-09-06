package oops3.properties.polymorphism;


public class Circle extends Shapes{

    // The method area() will run, when the Circle class's object is created.
    // Hence it is overriding the parent class


    @Override  // this is called annotation, that helps to find whether the method is overridden or not
    void area() {
        System.out.println("Area of circle is pie * r * r");
    }

     // shows error
//    void say() {
//
//    }

    static  void greet() {
        System.out.println("Hey, I am in Circle Class static method");
    }

}
