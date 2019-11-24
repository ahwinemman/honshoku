package com.rukevwe.learn.InterSwitch;

import java.util.Scanner;

public class NPrimeNumbers {

    private static Scanner scanner = new Scanner( System.in );

    public static void main(String[] args) {

        System.out.println("Enter total required prime numbers: ");

        String input = scanner.nextLine();
        int totalNumber = Integer.parseInt( input );
        int count = 0;

        System.out.println("A List of the first " + totalNumber + " prime numbers");

        for (int num = 2; count < totalNumber; num++)
        {

            boolean isPrime = true;
            for (int i=2; i <= num/2; i++)
            {
                if ( num % i == 0)
                {
                    isPrime = false;
                    continue;
                }
            }

            if ( isPrime == true )
            {
                System.out.println(num);
                count++;
            }
        }
    }
}
