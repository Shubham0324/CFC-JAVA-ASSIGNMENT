package com.company.assignment4;

import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        int sum = 0;
        sum(n, sum);
    }
    private static void sum(int n, int sum) {
        if (n == 0){
            System.out.println(sum);
            return;
        }
        sum += n;
        sum(n-1,sum);
    }
}
