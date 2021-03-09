package com.company.assignment1;

public class Ques7a {

    public static void pattern(int n, int space) {
        for (int i = 0; i < n-space; i++) {
            System.out.print("* ");
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
