package oops6.generics;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {
    static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

//        list.forEach((item) -> System.out.println(item + 1));

        // Consumer -> Functional Interface
        Consumer<Integer> consumer = (item) -> System.out.println(item * 2);
        list.forEach(consumer);
    }
}
