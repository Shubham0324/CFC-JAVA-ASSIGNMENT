package com.company.assignment2;

import java.util.Arrays;

public class Ques11 {
    public static void main(String[] args) {
        int[] arr = {5, 45, 23, 63, 27, 80, 15, 2, 65, 30, 31};
        System.out.println("Sorted Array " + Arrays.toString(reverseArray(arr)));
    }

    public static int[] reverseArray(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[length - i - 1];
            arr[length - i -1] = temp;
        }
        return arr;
    }
}
