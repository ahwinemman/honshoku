package com.rukevwe.learn.concurrency;

import java.util.HashSet;
import java.util.Set;

public class RunnableAnonymousClass {

    public static void main(String[] args) {
        System.out.println("Inside : " + Thread.currentThread().getName());

        System.out.println("Creating Runnable...");
        Runnable runnable = () -> System.out.println("Inside : " + Thread.currentThread().getName());
        System.out.println("Creating Thread...");
        Thread thread = new Thread(runnable);

        System.out.println("Starting Thread...");
        thread.start();
        
        
        String[] stringArray = new String[2];
        stringArray[1] = "red";
        stringArray[0] = "blue";
        
        String[] testArray = stringArray;
        for (String str : stringArray) {
            System.out.println(str);
        }
        for (String str : testArray) {
            System.out.println(str);
        }
        
        stringArray[1] = "yellow";
        for (String str : stringArray) {
            System.out.println(str);
        }
        for (String str : testArray) {
            System.out.println(str);
        }
        
        String now = "now";
        String b = now;
        System.out.println(b);
        now = " red";
        System.out.println(b);

        Set<String> stringSet = new HashSet<>();
        stringSet.add("blue");
        stringSet.add("pink");
        stringSet.remove("blue");
                
        
    }
}
