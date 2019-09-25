package com.rukevwe.learn.Random;

public class Fibonnaci {

    public static void main(String[] args) {
        System.out.println(fib(100));
    }
    
    public static int fib(int n) {
//        if (n == 0 || n == 1) {
//            return n;
//        } else if (n == 2) {
//            return 3;
//        }
//        return fib(n-1) + fib(n-2);
        
        switch(n){
            case 1:
                return 1;
            case 2:
                return 2;
            default:
                return 4;
        }
    }
}
