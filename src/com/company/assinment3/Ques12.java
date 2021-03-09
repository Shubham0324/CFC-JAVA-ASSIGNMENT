package com.company.assinment3;

import java.util.Scanner;

public class Ques12 {
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        char[] input = args.length != 0 ? args[0].toCharArray()
                                        :  sc.next().toCharArray();
        System.out.print(input[0]);
        for (int i = 1; i < input.length; i++) {
            int num = Math.abs(input[i-1] - input[i]);
             System.out.printf("%d%c",num, input[i]);
        }
    }
}