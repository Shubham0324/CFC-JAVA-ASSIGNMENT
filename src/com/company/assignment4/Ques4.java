package com.company.assignment4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        int[] arr = {0, 4, 2, 2, 1, 2, 3, 4, 2};
        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        findTargetIndex(arr, 0, target, list);
    }

    private static void findTargetIndex(int[] arr, int index, int target, LinkedList<Integer> list) {
        if(arr.length == index){
            System.out.println(Arrays.toString(list.toArray()));
            return;
        }
        if(arr[index] == target){
            list.add(index);
        }
        findTargetIndex(arr, index+1, target, list);

    }
}
