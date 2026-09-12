package oops6.generics;

import java.util.Arrays;

public class CustomGenericArrayList<T> {

    private Object[] data;
    private int size;
    private static int DEFAULT_CAPACITY = 10;
    public CustomGenericArrayList() {
        this.data = new Object[DEFAULT_CAPACITY];
    }

    public void add(T num) {
        if(isFull()) {
            resize();
        }
        data[size++] = num;
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

        CustomGenericArrayList<Integer> list = new CustomGenericArrayList<>();

        for (int i = 0; i < 14; i++) {
            list.add(2 * i);
        }

        System.out.println(list);
    }
}
