package algorithms;

import java.util.Scanner;

public class OvertimePaymentCalculation {

    public static void main(String args[]){

        int rate = 15;
        int maxHours = 40;

        System.out.println("How many hours did you work his week?");

        Scanner scanner= new Scanner(System.in);
        double  hoursWorked = scanner.nextDouble();

        while(hoursWorked>maxHours || hoursWorked<1) {
            System.out.println("Invalid Entry! Your hours must be between 1 and 40. Try Again.");
            hoursWorked = scanner.nextDouble();
        }

        scanner.close();
        double grossPay = rate*hoursWorked;
        System.out.println("Your gross pay is "+grossPay);

    }
}
