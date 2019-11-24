package com.rukevwe.learn.InterSwitch;

import java.util.Stack;

public class Balanced {

    static String s1 = "{[(])}";
    static String NO = "NO";
    static String YES = "YES";

    public static void main(String[] args) {

        System.out.println(isBalanced(s1));
    }

    static String isBalanced(String s) {
        int n = s.length();
        char c;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (s.isEmpty() || n % 2 != 0) {
                return NO;
            }
            c = s.charAt(i);
            if (c == '{' || c == '(' || c == '[') {
                stack.push(c);
            }
            if (!stack.isEmpty()) {
                if (c == '}' || c == ')' | c == ']') {
                    char newC = stack.pop();
                    if ((c == '}' && newC != '{') || (c == ')' && newC != '(') || (c == ']' && newC != '[')) {
                        return NO;
                    }
                }
            } else {
                return NO;
            }
        }
        if (stack.isEmpty()) {
            return YES;
        }
        return NO;
    }
}
