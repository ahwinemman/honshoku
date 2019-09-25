package com.rukevwe.learn.InterSwitch;

public class ContinueWithLabel {
    public static void main(String[] args) {
        inner:
        for (int k = 0; k < 12; k++) {
            outer: // naming the loop, an alternative for goto in C/C++ programs
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (j == 1)
                        continue inner;
                    System.out.println(" value of j = " + j);
                }
            }   
        }

    }
    
}
