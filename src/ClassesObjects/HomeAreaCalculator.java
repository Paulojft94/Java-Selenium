package ClassesObjects;

/*
 * Write a class that creates instances of the Rectangle class to find the
 * total area of two rooms in a house.
 */

public class HomeAreaCalculator {

    public static void main(String args[]){

        //create the instance for room#1
        Rectangle room1 = new Rectangle();

        room1.setWidth(8);
        room1.setLength(3);

        double areaOfRoom1 = room1.calculateArea();

        //create the instance for room#1
        Rectangle room2 = new Rectangle(2.5, 3);
        double areaOfRoom2 = room2.calculateArea();

        double totalArea = areaOfRoom1 + areaOfRoom2;

        System.out.println("The Area of both rooms is: "+totalArea);
    }

}
