/*
 *  Narcissistic number
 *  https://en.wikipedia.org/wiki/Narcissistic_number
 *  1634 has 4 digit, so
 *  1^4 + 6^4 + 3^4 + 4^4 = 1634
 */
package com.narcissisticnumber;

public class Main {

    public static void main(String[] args) {
        System.out.println("Narcissistic numbers");
        for (int i = 0; i <= 10000000; i++) {
            if (isNarcissistic(i))
                System.out.println(i);
        }
    }

    private static boolean isNarcissistic(int n) {
        int tmp = n;
        int power = (int) Math.floor(Math.log10(n)) + 1;
        int sum = 0;
        do {
            sum += Math.pow(tmp % 10, power);
        } while ((tmp /= 10) > 0);
        if (sum == n)
            return true;
        return false;
    }
}