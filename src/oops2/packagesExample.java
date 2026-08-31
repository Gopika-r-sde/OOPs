package oops2;

import static oops1.Stud.greet;

class Fun {
    static String name = "Gops";

    static void hi() {
        System.out.println("Static method");

        // name is not a static variable so that too shows error
        System.out.println(Fun.name);  // error
//        System.out.println(this.name);  // error

        // this / super keywords represents an object, but static methods are not dependent on an object
    }

    void hello() {
        System.out.println("Non-static method" + " " + this.name);
    }
}

public class packagesExample {
    public static void main(String[] args) {
        greet();
        message();

        // when a method is non-static
        Fun fun = new Fun();
        fun.hello();


        // when a method is static
        Fun.hi();
    }

    public static void message() {
        System.out.println("This is a message method defined in oops2 package");
    }

}
