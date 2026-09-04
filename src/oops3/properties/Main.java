package oops3.properties;

public class Main {
    static void main(String[] args) {
        Box box1 = new Box();
        System.out.println("Boxes have been created");
        System.out.println("Box1 :" + box1.length + " " + box1.width + " " + box1.height);
        Box box2 = new Box(4);
        System.out.println("Box2 :" + box2.length + " " + box2.width + " " + box2.height);
        Box box3 = new Box(1,2,3);
        System.out.println("Box3 :" + box3.length + " " + box3.width + " " + box3.height);
        Box box4 = new Box(box1);
        System.out.println("Box4 :" + box4.length + " " + box4.width + " " + box4.height);
    }
}
