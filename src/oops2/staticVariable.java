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
    }
}
