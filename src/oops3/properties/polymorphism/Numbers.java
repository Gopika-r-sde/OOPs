package oops3.properties.polymorphism;

// this class cannot be inherited

final public class Numbers {
    double sum(double a, int b) {
        return a+b;
    }
    int sum(int a, int b){
        return a+b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }

    static void main(String[] args) {
        Numbers n = new Numbers();
        System.out.println(n.sum(1,2,3));
        System.out.println(n.sum(4,5));
        System.out.println(n.sum(5.0,7));
    }
}
