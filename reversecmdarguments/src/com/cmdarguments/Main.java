/* Create an application that displays main() method command line arguments
 * in the console window in the reverse order.
 */
package com.cmdarguments;

public class Main {

    public static void main(String[] args) {
        if (args.length > 0) {
            for (int i = args.length - 1; i >= 0; i--)
                System.out.println(args[i]);
        }
    }
}

//run from cmd:
// java -cp C:\JavaProject\reversecmdarguments\out\production\reversecmdarguments com.cmdarguments.Main arg1 arg2