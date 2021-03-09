package com.company.assinment3;

import java.util.Scanner;

public class Ques11 {
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        char[] input = args.length != 0 ? args[0].toCharArray()
                :  sc.next().toCharArray();

        for (char elm: input) {
            System.out.print(Character.isUpperCase(elm) ? Character.toLowerCase(elm) : Character.toUpperCase(elm));
        }
    }
}
