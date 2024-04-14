package algorithms;

import java.util.Scanner;

public class AvgTestResults {
    public static void main(String args []){

        int amountStudents = 5;
        int amountTests = 3;

        Scanner scanner = new Scanner(System.in);

        for( int i = 0; i < amountStudents; i++){
            double total=0;

            for(int j = 0; j < amountTests; j++){
                 System.out.println("Enter the result of test #" + (j+1) +" of studant #"+(i+1));
                 total += scanner.nextDouble();
            }

            System.out.println("The test average for student #"+ (i+1)+ " is "+(total/amountTests));
        }
        scanner.close();
    }
}
