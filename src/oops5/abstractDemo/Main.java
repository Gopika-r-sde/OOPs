package oops5.abstractDemo;

public class Main {
    static void main(String[] args) {
        Son son = new Son(23);
        son.career();
        son.normal();

        Daughter daughter = new Daughter(20);
        daughter.career();
        daughter.normal();

        Parent son2 = new Son(23);   // Runtime polymorphism -> Reference variable is of type SuperClass and Object is of type SubClass
        son2.career();

//        Parent dad = new Parent(50); // Object cannot be created for abstract classes.
        Parent.hello();   // static method

    }
}
