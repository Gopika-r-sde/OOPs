package oops3.properties;

public class BoxWeight extends Box {
    double weight;
    public BoxWeight() {
        this.weight = 2;
    }
    BoxWeight(double weight, double length, double height, double width) {
        super(width, height, length);
        this.weight = weight;
    }

}
