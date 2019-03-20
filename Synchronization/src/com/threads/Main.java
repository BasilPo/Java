/*Synchronization
 * without:       with:
 * 0              0
 * 0              1
 * 0              2
 * 1              0
 * 1              1
 * 1              2
 * 2              0
 * 2              1
 * 2              2
 * */
package com.threads;

public class Main {

    public static void main(String[] args) {
        Callme target = new Callme();

        Caller ob1 = new Caller(target);
        Caller ob2 = new Caller(target);
        Caller ob3 = new Caller(target);

        try {
            ob1.thread.join();
            ob2.thread.join();
            ob3.thread.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}