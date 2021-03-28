package com.company.assignment4;

import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 8, 6, 1, 3};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int max = -1;
        findTargetIndex(arr, 0, target, max);
    }

    private static void findTargetIndex(int[] arr, int index, int target, int max) {
        if(arr.length == index){
            System.out.println(max);
            return;
        }
        if(arr[index] == target){
            max = index;
        }
       findTargetIndex(arr, index+1, target, max);

    }
}
