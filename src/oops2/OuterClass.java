package oops2;


class InnerClass2 {
    static String name;
    public InnerClass2(String name) {
        InnerClass2.name = name;
    }
}


public class OuterClass {

    // static class
    // static inner class can have static variables
    static class InnerClass {
        String name;
        public InnerClass(String name) {
            this.name = name;
        }
    }

    static void main(String[] args) {
        // static classes inside a non-static class can have instances of each other
        InnerClass a = new InnerClass("Gopika");
        InnerClass b = new InnerClass("Gopi");
        System.out.println(a.name);
        System.out.println(b.name);

        InnerClass2 c = new InnerClass2("Joan");
        InnerClass2 d = new InnerClass2("Joan Pavi");
        System.out.println(c.name);
        System.out.println(d.name);

    }
}

