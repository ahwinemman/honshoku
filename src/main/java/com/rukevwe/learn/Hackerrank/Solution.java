package com.rukevwe.learn.Hackerrank;

import java.io.IOException;
import java.util.Scanner;

public class Solution {

    static long repeatedString(String s, long n) {
        long mod = n / Long.valueOf(s.length());
        long rem = n % Long.valueOf(s.length());
        int remInt = (int) rem;
        String sub = s.substring(0, remInt);
        long aNum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                aNum++;
            }
        }
        aNum = aNum * mod;
        if (remInt == 0) {
            return new Long(aNum);
        }
        for (int i = 0; i < sub.length(); i++) {
            if (sub.charAt(i) == 'a') {
                aNum++;
            }
        }
        return new Long(aNum);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int[][] twoDArray = {{2, 3, 4},
                             {4, 5, 6}
                            };
        
        System.out.println(twoDArray[0][1]);

        System.out.println(repeatedString("aab", 882787));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String s = scanner.nextLine();
//
//        long n = scanner.nextLong();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        long result = repeatedString(s, n);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();
    }
}
