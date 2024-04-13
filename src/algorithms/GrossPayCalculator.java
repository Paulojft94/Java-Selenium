package algorithms;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String arg [] ){

        System.out.println("Enter the number of hours the employee worked:");

        Scanner scanner = new Scanner(System.in);
        int numHours = scanner.nextInt();
        scanner.close();

        System.out.println("Enter the employee pay rate:");
        double payRate = scanner.nextDouble();
        scanner.close();

        double salary = numHours*payRate;

        System.out.println("The employee's salary is: " + salary);
    }

}
