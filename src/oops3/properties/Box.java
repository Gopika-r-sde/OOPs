package oops3.properties;

public class Box {

    double width;
    double height;
    double length;


    Box() {
        this.width = 5;
        this.height = 5;
        this.length = 5;
    }

    Box(double side) {
        this.width = side;
        this.height = side;
        this.length = side;
    }

    Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    Box(Box old) {
        this.width = old.width;
        this.height = old.height;
        this.length = old.length;
    }

    public void information() {
        System.out.println("Running the box");
    }

}
