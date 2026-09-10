package oops5.interfaces;

public class Car implements Brake, Engine {

    int a = 5;

    @Override
    public void brake() {
        System.out.println("Car braking");
    }

    @Override
    public void start() {
        System.out.println("Car starting");
    }

    @Override
    public void stop() {
        System.out.println("Car stopping");
    }

    @Override
    public void accelerate() {
        System.out.println("Car accelerating");
    }
}
