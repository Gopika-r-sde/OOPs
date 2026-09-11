package oops6.generics;

import java.util.Arrays;

public class CustomArrayList {

    private int[] data;
    private int size;
    private static int DEFAULT_CAPACITY = 10;
    public CustomArrayList() {
        this.data = new int[DEFAULT_CAPACITY];
    }

    public void add(int num) {
        if(isFull()) {
            resize();
        }
        data[size++] = num;
    }

    public boolean isFull() {
        return size == data.length;
    }

    public void resize() {
        int[] temp = new int[data.length * 2];

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public int remove() {
        int removed = data[--size];
        return removed;
    }

    public int get(int index) {
        return data[index];
    }

    public void set(int index, int value) {
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
        CustomArrayList obj = new CustomArrayList();
        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);
        obj.add(5);
        System.out.println(obj.size());
        System.out.println(obj);
    }
}
