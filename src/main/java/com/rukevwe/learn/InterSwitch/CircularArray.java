package com.rukevwe.learn.InterSwitch;

public class CircularArray {

    public static void main(String[] args) {
        char[] chArray = {'A', 'B', 'C', 'D', 'E', 'F'};
        print(chArray, 6, 3);
    }
    
    public static void print(char a[], int n, int ind) {
        
        for (int i = ind; i < ind + n ; i++) {
            System.out.println(a[i % n] + " ");
        }
    }
    
    
}
