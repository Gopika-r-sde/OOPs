package oops5.abstractDemo;

public abstract class Parent {

    int age;

//    public Parent(int age) {
//        this.age = age;
//    }

//    abstract Parent();  // cannot create abstract constructor

//    abstract static void hi(); // cannot create abstract static

    static void hello() {
        System.out.println("this is static method");
    }

    void normal() {
        System.out.println("this is normal method");
    }

    abstract void career();
    abstract void partner();
}
