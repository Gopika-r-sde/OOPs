package oops2;

class Animal {
    String name;
    static int legs = 4;

//    Animal() {
//        this.name = "Lion";
//        Animal.legs += 1;
//    }
//
//    Animal(String name) {
//        this.name = name;
//        Animal.legs = 4;
//    }


    /* say() doesn't depend on an object / instance, so it doesn't allow non-static methods or variables */
    static void say() {
        System.out.println("Static method");
//        tell();     // we cannot use tell() here, since tell() is a non-static method
    }


    // method or variable which is not a static, then it requires or belongs to an object / instance
    void tell() {
        System.out.println("I am telling");
    }
}
public class staticVariable {
    public static void main(String[] args) {
//        Animal animal = new Animal("Tiger");
//        System.out.println(animal.name);
//        System.out.println(animal.legs);
//
//        Animal animal2 = new Animal("Giraffe");
//        System.out.println(animal2.name);
//        System.out.println(animal2.legs);


        // static variables can be accessed even before creation of objects,
        // means static variables or methods are independent of objects

        System.out.println(Animal.legs);

        Animal.say();  // static methods can be accessed using className

        Animal ob = new Animal();
        ob.tell();  // non-static methods are accessed via objects



        /* We cannot access non-static stuff without referencing their instances in a static context */
    }
}
