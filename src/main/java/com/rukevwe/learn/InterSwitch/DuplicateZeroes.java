package com.rukevwe.learn.InterSwitch;

import java.util.Arrays;

public class DuplicateZeroes {

    public static void main(String[] args) {
        int[] inputArray = {1, 0, 2, 3, 0, 4, 5, 0};
        System.out.println(Arrays.toString(dupicateZeroes(inputArray)));
    }

    public static int[] dupicateZeroes(int[] array) {
        int n = array.length;

        int j = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] == 0) {
                while (j < n - i) {
                    array[n - 1 - j] = array[n - 2 - j];
                    j += 1;
                }
                array[i + 1] = 0;
                i += 1;
            }
        }
        return array;
    }
}
