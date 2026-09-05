package oops3.properties;

public class BoxPrice extends BoxWeight {
    double cost;

    BoxPrice() {
        super();
        this.cost = 0;
    }

    BoxPrice(BoxPrice other) {
        super(other);
        this.cost = other.cost;
    }


    public BoxPrice(double width, double height, double length, double weight, double cost) {
        super(width, height, length, weight);
        this.cost = cost;
    }

    BoxPrice(double side,double weight, double cost) {
        super(side, weight);
        this.cost = cost;
    }
}
