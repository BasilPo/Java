/*Develop an application that, when started, with the help of the switch operator
displays a text menu in the console for the user to execute the operations listed below.
1. Creating an array of all odd numbers from 1 to 99, bringing it to screen to line.
2. Creating an array of the first 20 Fibonacci numbers and bringing it to screen.
We remind you that the first and second members of the sequence are equal
units, and each following - the sum of the two previous ones.
3. Creating a two-dimensional array of 8 rows of 5 columns in each of
random integers from the segment from 10 to 99. Display the array on the screen.
Menu structure:
"1. To create an array of odd numbers, press 1 ".
"2. To create an array of Fibonacci numbers, press 2 "
"3. To create a two-dimensional array, press 3 "
"4. To exit the application, press 4. "
After performing the selected operation, the screen should display
result and again the user is prompted to perform one of the operations
until the user exits the application.
*/
package com.cmdarguments;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        showMenu();
        solve();
    }

    private static void showMenu() {
        System.out.println("Select one of the following operations:");
        System.out.println("1. To create an array of odd numbers, press 1\n" +
                "2. To create an array of Fibonacci numbers, press 2\n" +
                "3. To create a two-dimensional array, press 3\n" +
                "4. To exit the application, press 4\n");
    }

    private static void solve() {
        Scanner scanner = new Scanner(System.in);
        int choice = 4;

        do {
            System.out.println("Make a choice");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        createOddArray();
                        break;
                    case 2:
                        createFibonacciArray();
                        break;
                    case 3:
                        createTwoDimensionalArray();
                        break;
                }
            } else {
                scanner.nextLine(); //for "clear" buffer
                scanner.nextLine();
                System.out.println("Invalid input");
            }
        } while (choice != 4);
    }

    private static void createOddArray() {
        int[] oddArray = new int[50];
        for (int i = 0, value = 1; i < oddArray.length; i++, value += 2)
            oddArray[i] = value;
        System.out.println(Arrays.toString(oddArray));
    }

    private static void createFibonacciArray() {
        int[] fibonacciArray = new int[20];
        fibonacciArray[0] = 0;
        fibonacciArray[1] = 1;
        for (int i = 2; i < 20; i++)
            fibonacciArray[i] = fibonacciArray[i - 2] + fibonacciArray[i - 1];
        System.out.println(Arrays.toString(fibonacciArray));
    }

    private static void createTwoDimensionalArray() {
        int[][] matrix = new int[8][5];
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                matrix[i][j] = 10 + (int) (Math.random() * 91);
        System.out.println(Arrays.deepToString(matrix));
    }
}