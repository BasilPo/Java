/*
 * Arrange keyboard entry of date of birth man,
 * the program should display the zodiac sign
 * and the names of the year in the Chinese calendar.
 * Sample input:
 * December 5 1974
 * Output:
 * Sign: Archer Year: Tiger.
 */

package com.zodiacsigns;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your date of birth in the following format: Month Day Year.\n" +
                "For example: January 1 2000");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        ZodiacSigns zodiacSigns = new ZodiacSigns();
        zodiacSigns.solve(input);
    }
}