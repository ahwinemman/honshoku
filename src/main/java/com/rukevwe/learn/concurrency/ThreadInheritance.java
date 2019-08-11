package com.rukevwe.learn.concurrency;

public class ThreadInheritance extends Thread{

    // run() method contains the code that is executed by the thread.
    @Override
    public void run() {
        System.out.println("Inside : " + Thread.currentThread().getName());
    }

    public ThreadInheritance(String name) {
        super(name);
    }
    public static void main(String[] args) {
        System.out.println("Inside : " + Thread.currentThread().getName());

        System.out.println("Creating thread...");
        Thread thread = new ThreadInheritance("first_thread");

        System.out.println("Starting thread...");
        thread.start();
    }

}
