package oops5.abstractDemo;

public class Son extends Parent {

    public Son(int age) {
//        super(age);
        this.age = age;
    }

    @Override
    void career() {
        System.out.println("I am going to become a Engineer" + " "  + "My age is " + age) ;
    }

    void partner() {
        System.out.println("I love samantha");
    }
}
