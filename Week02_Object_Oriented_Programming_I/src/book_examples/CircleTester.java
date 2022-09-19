package book_examples;

public class CircleTester {
    public static void main(String[] args) {
        //Create a circle with default radius of 1.
        Circle circle1 = new Circle();
        System.out.println("The area of the circle of radius " + circle1.getRadius() + " is " + circle1.area());

        //Create a circle with radius of 25.
        Circle circle2 = new Circle(25);
        System.out.println("The area of the circle of radius " + circle2.getRadius() + " is " + circle2.area());

        //Create a circle with radius 125
        Circle circle3 = new Circle(125);
        System.out.println("The area of the circle of radius " + circle3.getRadius() + " is " + circle3.area());

        //Modify the radius of an existing circle.
        System.out.println("The area of the circle of radius " + circle2.getRadius() + " is " + circle2.area());
   
        circle1.getRadius();
    }
}
