package oops2;


public class StaticBlock {
    static int a = 5;
    static int b;

    // static helps to store the default  value for the variable or initialize the variables
    // static block executes once when class is first loaded

    static {
        System.out.println("It is static block, where static initialization occurs");
        b = a * 10;
    }
    static void main(String[] args) {
//        StaticBlock ob = new StaticBlock();
        System.out.println(" a " + " " + StaticBlock.a + " b " + " " + StaticBlock.b);

        b *= 2;
        System.out.println(" a " + " " + StaticBlock.a + " b " + " " + StaticBlock.b);

    }

}
