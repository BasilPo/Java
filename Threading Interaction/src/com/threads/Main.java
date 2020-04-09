package com.threads;

public class Main {
    public static void main(String[] args) {
        NewThread t1 = new NewThread("One");
        NewThread t2 = new NewThread("Two");

        try {
            Thread.sleep(1000);
            t1.mySuspend();
            System.out.println(t1.name + " : suspend");
            Thread.sleep(1000);
            t1.myResume();
            System.out.println(t1.name + " : resume");
            t2.mySuspend();
            System.out.println(t2.name + " : suspend");
            Thread.sleep(1000);
            t2.myResume();
            System.out.println(t2.name + " : resume");
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Wait threads");
            t1.t.join();
            t2.t.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("End Main thread");
    }
}