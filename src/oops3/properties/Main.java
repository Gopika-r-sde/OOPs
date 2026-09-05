package oops3.properties;

import javax.sound.sampled.BooleanControl;

public class Main {
    static void main(String[] args) {
//        Box box1 = new Box();
//        System.out.println("Boxes have been created");
//        System.out.println("Box1 :" + box1.length + " " + box1.width + " " + box1.height);
//        Box box2 = new Box(4);
//        System.out.println("Box2 :" + box2.length + " " + box2.width + " " + box2.height);
//        Box box3 = new Box(1,2,3);
//        System.out.println("Box3 :" + box3.length + " " + box3.width + " " + box3.height);
//        Box box4 = new Box(box1);
//        System.out.println("Box4 :" + box4.length + " " + box4.width + " " + box4.height);


        BoxWeight box1 = new BoxWeight();
        System.out.println("Box1 :" + " " + box1.length + " " + box1.weight + " " + box1.width + " " + box1.height);


        // ParentClass variable can reference a ChildClass object
        Box box5 = new BoxWeight(3, 4 ,5 ,6);
        System.out.println(box5.length + " " + box5.height +  " " + box5.width);

        BoxWeight bw = (BoxWeight) box5;
        System.out.println(bw.weight);

        // There are many variables in both parent and child class
        // You are given access to the class that are of reference type i.e BoxWeight
        // Hence, you have access to the weight variable
        // This also means, that the one you are trying to access should be initialized


        // But here, when the obj itself is of type parent class, how will you call the constructor of the childclass
        // Therefore, this shows error
//        BoxWeight bw2 = new Box();
//        System.out.println(bw2.weight);


        BoxPrice bp = new BoxPrice();
        System.out.println(bp.weight + " " + bp.cost + " " + bp.length + " " + bp.height + " " + bp.width);

        BoxPrice bp2 = new BoxPrice(5, 13, 500);
        System.out.println(bp2.weight + " " + bp2.cost );
        System.out.println(bp2.length + " " + bp2.width + " " + bp2.height);
    }
}
