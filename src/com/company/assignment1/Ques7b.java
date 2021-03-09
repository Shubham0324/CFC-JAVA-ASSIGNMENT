package com.company.assignment1;

public class Ques7b {

    public static void pattern(int n, int space) {
        for (int i = 1; i <= n-space; i++) {
            System.out.print(i);
        }
        System.out.println();
        if (space != 0){
            pattern(n, space-1);
        }

    }
    public static void main(String[] args) {
        pattern(5, 4);
    }
}
