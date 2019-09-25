package com.rukevwe.learn.InterSwitch;


public class BinarySearch {
    public static void main(String[] args) {
        int[] sortedArray = {10, 20, 40, 50, 60, 70};
//        binarySearchRec(sortedArray, 0, sortedArray.length - 1, 40);
        binarySearch(sortedArray, 65);
    }
    
    private static void binarySearchRec(int[] sortedArray, int first, int last, int key) {
        if (last >= first) {
            int mid = (first + last) / 2;
            if (sortedArray[mid] == key) {
                System.out.println("key found at " + mid);
                return;
            }
            else if (sortedArray[mid] > key) {
                last = mid - 1;
                binarySearchRec(sortedArray, first, last, key);
                return;
            }
            else if (sortedArray[mid] < key) {
                first = mid + 1;
                binarySearchRec(sortedArray, first, last, key);
                return;
            }
          
        }
        System.out.println("Not found");
        
    }
    public static int binarySearch(int arr[], int first, int last, int key){
        if (last>=first){
            int mid = first + (last - first)/2;
            if (arr[mid] == key){
                return mid;
            }
            if (arr[mid] > key){
                return binarySearch(arr, first, mid-1, key);//search in left subarray  
            }else{
                return binarySearch(arr, mid+1, last, key);//search in right subarray  
            }
        }
        return -1;
    }

    private static void binarySearch(int[] sortedArray, int key) {
        int first = 0;
        int last = sortedArray.length - 1;

        while (first <= last) {
            int mid = (first + last) / 2;
            if (sortedArray[mid] == key) {
                System.out.println(mid);
                return;
            }
            else if (sortedArray[mid] < key) {
                first = mid + 1;
            }
            else if (sortedArray[mid] > key) {
                last = mid - 1;
            }
            
        }
        System.out.println("not found");
    }
}
