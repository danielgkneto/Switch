/*
Write a program using a switch statement to print the month names given the exact number of days in the month.
If the user enters 30 then the program will display: "September April June November". If the user enters 9
then program will alert the user that no months have exactly 9 days.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        byte numberOfDays;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the number of days? : ");
        numberOfDays = keyboard.nextByte();

        switch (numberOfDays) {
            case 28: case 29: {
                System.out.println("February");
                break;
            }
            case 30: {
                System.out.println("September April June November");
                break;
            }
            case 31: {
                System.out.println("January March May July August October December");
                break;
            }
            default: {
                System.out.println("There is no month with exactly " + numberOfDays + " days");
                break;
            }
        }
    }
}
