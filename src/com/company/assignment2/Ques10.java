package com.company.assignment2;

public class Ques10 {

    public static void main(String[] args) {
        int[] arr = {5, 45, 23, 63, 27, 80, 15, 2, 65, 30};
        System.out.println(isSorted(arr));
    }
    // Program to check the array is sorted increasingly
    public static String isSorted(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] > arr[i+1]) {
            return "Not Sorted";
            }
        }
        return "Sorted";
    }
}
