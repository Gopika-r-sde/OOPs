package oops5.abstractDemo;

public class Main {
    static void main(String[] args) {
        Son son = new Son(23);
        son.career();

        Daughter daughter = new Daughter(20);
        daughter.career();

//        Parent dad = new Parent(50); // Object cannot be created for abstract classes.
    }
}
