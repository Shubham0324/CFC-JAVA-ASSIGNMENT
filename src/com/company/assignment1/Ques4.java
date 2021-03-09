package com.company.assignment1;

import java.util.Scanner;

public class Ques4 {

    public static void oddJumps(int n){
        for(int j = 0,  k = 1; j<n; j++, k = k + 2*j){
            System.out.print(2 * k + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        oddJumps(choice);
    }
}
