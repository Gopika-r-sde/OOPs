package oops4.access;

public class ObjectClass extends A {
    int num;

    public ObjectClass(int num) {
        this.num = num;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
//        return super.equals(obj);
        return this.num == ((ObjectClass)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

//    @Override
//    protected void finalize() throws Throwable {
//        super.finalize();
//    }

    static void main(String[] args) {
        ObjectClass obj = new ObjectClass(5);
        System.out.println(obj.hashCode());

        ObjectClass obj2 = new ObjectClass(5);
        ObjectClass obj3 = obj2;
        System.out.println(obj2.hashCode());  // different from obj
        System.out.println(obj3.hashCode());  // same as obj2


        if(obj == obj2) {   // checks reference variable points to same object or not
            System.out.println("obj == obj2");
        }

        if(obj.equals(obj3)) {   // checks the values inside the object
            System.out.println("obj == obj3");
        }

        System.out.println(obj instanceof ObjectClass);
        System.out.println(obj instanceof Object);
        System.out.println(obj instanceof A);

        // Details we get about the class will store in heap memory
        System.out.println(obj.getClass().getConstructors().length);
    }
}
