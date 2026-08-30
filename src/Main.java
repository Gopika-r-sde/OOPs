class Student {
    String name = "Ashok";
    int age = 20;

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
    }
}