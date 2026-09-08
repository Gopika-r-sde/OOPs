package oops4.access;

public class A {
    protected String name;
    private int num;
    public int[] arr;
    int digit;

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    static void main(String[] args) {
        A a = new A();
        System.out.println(a.num);  // num can access within the file without getters and setters
    }
}
