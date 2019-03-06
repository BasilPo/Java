/*Create an application to enter a password from the command line
 *and compare it with a sample string.
 */
package com.cmdarguments;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    String password = "Secret:)";
	    String input = new Scanner(System.in).nextLine();
	    if(password.equals(input)) //operator == return false
            System.out.println("Welcome!");
	    else
            System.out.println("Invalid password");
    }
}