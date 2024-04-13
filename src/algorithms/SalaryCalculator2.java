package algorithms;

import java.util.Scanner;

/*
 * IF ELSE
 * All salespeople are expected to make at least 10 sales each week.
 * For those who do, they receive a congratulatory message.
 * For those who don’t, they are informed of how many sales they were short.
 */
public class SalaryCalculator2 {

    public static  void  main (String arg []) {

        int quota = 10;

        System.out.println("How many sales the employee made this week?");

        Scanner scanner = new Scanner(System.in);

        int numSales = scanner.nextInt();
        scanner.close();

        if(numSales > quota) {
            System.out.println("Yeeei, you exceeded the expactions");
        } else{
            int missingSales= (quota+1)-numSales;
            System.out.println("You missed the objective by "+missingSales+" sale(s)");
        }
    }
}
