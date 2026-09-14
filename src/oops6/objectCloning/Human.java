package oops6.objectCloning;

public class Human implements Cloneable {
    String name;
    int age;
    int[] arr;
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        this.arr = new int[]{1, 2, 3, 4, 5};
    }
//    public Human(Human other) {
//        this.name = other.name;
//        this.age = other.age;
//    }

    // shallow copy
//    public Object clone() throws CloneNotSupportedException {
//        return super.clone();  // shallow copy
//    }

    public Object clone() throws CloneNotSupportedException {
        Human clone = (Human) super.clone();

        clone.arr = new int[clone.arr.length];
        for (int i = 0; i < clone.arr.length; i++) {
            clone.arr[i] = arr[i];
        }
        return clone;
    }
}
