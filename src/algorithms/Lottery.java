package algorithms;

import java.util.Random;

public class Lottery {
    private static final int LENGTH = 6;
    private static final int MIN = 1;
    private static final int RANGE = 68;



    public static void main (String args[]){

        printLottery(lotteryGeneration());
    }

    public static int [] lotteryGeneration(){
        int [] generated= new int[LENGTH];
        Random random = new Random();

        for(int i = 0; i < LENGTH; i ++){
           generated[i] = random.nextInt(RANGE)+MIN;
        }
        return generated;
    }

    public static void printLottery(int ticket []) {
        for (int i = 0; i < LENGTH; i++) {
            System.out.print(ticket[i]+", ");
        }
    }
}
