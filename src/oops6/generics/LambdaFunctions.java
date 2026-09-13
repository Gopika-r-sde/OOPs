package oops6.generics;

import java.util.ArrayList;

public class LambdaFunctions {
    static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        list.forEach((item) -> System.out.println(item + 1));
    }
}
