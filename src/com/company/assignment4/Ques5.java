package com.company.assignment4;

import java.util.Arrays;
import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5};
        reverArray(arr, 0);
    }
    private static void reverArray(int[] arr, int index){
        if(index == arr.length / 2){
            System.out.println(Arrays.toString(arr));
            return;
        }
        int temp = arr[index];
        arr[index] = arr[arr.length-1 - index];
        arr[arr.length - 1 - index] = temp;
        reverArray(arr, index+1);
    }
}
