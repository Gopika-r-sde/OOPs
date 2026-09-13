package oops6.objectCloning;

import oops6.exceptionHandling.MyException;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human h1 = new Human("Gopika", 20);
        Human h2 = new Human(h1);

        System.out.println(h2.age);
        System.out.println(h1.name);

        // object cloning

        Human h3 = new Human("Gops", 24);
        Human h4 = (Human) h3.clone();
        System.out.println(h4.age);
        System.out.println(h3.name);
    }
}
