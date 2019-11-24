package com.rukevwe.learn.InterSwitch;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("testtset"));
    }
    
    public static boolean isPalindrome(String str) {
        String lowerStr = str.toLowerCase();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            if(str.charAt(i) != str.charAt(n - i -1)) {
                return false;
            }
        }
        return true;
    }
}
