package com.rukevwe.learn.InterSwitch;

import java.util.Hashtable;

public class FibonacciMem {

    public static void main(String[] args) {

        Hashtable<Integer, Long> saveMap = new Hashtable<>();
        saveMap.put(0, new Long(0));
        saveMap.put(1, new Long(1));

        System.out.println(fibonacciMemMethod(10, saveMap));
    }

    public static long fibonacciMemMethod(int n, Hashtable<Integer, Long> hashTable) {

        if (n < 0) {
            return -1;    
        }
        
        if (hashTable.containsKey(n)) {
            return hashTable.get(n);

        } else {
           long first = Long.valueOf(fibonacciMemMethod(n - 1, hashTable));
           long second = Long.valueOf(fibonacciMemMethod(n - 2, hashTable));
           hashTable.put(n-1, first);
           hashTable.put(n-2, second);
           return first + second;
        }
    }
    
//    public static int 
}
