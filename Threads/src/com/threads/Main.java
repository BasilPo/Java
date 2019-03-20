package com.threads;

public class Main {

    public static void main(String[] args) {
        Thread t1 = new Thread(new NewRunnable(), "One");
        NewThread t2 = new NewThread();
        t2.setName("Two");

        //Run threads
        t1.start();
        t2.start();

        //Wait threads
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " is interrupted");
        }

        System.out.println(Thread.currentThread().getName() + " is completed");
    }
}