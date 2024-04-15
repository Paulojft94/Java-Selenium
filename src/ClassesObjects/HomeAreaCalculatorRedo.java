package ClassesObjects;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {
    Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){

        HomeAreaCalculatorRedo areaCalculator = new HomeAreaCalculatorRedo();

        Rectangle kitchen = areaCalculator.getRoom();
        Rectangle bathroom = areaCalculator.getRoom();

        double area = areaCalculator.calculateTotalArea(kitchen, bathroom);

        System.out.println("Your total area is: "+area);
        areaCalculator.scanner.close();
    }

    public Rectangle getRoom(){

        System.out.println("Enter the length of your room:");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of your room:");
        double width = scanner.nextDouble();

        return new Rectangle(length, width);
    }

    public double calculateTotalArea(Rectangle rect1, Rectangle rect2){
        return rect1.calculateArea() + rect2.calculateArea();
    }

}
