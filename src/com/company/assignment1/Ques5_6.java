package com.company.assignment1;

import java.util.Scanner;

public class Ques5_6 {

    public static String reverseNum(int num) {
        int length = String.valueOf(num).length();
        StringBuilder temp = new StringBuilder();
        for(int i = 0; i< length; i++){
            temp.append(num % 10);
            num = (num / 10);
        }
        return temp.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        System.out.println("The Digits in Numbers is " + String.valueOf(choice).length());
        System.out.println(Integer.parseInt(reverseNum(choice)));

    }
}
