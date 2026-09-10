package oops5.abstractDemo;

public class Daughter extends Parent {

//    public Daughter(int age) {
////        super(age);
//        this.age = age;
//    }

    public Daughter(int a) {
        super(a);
    }

    @Override
    void career() {
        System.out.println("I am going to become a stylist" + " " +  "My age is " + age) ;
    }

    @Override
    void partner() {
        System.out.println("I love vijay");
    }
}
