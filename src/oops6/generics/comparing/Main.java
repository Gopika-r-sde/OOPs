package oops6.generics.comparing;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(1, 21);
        Student s2 = new Student(2, 43);

        if(s1.compareTo(s2) < 0) {
            System.out.println(s1.compareTo(s2));
            System.out.println("s2 has more marks");
        } else if (s1.compareTo(s2) == 0) {
            System.out.println(s1.compareTo(s2));
            System.out.println("Both have equal marks");
        } else {
            System.out.println(s1.compareTo(s2));
            System.out.println("s1 has more marks");
        }
    }
}
