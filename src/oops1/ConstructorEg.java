package oops1;

class  Human {
    String name;
    int age;
    String gender;

    // By Default constructor
    Human() {
        this.name = "Human";
        this.age = 18;
        this.gender = "Male";
    }

    // Parameterized constructor
    Human(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    void greeting(){
        System.out.println("Hello " + this.name);  // this -> represents an object
    }

}
public class ConstructorEg {
    public static void main(String[] args) {
//        Human h = new Human();
//        System.out.println(h.name);
//        System.out.println(h.age);
//        System.out.println(h.gender);
//
//        Human h2 = new Human("Deepa", 18, "Female");
//        System.out.println(h2.name);
//        System.out.println(h2.age);
//        System.out.println(h2.gender);
//        h2.greeting();

        Human h3 = new Human("Gopika", 20, "Male");
        h3.greeting();

        // new -> allocates memory
        Human h4 = h3;  // h4 points to the object that is pointing by h3
        h4.greeting();

        // the value changes in reference variable h3 will also affect the reference variable h4
    }
}
