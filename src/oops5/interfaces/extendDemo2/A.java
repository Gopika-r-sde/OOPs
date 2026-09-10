package oops5.interfaces.extendDemo2;

public interface A {
//    default void fun() {
//        System.out.println("In A class");
//    }

    void fun();
    static void staticFun() {
        System.out.println("In A staticFun");
    }
}
