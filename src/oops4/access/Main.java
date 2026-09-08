package oops4.access;

public class Main {

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.arr);
        System.out.println(a.name);
        System.out.println(a.digit);

//        System.out.println(a.num); // error bcz num is private, can get num only through setters and getters
        a.setNum(5);
        System.out.println(a.getNum());
    }
}
