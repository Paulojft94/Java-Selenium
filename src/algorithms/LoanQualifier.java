package algorithms;

import java.util.Scanner;

public class LoanQualifier {

    public static void main(String args[]){

        int requiredSalary = 30000;
        int requiredYears = 2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your salary:");
        double salary = scanner.nextDouble();

        System.out.println("Enter the number of years in your current job:");
        double years = scanner.nextDouble();

        if (salary >= requiredSalary){
           if(years >= requiredYears){
               System.out.println("Congrats! You met the requirements");
           }
           else{
               System.out.println("Sorry! You must have "+ requiredYears+ " years in your current job");
           }
        } else {
            System.out.println("Sorry! You must earn more than "+ requiredSalary+ " per year");
        }


    }

}
