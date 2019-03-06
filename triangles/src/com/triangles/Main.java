/*
 * You must draw triangles with an asterisk.
 * Each new tier should be wider than the previous one.
 * The number of tiers is entered from the keyboard, and the height
 * the first (upper) tier (triangle). Tiers should be
 * symmetrical.
 *
 * Enter the number of triangles and the height by a whitespace:
 * 3 2
 *           *
 *          ***
 *           *
 *          ***
 *         *****
 *           *
 *          ***
 *         *****
 *        *******
 */
package com.triangles;

import java.util.Scanner;

public class Main {

    private static int number;
    private static int height;

    public static void main(String[] args) {
        setData();
        drawTriangles();
    }

    private static void setData() {
        System.out.println("Enter the number of triangles and the height by a whitespace:");
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split("\\s");
        if (inputs.length == 2 && inputs[0].matches("^\\d$") && inputs[1].matches("^\\d$")) {
            number = Integer.parseInt(inputs[0]);
            height = Integer.parseInt((inputs[1]));
        } else
            System.out.println("Input Error");
    }

    private static void drawTriangles() {
        int columns = 2 * (number + height);
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < height + i; j++) {
                for (int k = columns; k > j; k--)
                    System.out.print(" ");
                for (int m = 0; m < j * 2 + 1; m++)
                    System.out.print("*");
                System.out.println();
            }
        }
    }
}