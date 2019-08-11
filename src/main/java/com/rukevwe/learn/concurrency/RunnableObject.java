package com.rukevwe.learn.concurrency;

public class RunnableObject implements Runnable {

    public static void main(String[] args) {
        System.out.println("Inside : " + Thread.currentThread().getName());

        System.out.println("Creating Runnable...");
        Runnable runnable = new RunnableObject();

        System.out.println("Creating Thread...");
        Thread thread = new Thread(runnable);

        System.out.println("Starting Thread...");
        thread.start();
    }

    public void run() {
        System.out.println("Inside : " + Thread.currentThread().getName());
    }
}