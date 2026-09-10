package oops5.interfaces;

public class NiceCar {
    private Engine engine;
    private Media player;

    public NiceCar() {
        engine = new PowerEngine();
        player = new CDPlayer();
    }

    void startEngine() {
        engine.start();
    }

    void stopEngine() {
        engine.stop();
    }

    void startMusic() {
        player.start();
    }
    void stopMusic() {
        player.stop();
    }

    void upgradeEngine() {
        this.engine = new ElectricEngine();
    }
}
