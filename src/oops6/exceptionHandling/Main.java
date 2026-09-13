package oops6.exceptionHandling;

public class Main {
    static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
            divide(a, b);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            // finally block helps to close the opened file!!!
            System.out.println("Code Executed Successfully");
        }
    }

    static int divide(int a, int b) throws ArithmeticException{
        if(b == 0) {
            throw new ArithmeticException("Divide by zero");
        }
        return a / b;
    }
}
