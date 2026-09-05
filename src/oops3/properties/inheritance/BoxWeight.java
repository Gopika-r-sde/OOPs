package oops3.properties.inheritance;

public class BoxWeight extends Box {
    double weight;
    public BoxWeight() {
        this.weight = 2;
//        this.width = 3;  // error, because width is declared as private now
    }
    BoxWeight(double width, double height, double length, double weight) {
        super(width, height, length);  // super -> used to initialize the parent class constructor

        // when width is private, here how width is used means, the class which has width only accessing, not the BoxWeight class

        this.weight = weight;
//        System.out.println("Superclass Weight " + super.weight);  // super keyword is used to refer the members that are defined in the parentclass
    }

    BoxWeight(BoxWeight other) {
        // A ParentClass variable can be used to reference any object that derived from that class
        super(other);
        this.weight = other.weight;
    }

    BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }
}
