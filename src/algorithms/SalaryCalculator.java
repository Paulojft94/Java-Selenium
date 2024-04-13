package algorithms;

import java.util.Scanner;

/*
IF Statement.
All salespeople get a payment of $1000 a week.
Salespeople who exceed 10 sales get an additional bonus of $250.
 */
public class SalaryCalculator {

    public static  void  main (String arg []) {

        int salary = 1000;
        int bonus = 250;

        System.out.println("How many sales the employee made this week?");

        Scanner scanner = new Scanner(System.in);

        int numSales = scanner.nextInt();
        scanner.close();

        if(numSales > 10) {
            salary = salary + 250;
        }
            System.out.println("The employee salary is " + salary);
    }
}
