package algorithms;

import java.util.Scanner;

/*
 * VARIABLE SCOPE
 * Write an ‘instant credit check’ program that approves
 * anyone who makes more than $25,000 and has a credit score
 * of 700 or better. Reject all others.
 */
public class CreditScore {
    static Scanner scanner = new Scanner(System.in);
    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;


    public static void main(String args[]){

        double salary = getSalary();
        int score = getCreditScore();
        scanner.close();

        if(isUserQualified(salary, score))
            System.out.println("Congratulations, you are elegible for credit!");
        else
            System.out.println("Sorry, you are NOT elegible for credit!");
    }

    public static double getSalary(){
        System.out.println("Whats is your salary?");
        return scanner.nextDouble();
    }

    public static int getCreditScore(){
        System.out.println("Whats is your credit score?");
        return scanner.nextInt();
    }

    public static boolean isUserQualified(double salary, int score){
        return  score>=requiredCreditScore && salary>= requiredSalary;
    }

}
