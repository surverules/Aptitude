package com.ubs.ms.java;

import java.util.Scanner;

public class PrimeNumber {

    /**
     *  Main method to accept user Input and return result.
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println(" Enter Number ");
        int userNumber = scanner.nextInt();
        System.out.println(" Enter Position");
        int position = scanner.nextInt();

        System.out.printf(" Entered Number %d and Position %d has Prime Number %d",
                userNumber, position, userInput(userNumber, position));
    }

    /**
     *  It takes userNumber lets say (4) and position (2nd Position Prime Number)
     *  Internally it checks if the number is Prime or Not and if Prime then increment the J++ which
     *  is compared with Position (lets say 2nd position)
     * @param userNumber
     * @param position
     * @return
     */
    public static int userInput(int userNumber, int position) {
        int number = 0 ;
        for (int i = userNumber, j=0 ; j < position ; i++) {
            if (isPrimeNumber(i)) {
                j++;
                number = i;
            }
        }
       return number;
    }


    /**
     *  It checks if the number supplied is Prime Number of Not
     *  Notes: 2 <= i < number -- 1 is not counted and number is not in the range.
     * @param number
     * @return
     */
    public static boolean isPrimeNumber(int number) {
        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            //Checks if Modulus is Zero means it can be divided.
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }


}
