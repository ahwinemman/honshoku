package com.rukevwe.learn.concurrency;


import java.util.HashMap;
import java.util.Map;

public class TeamApt {
    static int[] rotLeft(int[] a, int d) {
        int arraySize = a.length;
        int[] shiftedArray = new int[arraySize];
        for (int i = 0; i<arraySize; i++) {
            if (i - d < 0) {
                shiftedArray[arraySize + i - d] = a[i];
            } else {
                shiftedArray[i - d] = a[i];
            }
           
        }
        return shiftedArray;
    }

    static int sockMerchant(int n, int[] ar) {
        Map<Integer, Integer> intMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int curInt = ar[i];
            if(intMap.containsKey(curInt)) {
                intMap.put(curInt, intMap.get(curInt) + 1);
            } else {
                intMap.put(curInt, 1);
            }
        }
        int count = 0;
        for(Integer j: intMap.keySet()) {
            if (intMap.get(j) != 1) {
                int k = intMap.get(j)/2;
                count += k;
            }
        }
        return count;
    }

    public static boolean isPalindrome(String word) {
        int len = word.length();
        word.toLowerCase();
        char[] wordChar = word.toCharArray();
        for (int i = 0; i < len; i++) {
            if (wordChar[i] != wordChar[len - 1 -i]) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        int[] array = new int[7];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;  
        array[5] = 5;
        array[6] = 3;
//        int[] rotLeft = rotLeft(array, 13);
//        for (int left : rotLeft) {
//            System.out.println(left);
//        }
        int count = sockMerchant(7, array);
        System.out.println(count);
        
        String agentEmail = "orange", oldPassword = "blue", newPassword = "red";

        StringBuffer graphQLStr = new StringBuffer(100);
        graphQLStr.append("mutation { changeLoggedInPassword( passwordChangeData: {email: \"")
                .append(agentEmail)
                .append("\", oldPassword: \"")
                .append(oldPassword)
                .append("\", newPassword: \"")
                .append(newPassword)
                .append("\"}){ responseCode responseDescription response { code description }  } }");
        
        System.out.println(graphQLStr);
      
    }
}
