package com.rukevwe.learn.Hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TeamApt {

    public static void main(String[] args) {

        int oddNumber = findIt(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5});
        System.out.println(oddNumber);
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int a = 0; a < n; a++) {
            int grade = in.nextInt();
            if (grade >= 38) {
                if (grade % 5 >= 3) {
                    grade +=5 - (grade % 5);
                }
            }
            System.out.println(grade);
        }

        List<Integer> grades = Arrays.asList(4,73,67,38,33);
        List<Integer> estimates = gradingStudents(grades);
        
       
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> integerList = new ArrayList<>();
        if (grades != null && !grades.isEmpty()) {
            for (int i = 1; i <= grades.get(0); i++) {
                int currentGrade = grades.get(i);
                if (currentGrade >= 38) {
                    if (currentGrade % 5 >=3) {
                        currentGrade = (currentGrade += 5) - (currentGrade % 5);
                    }
                }
              integerList.add(currentGrade);
            }
        }
        return integerList;

    }
    
//    public static int findIt(int[] a) {
//        Integer[] freqArray = new Integer[2];
//        freqArray[1] = 0;
//
//        for (int i = 0; i < a.length; i++) {
//            int now = a[i];
//            for (int j = 0; j < a.length; j++) {
//                freqArray[0] = now;
//                if (a[j] == now) {
//                    freqArray[1] = freqArray[1] + 1;
//                }
//            }
//            if (freqArray[1] % 2 != 0) {
//                return freqArray[0];
//            }
//        }
//        return 0;
//    }

    public static int findIt(int[] A) {
        int xor = 0;
        for (int i = 0; i < A.length; i++) {
            xor ^= A[i];
        }
        return xor;
    }
    
    public static class SpinWords {

        public String spinWords(String sentence) {
            String[] splitString = sentence.split(" ");
            String newString = "";
            for (String s: splitString) {
                if (s.length() < 5) {
                    newString = newString + " " + s;
                }
                else {
                    newString = newString + " " + reverse(s);
                }
            }
            return newString.trim();
        }

        public String reverse(String reverseString) {
            char[] stringChar = reverseString.toCharArray();
            String reversedString = "";
            for (int i = 0; i < reverseString.length(); i++) {
                reversedString = reversedString + stringChar[reverseString.length() - 1 - i];
            }
            return reversedString;
        }
    }

}
