package oops2;

import static oops1.Stud.greet;

public class packagesExample {
    public static void main(String[] args) {
        greet();
        message();
    }

    public static void message() {
        System.out.println("This is a message method defined in oops2 package");
    }

}
