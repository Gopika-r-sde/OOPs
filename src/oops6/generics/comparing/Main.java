package oops6.generics.comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(1, 21);
        Student s2 = new Student(2, 43);
        Student s3 = new Student(3, 98);
        Student s4 = new Student(4, 65);
        Student s5 = new Student(5, 86);

        Student[] list = {s1, s2, s3, s4, s5};
        System.out.println(Arrays.toString(list));

        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

//        Arrays.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.rollno - o2.rollno;
//            }
//        });
//        System.out.println(Arrays.toString(list));


        // Lambda Expression
        Arrays.sort(list, (o1, o2) -> (int)(o1.marks - o2.marks));

//        if(s1.compareTo(s2) < 0) {
//            System.out.println(s1.compareTo(s2));
//            System.out.println("s2 has more marks");
//        } else if (s1.compareTo(s2) == 0) {
//            System.out.println(s1.compareTo(s2));
//            System.out.println("Both have equal marks");
//        } else {
//            System.out.println(s1.compareTo(s2));
//            System.out.println("s1 has more marks");
//        }
    }
}
