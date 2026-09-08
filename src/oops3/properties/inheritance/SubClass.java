package oops3.properties.inheritance;

import oops4.access.A;

public class SubClass extends A {
    static void main(String[] args) {

//        A a = new SubClass();  // wrong
//        System.out.println(a.name);  // error

        // because SubClass or SubClass of different package can only access the protected member of the SuperClass


        SubClass s = new SubClass();
        System.out.println(s.name);

    }
}
