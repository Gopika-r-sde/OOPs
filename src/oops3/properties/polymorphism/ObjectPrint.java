package oops3.properties.polymorphism;

public class ObjectPrint {
    int num;
    ObjectPrint(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "ObjectPrint" + ": " + this.num;
    }
    static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(5);
        System.out.println(obj); // before overriding toString() op is hashcode
    }
}
