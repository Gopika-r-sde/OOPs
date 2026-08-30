package oops1;

class A{
    String name;

    A(String name){
        System.out.println("Object is created");
        this.name=name;
    }

//    @Override
//    protected void finalize() throws Throwable {
//        System.out.println("Object is destroyed");
//    }
}
public class GarbageCollector {
    public static void main(String[] args) {
        A obj;
        for(int i=0;i<1000000000;i++){
            obj = new A("Random Name");
        }
    }
}
