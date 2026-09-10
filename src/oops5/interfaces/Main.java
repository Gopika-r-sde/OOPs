package oops5.interfaces;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        car.brake();
        car.accelerate();
        car.start();
        car.stop();

        Engine car2 = new Car();
        car2.accelerate();
//        car2.a;
    }
}
