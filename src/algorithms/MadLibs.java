package algorithms;

import java.util.Scanner;

public class MadLibs {

    public static void main (String arg []){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the season of the year:");
        String season = scanner.next();

        System.out.println("Enter a number:");
        int numOfCups = scanner.nextInt();

        System.out.println("Enter an adjective:");
        String adj = scanner.next();
        scanner.close();

        System.out.println("On a " +adj + " "+season + " day, I drink a minimum of "+numOfCups+ " cups of coffee.");

    }

}
