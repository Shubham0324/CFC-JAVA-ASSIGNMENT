package com.company.assignment2;

public class Ques8 {

    public static void main(String[] args) {
        // With predefined array
        int[] arr = {5, 45, 23, 63, 27, 80, 15, 2, 65, 30};
        System.out.println(countMul(arr));
    }
    public static int countMul(int[] arr){
        int count = 0;
        for (int val: arr) {
            if(val%5 == 0)count++;
        }
        return count;
    }
}
