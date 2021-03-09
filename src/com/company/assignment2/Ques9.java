package com.company.assignment2;

public class Ques9 {
    public static void main(String[] args) {
        //With predefined array
        int[] arr = {1, 4, 67, 79, 19, 9, 0, 21, 2};
        System.out.println(countPrime(arr));
    }
    public static int countPrime(int[] arr){
        int count = 0;
        for (int val: arr) {
            if (isPrime(val)){
                count++;
            }
        }
        return count;
    }
    public static boolean isPrime(int val){
        if (val == 2)return true;
        if (val <= 1|| val % 2 == 0) return false;
        for (int i = 3; i*i <val ; i++) {
            if (val % i == 0)
                return false;
        }
        return true;
    }
}
