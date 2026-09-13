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

        // Consumer -> Functional Interface -> Accepts single input parameter and return no results
//        Consumer<Integer> consumer = (item) -> System.out.println(item * 2);
//        list.forEach(consumer);

        Operation sum = (a, b) -> a + b;
        Operation sub =  (a, b) -> a - b;
        Operation prod = (a, b) -> a * b;
        Operation div = (a, b) -> a / b;

        LambdaFunctions obj = new LambdaFunctions();
        System.out.println(obj.operate(5, 3, sum));
        System.out.println(obj.operate(6, 2, sub));
        System.out.println(obj.operate(2, 5, prod));
        System.out.println(obj.operate(10000, 10, div));

    }

    int operate(int a, int b, Operation op) {
        return op.operation(a,b);
    }

}
// It accepts two input arguments and also can return results
interface Operation {
    int operation(int a, int b);
}
