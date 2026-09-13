package oops6.exceptionHandling;

public class Main {
    static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
            int c = a / b;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            // finally block helps to close the opened file!!!
            System.out.println("Code Executed Successfully");
        }
    }
}
