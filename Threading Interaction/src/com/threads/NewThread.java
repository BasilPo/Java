package com.threads;

public class NewThread implements Runnable {
    String name;
    Thread t;
    boolean isSuspend;

    NewThread(String name) {
        this.name = name;
        t = new Thread(this, name);
        System.out.println("New thread: " + t);
        isSuspend = false;
        t.start();
        //!!!!! t.suspend(), t.resume(), t.stop() - is deprecated !!!!!
    }

    public void run() {
        try {
            for (int i = 10; i > 0; i--) {
                System.out.println(name + " : " + i);
                Thread.sleep(200);
                synchronized (this) {
                    while (isSuspend) {
                        wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println(name + " is interrupted");
        }
        System.out.println(name + " is completed");
    }

    synchronized void mySuspend() {
        isSuspend = true;
    }

    synchronized void myResume() {
        isSuspend = false;
        notify();
    }
}