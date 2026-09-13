package oops6.exceptionHandling;

public class Main {
    static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
//            divide(a, b);
//            throw new Exception();   // mimicking

            throw new MyException("This is my own exception");
        }

        // catch blocks must be in the order like which is the most prioritized exception that should be defined first
        catch (MyException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Common Exception");
        } finally {
            // finally block helps to close the opened file!!!
            System.out.println("Code Executed Successfully");
        }
    }

//    static int divide(int a, int b) throws ArithmeticException{
//        if(b == 0) {
//            throw new ArithmeticException("Divide by zero");
//        }
//        return a / b;
//    }
}
