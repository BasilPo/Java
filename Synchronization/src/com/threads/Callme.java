package com.threads;

public class Callme {
    public /*synchronized*/ void call(int i) {
        for (int j = 0; j < 3; j++) {
            System.out.println(i++);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
    }
}