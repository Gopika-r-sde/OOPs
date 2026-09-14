package oops6.objectCloning;

import oops6.exceptionHandling.MyException;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
//        Human h1 = new Human("Gopika", 20);
////        Human h2 = new Human(h1);
////
////        System.out.println(h2.age);
////        System.out.println(h1.name);

        // object cloning

        Human h3 = new Human("Gops", 24);
        Human h4 = (Human) h3.clone();
        System.out.println(h4.age);
        System.out.println(h3.name);

        System.out.println(Arrays.toString(h4.arr));


        // shallow copy & deep copy

        h4.arr[0] = 4;

        System.out.println("h4 array" + " " + Arrays.toString(h4.arr));
        System.out.println("h3 array" + " " + Arrays.toString(h3.arr));

        h4.age = 35;
        System.out.println( "h4" + " " + h4.age);
        System.out.println( "h3" + " " + h3.age);


        // deep copy -> changes made in one object does not affect the other object
        // shallow copy -> changes made in one object affects the other object
    }
}
