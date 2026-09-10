package oops5.interfaces.extendDemo2;

public class Main implements B {
    public static void main(String[] args) {
        Main m = new Main();
        m.greet();
        m.fun();
    }

    @Override
    public void greet() {
        System.out.println("greet");
    }

//    @Override
//    public void fun() {
//        System.out.println("fun");
//    }
}
