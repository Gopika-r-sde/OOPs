package oops3.properties;

public class BoxWeight extends Box {
    double weight;
    public BoxWeight() {
        this.weight = 2;
//        this.width = 3;  // error, because width is declared as private now
    }
    BoxWeight(double weight, double length, double height, double width) {
        super(width, height, length);  // super -> used to initialize the parent class constructor
        // here how width is used means, the class which has width only accessing, not the BoxWeight class
        this.weight = weight;
    }

}
