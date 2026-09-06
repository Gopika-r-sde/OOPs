package oops3.properties.polymorphism;

public class Shapes {
    void area () {
        System.out.println("I am in shapes");
    }

    // "final" - methods declared as final cannot be overridden
            // - classes declared as final cannot be inherited

    final void say() {
        System.out.println("Hey, It is Final method in Shapes Class.");
    }

}
