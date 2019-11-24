package com.rukevwe.learn.InterSwitch;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        
        System.out.println(Arrays.toString(countPrimeNumbers(n)));
//        Arrays.deepToString()  For converting multidimensional arrays to string
    }

    public static int[] countPrimeNumbers(int n) {

        int count = 0;
        int[] pNumberArray = new int[n];

        
        for (int i = 2; count < n; i++) {
            boolean isPrime = true;
            for (int j = 2; j <=Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                pNumberArray[count] = i;
                count++;   
            }
        }
        return pNumberArray;
    }

}
