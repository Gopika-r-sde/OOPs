package oops3.properties.inheritance;

public class Box {

    double width;
    double height;
    double length;

//    double weight;


    Box() {
        super();  // calls the Object class constructor
        this.width = 5;
        this.height = 5;
        this.length = 5;
//        this.weight = 9;
    }

    Box(double side) {
        this.width = side;
        this.height = side;
        this.length = side;
//        this.weight = 9;

    }

    Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
//        this.weight = 9;

    }

    Box(Box old) {
        this.width = old.width;
        this.height = old.height;
        this.length = old.length;
//        this.weight = 9;

    }

    public void information() {
        System.out.println("Running the box");
    }

}
