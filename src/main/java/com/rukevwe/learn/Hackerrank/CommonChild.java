//package com.rukevwe.learn.Hackerrank;
//
//
//import java.util.Scanner;
//
//public class CommonChild {
//
//    public static void main(String[] args) {
//        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//        Scanner sc = new Scanner(System.in);
//        String in1 = sc.next();
//        String in2 = sc.next();
//        System.out.println(lcs(in1,in2));
//    }
//    public static int lcs(String a, String b) {
//        int[][] lengths = new int[a.length()+1][b.length()+1];
//
//        // row 0 and column 0 are initialized to 0 already
//
//        for (int i = 0; i < a.length(); i++)
//            for (int j = 0; j < b.length(); j++)
//                if (a.charAt(i) == b.charAt(j))
//                    lengths[i+1][j+1] = lengths[i][j] + 1;
//                else
//                    lengths[i+1][j+1] =
//                            Math.max(lengths[i+1][j], lengths[i][j+1]);
//
//        // read the substring out from the matrix
//        StringBuffer sb = new StringBuffer();
//        for (int x = a.length(), y = b.length();
//             x != 0 && y != 0; ) {
//            if (lengths[x][y] == lengths[x-1][y])
//                x--;
//            else if (lengths[x][y] == lengths[x][y-1])
//                y--;
//            else {
//                assert a.charAt(x-1) == b.charAt(y-1);
//                sb.append(a.charAt(x-1));
//                x--;
//                y--;
//            }
//        }
//
//        return sb.reverse().toString().length();
//    }
//}
//}
