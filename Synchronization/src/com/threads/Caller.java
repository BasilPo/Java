package com.threads;

public class Caller implements Runnable {
    Callme target;
    Thread thread;
    int i = 0;

    Caller(Callme target) {
        this.target = target;
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        //Note
        synchronized (target) {
            target.call(i);
        }
    }
}