package algorithms;

import java.util.Scanner;

public class Greetings {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Whats your name?");
        String name = scanner.next();

        System.out.println(greetUser(name));

    }

    public static String greetUser(String name){
        return "Have a nice day, "+name;
    }

}
