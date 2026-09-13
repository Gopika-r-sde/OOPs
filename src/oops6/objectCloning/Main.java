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


        // shallow copy

        h4.arr[0] = 4;

        System.out.println(Arrays.toString(h4.arr) + "h4 array");
        System.out.println(Arrays.toString(h3.arr) + "h3 array");

        h4.age = 35;
        System.out.println( "h4" + " " + h4.age);
        System.out.println( "h3" + " " + h3.age);


    }
}
