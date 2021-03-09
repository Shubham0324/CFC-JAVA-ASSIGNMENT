package com.company.assignment1;

import java.util.Scanner;

public class Ques3 {
    final static Scanner sc = new Scanner(System.in);

    static int gcd(int a, int b)
    {
        if (a == 0)
            return b;

        return gcd(b%a, a);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to GCD Calculator");
        System.out.print("Number A : ");
        int a = sc.nextInt();
        System.out.print("Number B : ");
        int b = sc.nextInt();
        System.out.printf("GCD is is %d %n", gcd(a,b));

    }
}
