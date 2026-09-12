package oops6.generics;

import java.util.Arrays;
import java.util.List;

// WildCards are useful to keep the required data types or classes
// here T can be either be Number or its subclasses
public class WildCardExample<T extends Number> {

    private Object[] data;
    private int size;
    private static int DEFAULT_CAPACITY = 10;
    public WildCardExample() {
        this.data = new Object[DEFAULT_CAPACITY];
    }

    public void add(T num) {
        if(isFull()) {
            resize();
        }
        data[size++] = num;
    }

    // can accept only Number types not subclasses
    public void getList(List<Number> list) {
        // code here
    }

    // Number and subclasses are accepted
    public void get(List<? extends Number> list) {
        // code here
    }

    public boolean isFull() {
        return size == data.length;
    }

    public void resize() {
        Object[] temp = new Object[data.length * 2];

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public T remove() {
        T removed = (T)(data[--size]);
        return removed;
    }

    public T get(int index) {
        return (T)(data[index]);
    }

    public void set(int index, T value) {
        data[index] = value;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }

    static void main(String[] args) {

        WildCardExample<Integer> list = new WildCardExample<>();

        for (int i = 0; i < 14; i++) {
            list.add(2 * i);
        }

        System.out.println(list);
    }
}
