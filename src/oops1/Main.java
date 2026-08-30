package oops1;

class Student {
//    String name = "Ashok";
//    int age = 20;

    String name;
    int age;

    // constructor 1
    Student() {
        this("Gopika", 20);
    }

    // constructor 2
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Student student = new Student();
        student.name = "Jack";
        student.age = 18;
        System.out.println(student.name);
        System.out.println(student.age);


        Student student2 = new Student();
        System.out.println(student2.name);
        System.out.println(student2.age);

        Student student3 = new Student();
        System.out.println(student3.name);
        System.out.println(student3.age);
    }
}