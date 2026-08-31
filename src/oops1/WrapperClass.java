package oops1;

public class WrapperClass {
    public static void main(String[] args) {

        // Objects
        Integer a = new Integer(1);  // Stores in heap memory as object
        Integer b = 25;
        swap(a, b);
        System.out.println("Before swap " + a + " " + b);
        System.out.println("After swap " + a + " " + b);


        int x = 45;  // Stores in stack memory as a variable
        int y = 50;
        swap(x, y);
        System.out.println("Before swap " + x + " " + y);
        System.out.println("After swap " + x + " " + y);
    }
    // Primitives allow pass by value not pass by reference
    static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
    }

    // Non-Primitives allow pass by reference
    static void swap(Integer a, Integer b) {  // Integer class is "final" class, so no swap
        int temp = a;
        a = b;
        b = temp;
    }
}
