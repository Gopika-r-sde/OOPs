package oops1;

class Purse {
    String brandName;
    double price;
}

public class finalKeyword {
    public static void main(String[] args) {

        // Primitives are immutable when it is final
        final int BONUS = 5;
        System.out.println("Bonus is " + BONUS);

        // Non-Primitives values are mutable, but reference variables are immutable
        final Purse p = new Purse();
        p.brandName = "Zudio";
        p.price = 400;
        System.out.println(p.brandName + " " + p.price);

//        p = new Purse();    // not possible, since reference variable is final

        // but we can modify the values of the reference variable
        p.brandName = "Adidas";
        p.price = 300;
        System.out.println(p.brandName + " " + p.price);
    }
}
