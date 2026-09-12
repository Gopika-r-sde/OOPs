package oops6.generics;

public class Main implements GenericInterface<Integer> {

    @Override
    public void display(Integer value) {
        System.out.println(value);
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.display(1);
        GenericInterface<Integer> g = new Main();
        g.display(5);

    }
}
