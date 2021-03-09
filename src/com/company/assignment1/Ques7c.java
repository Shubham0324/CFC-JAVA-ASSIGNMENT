package com.company.assignment1;
import java.util.Arrays;
import java.util.Scanner;

public class Ques7c {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printPatter(n);


    }

    private static void printPatter(int n) {
        int space = n-1;
        int col = 2*n - 1;

        int[][] arr = new int[n][];
        for (int i = 0; i < 2*n-1 ; i++) {
            for (int j = 1; j < n; j++) {
                arr[i][j] = 1;
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}