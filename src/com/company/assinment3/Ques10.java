package com.company.assinment3;

import java.util.Scanner;

public class Ques10 {
    final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        char[] input = args.length != 0 ? args[0].toCharArray()
                :  sc.next().toCharArray();
        for (int i = 0; i < input.length; i++) {
            input[i] = ( i % 2 == 0) ? (char) (input[i] + 1) : (char) (input[i] - 1);
        }
        System.out.println(input);
    }
}
