/* Create a program for entering integers as command line arguments,
 * counting their sum (product) and outputting the result to the console.
 */
package com.cmdarguments;

public class Main {

    public static void main(String[] args) {
        if (args.length > 0) {
            int sum = 0;
            int product = 1;
            for (int i = 0, tmp; i < args.length; i++) {
                if (args[i].matches("^\\d+$")) {
                    tmp = Integer.parseInt(args[i]);
                    sum += tmp;
                    product *= tmp;
                }
            }
            System.out.printf("Sum: %d, Product: %d", sum, product);
        }
    }
}