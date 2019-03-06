/*
 * The program requests a six-digit number, after
 * entry determines whether the ticket will be happy
 * with this number (the sum of the first three digits corresponds to
 * with the sum of the last three).
 * Input example:
 * 423252
 * 954832
 * Output:
 * Yes
 * Not
 */
package com.happyticket;

import java.util.Scanner;

public class HappyTicket {
    private static String solve(int n) {
        int count = 0;
        int halfSum = 0;
        int fullSum = 0;
        while (n > 0) {
            fullSum += n % 10;
            n /= 10;
            count++;
            if (count == 3)
                halfSum = fullSum;
        }
        if (count == 6 && fullSum - halfSum == halfSum)
            return "Yes";
        else
            return "No";
    }

    public static void main(String[] args) {
        System.out.println("Enter a six-digit number");
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            String isHappy = solve(number);
            System.out.println("Input: " + number);
            System.out.println("Output: " + isHappy);
        } else
            System.out.println("Incorrect input");
    }
}