package com.rukevwe.learn.Hackerrank;

import java.util.Arrays;

public class TwoDArray {

    static int hourglassSum(int[][] arr) {
        int[] arrTotal = new int[16];
        int index = 0;
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                int total = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] +
                        arr[i+1][j+1] +
                        arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                arrTotal[index+j] =  total;
            }
            index+=4;
        }
        return Arrays.stream(arrTotal).max().getAsInt();
    }

    public static void main(String[] args) {
        int [][] twoDArray = {{1,1,1,0,0,0},
                              {0,1,0,0,0,0,},
                              {1,1,1,0,0,0},
                              {0,9,2,-4,-4,0},
                              {0,0,0,-2,0,0},
                              {0,0,-1,-2,-4,0}
        };
        
        System.out.println(hourglassSum(twoDArray));
    }
}
